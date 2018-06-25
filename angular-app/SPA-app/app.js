angular.module("spa-app", ["ngRoute", "swabhav.controllers"])
    .config(['$routeProvider',function($routeProvider){
        $routeProvider.when("/",{
        templateUrl : "partial/home.html",
        controller:"homeCtrl"
            })
            .when("/about",{
        templateUrl : "partial/about.html",
        controller:"aboutCtrl"
            })
            .when("/careers",{
        templateUrl : "partial/careers.html",
        controller:"careerCtrl"
            })
            .when("/home",{
        templateUrl : "partial/home.html",
        controller:"homeCtrl"
            });
            
            
    }])

    