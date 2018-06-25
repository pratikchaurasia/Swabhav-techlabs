angular.module('studentSPA').controller('deleteStudentCtrl', ['$scope', 'studentSVC', '$routeParams', function ($scope, studentSVC, $routeParams) {
    studentSVC.deleteStudent($routeParams.id);
}]);