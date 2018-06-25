angular.module('studentSPA').controller('homeCtrl', ['$scope', 'studentSVC', function ($scope, studentSVC) {
    studentSVC.getData()
        .then(function (response) {
            $scope.studentsData = response;
        },
        function (error) {
            console.log("Data not found");
        });

    $scope.editStudent = function (id) {
        window.location.href = '#/edit/' + id;
    }

    $scope.deleteStudent = function (id) {
        window.location.href = '#/delete/' + id;
    }

}]);

