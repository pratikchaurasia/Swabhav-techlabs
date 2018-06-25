angular.module("swabhav.controllers").filter('gender', function () {
    return function (isMale) {
        console.log(isMale);
        if (isMale) {
            return "male"
        }
        return "female";

    }
    

})


    
