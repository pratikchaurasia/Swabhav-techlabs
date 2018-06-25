angular.module('studentSPA').factory('studentSVC', ['$rootScope', '$http', '$q', 'APIURL', function ($rootScope, $http, $q, APIURL) {
    var obj = {};
    $rootScope.studentData;
    obj.getData = function () {
        var defer = $q.defer();
        $http.get(APIURL)
            .then(function (response) {
                $rootScope.studentData = response.data;
                defer.resolve(response.data);
            },
            function (error) {
                $rootScope.studentData = error;
                defer.reject(error.data);
            });
        return defer.promise
    }

    obj.getByID = function (id) {
        var defer = $q.defer();
        $http.get(APIURL + id)
            .then(function (response) {
                defer.resolve(response.data);
            },
            function (error) {
                $rootScope.studentData = error;
                defer.reject(error.data);
            });
        return defer.promise
    }

    obj.deleteStudent = function (rollNo) {
        $http.delete(APIURL + rollNo)
            .then(function (response) {
                window.location.href = '#/';
            },
            function (error) {
                console.log("Data Deleted");
            });
    }

    obj.addStudent = function (student) {
        $http.post(APIURL, student)
            .then(function (response) {
                window.location.href = '#/';
            },
            function (error) {
                console.log(response);
            });
    }

    obj.update = function (id, student) {
        $http.put(APIURL + id, student)
            .success(function (data, status, headers) {
                window.location.href = '#/';
            }).error(function (data, status, header, config) {
                console.log("Data Update Failed");
            });
    }
    return obj;
}]);

angular.module('studentSPA').constant("APIURL", "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/");

