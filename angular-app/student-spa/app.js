angular.module("student-spa", ["ngRoute", "swabhav.controllers"])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when("/students", {
            templateUrl: "partial/students.html",
            controller: "studentCtrl"
        })
        $routeProvider.when("/", {
            templateUrl: "partial/students.html",
            controller: "studentCtrl"
        })
        $routeProvider.when("/delete", {
            templateUrl: "partial/students.html",
            controller: "studentCtrl"
        })
        $routeProvider.when("/add", {
            templateUrl: "partial/add.html",
            controller: "addCtrl"
        })
        $routeProvider.when("/edit/:rollNo", {
            templateUrl: "partial/edit.html",
            controller: "editCtrl"
        })
        $routeProvider.when("/login", {
            templateUrl: "partial/login.html",
            controller: "loginCtrl"
        })

    }])