
angular.module("swabhav.controllers", [])
    .run(function ($rootScope) {
        $rootScope.login = false;
        if(localStorage.getItem("flag")=="true"){
            $rootScope.login = true;
        }
        console.log("Login : "+$rootScope.login)
        console.log("flag : "+(localStorage.getItem("flag")))
    })
    .controller('studentCtrl', ['$rootScope', '$scope', '$log', 'dataservice', function ($rootScope, $scope, $log, dataservice) {

        //$scope.changeColor=function(){return {color:blue}}
        $scope.search = function () {
            dataservice.getData().then(function (r) {
                $scope.result = r.data;
                console.log($scope.result);

            });

        };
        function clearInput() {
            $scope.rollNo = null;
            $scope.name = "";
            $scope.age = null;
            $scope.email = null;
            $scope.date = "";
            $scope.ismale = null;
        }
        $scope.deleteStudent = function (rollNo) {
            window.location.href = '#/delete/' + rollNo;
        }
        $scope.studentUpdate = function (rollNo) {
            console.log("edit");
            window.location.href = '#edit/' + rollNo;
        }
        //clearInput();
        $scope.search();


    }])

    .controller('deleteCtrl', ['$rootScope', '$scope', '$routeParams', 'dataservice', function ($rootScope, $scope, $routeParams, dataservice) {
        //if ($rootScope.login==false) {
        console.log($rootScope.login)
        $scope.deleteStudent = function (rollNo) {
            $scope.del = confirm("Are You Sure You Want To Delete This Entry")
            if ($scope.del) {
                dataservice.removeStudent(rollNo).then(function (r) {
                    window.location.href = '#/delete';
                    $scope.search();
                });
            }
        };
        //} else {
        //window.location.href = '#/login';
        //}
    }])
    .controller('editCtrl', ['$rootScope', '$scope', '$routeParams', 'dataservice', function ($rootScope, $scope, $routeParams, dataservice) {
        if ($rootScope.login) {
            $scope.student;
            dataservice.getByID($routeParams.rollNo)
                .then(function (response) {
                    $scope.student = response.data
                    console.log($scope.student.rollNo)
                    $scope.student.date = new Date($scope.student.date);
                    if ($scope.isMale == true)
                        $scope.isMale = true;

                    else {
                        $scope.isMale = false;
                    }

                })
            $scope.studentUpdate = function () {
                dataservice.updateStudent($routeParams.rollNo, $scope.student).then(function (r) {
                    window.location.href = '#/edit';
                })
            }
        } else {
            window.location.href = '#/login';
        }
    }
    ])
    .controller('addCtrl', ['$rootScope', '$scope', '$log', '$location', 'dataservice', function ($rootScope, $scope, $log, $location, dataservice) {
        if ($rootScope.login) {

            $scope.studentAdd = function () {
                var rollNo = $scope.rollNo;
                var name = $scope.name;
                var age = $scope.age;
                var email = $scope.email;
                var date = $scope.date;
                var isMale = false;
                if ($scope.isMale) {
                    var isMale = true;
                }

                var student = {
                    rollNo,
                    name,
                    age,
                    email,
                    date,
                    isMale
                }
                dataservice.addStudent(student).then(function (r) {
                    window.location.href = '/add';

                })
            }
        } else {
            window.location.href = '#/login';
        }
    }])
    .controller('loginCtrl', ['$rootScope', '$scope', '$location', 'loginservice', function ($rootScope, $scope, $location, loginservice) {
        
        var rememberTick;
        $scope.getName = function () {
            if ($rootScope.login == true) {
                $scope.user = localStorage.getItem("user");
            }
            else {
                $scope.user = 'Guest'
            }
            return true;
        }
        $scope.isChecked=function(){
            rememberTick=$scope.remember;
            console.log(rememberTick)
            
        }

        
        $scope.checkCredentials = function () {
            console.log($scope.student.remember);
            if (loginservice.loginSuccess($scope.student.user, $scope.student.pass, $scope.student.remember)) {
                $rootScope.login = true;
                window.location.href = "#/";
            } else {
                console.log("invalid")
            }
        }

    }])
    .controller('logoutCtrl', ['$rootScope', '$scope', '$location', 'loginservice', function ($rootScope, $scope, $location, loginservice) {

        console.log(localStorage.getItem("user"))
        $scope.checkLogin = function () {
            if ($rootScope.login == true) {
                return true
            }

            return false;
        }
        $scope.redirect = function () {
            $scope.user = 'Guest'
            console.log($scope.user)
            localStorage.removeItem("user");
            localStorage.setItem("flag",false);
            $rootScope.login = false;
            window.location.href = "#/";
        }


    }])

angular.module("swabhav.controllers").service('dataservice', ['$http', function ($http) {
    var url = "http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/";

    this.getData = (function () {
        return $http.get(url);
    })
    this.getByID = (function (rollNo) {
        console.log("inside id")
        return $http.get(url + rollNo);
    })
    this.removeStudent = (function (studentID) {
        return $http.delete(url + studentID);
    })
    this.addStudent = (function (student) {
        return $http.post(url, student);
    })
    this.updateStudent = (function (studentID, student) {
        return $http.put(url + studentID, student);
    })
}]);
angular.module("swabhav.controllers").service('loginservice', ['$http', function ($http) {
    var login = {
        'pratik': '123456',
        'himanshu': '123'
    }


    this.loginSuccess = function (user, password, remember) {
        var loginValid = false;
        console.log(remember)
        
        if (login[user] == password) {
            loginValid = true;
            localStorage.setItem("user", user);
            console.log(loginValid)

        }
        if(remember&&loginValid){
            localStorage.setItem("flag", true);
        }

        return loginValid;
    }
    

}


])