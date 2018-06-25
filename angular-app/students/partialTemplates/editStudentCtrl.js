angular.module('studentSPA').controller('editStudentCtrl', ['$scope', '$routeParams', 'studentSVC', function ($scope, $routeParams, studentSVC) {

    studentSVC.getByID($routeParams.id)
        .then(function (response) {
            $scope.student = response;
            if ($scope.student.isMale) {
                $scope.gender1 = "Male";
            }
            else {
                $scope.gender2 = "Female";
            }
        },
        function (error) {
            console.log("Data not found");
        });

    $scope.editStudent = function () {
        var isMale = $scope.gender == 'Male' ? 'true' : 'false';

        var student = {
            "age": $scope.student.age,
            "date": $scope.student.date,
            "email": $scope.student.email,
            "name": $scope.student.name,
            "RollNo": $scope.student.rollNo,
            "isMale": isMale,
        }
        studentSVC.update($routeParams.id, student);
    }

}]);