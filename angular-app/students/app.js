angular.module('studentSPA', ['ngRoute']).config(['$routeProvider', initializeController])

function initializeController($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "partialTemplates/home.html",
            controller: "homeCtrl"
        })
        .when("/home", {
            templateUrl: "partialTemplates/home.html",
            controller: "homeCtrl"
        })
        .when("/edit", {
            templateUrl: "partialTemplates/edit.html",
            controller: "editStudentCtrl"
        })
        .when("/edit/:id", {
            templateUrl: "partialTemplates/edit.html",
            controller: "editStudentCtrl"
        })
        .when("/delete/:id", {
            templateUrl: "partialTemplates/delete.html",
            controller: "deleteStudentCtrl"
        })
        .when("/add", {
            templateUrl: "partialTemplates/add.html",
            controller: "addStudentCtrl"
        })
};