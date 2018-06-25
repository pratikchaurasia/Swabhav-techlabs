angular.module("swabhav.controllers",[])
    .controller('homeCtrl',['$scope','$log', function($scope,$log){    
        $log.info("Inside home");
        $scope.htmlData="we are inside home";
    }])
    .controller('aboutCtrl',['$scope','$log', function($scope,$log){
        $log.info("Inside about");
        $scope.aboutData="we are inside about";
    }])
    .controller('careerCtrl',['$scope','$log', function($scope,$log){
        $log.info("Inside career");
        $scope.careerData="we are inside career";
    }]);