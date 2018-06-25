angular.module("modA", ["modB", "modC"])
    .controller("InvoiceController", function ($rootScope, $scope) {
        console.log("inside Invoice controller");
        $rootScope.developer = 'pratik';
        $scope.invoice = {
            date: '13/06/2018',
            cost: 500
        };
    });
angular.module("modB", [])
    .controller("AddressController", function ($scope) {
        console.log("inside Address controller");
        $scope.address = {
            city: 'mumbai',
            state: 'maharashtra'
        };
    });
angular.module("modC", [])
    .controller("OrderController", function ($scope) {
        console.log("inside order controller");
        $scope.product = {
            id: 2001,
            cost: 2000
        };
    });
