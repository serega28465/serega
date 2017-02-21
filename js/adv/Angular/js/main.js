var myApp = angular.module('myApp', []);
myApp.controller('myCtr', function($scope){
    $scope.name = "Angola";
    $scope.data = countries;
    $scope.delete = function(i){
        countries.splice(countries.indexOf(i), 1);
    }
    $scope.change = function (i) {
        i.name = prompt("put a name", i.name);
        i.code = prompt("put a code", i.code);
    }
    $scope.addCountry = function () {
        var newObject = {
            name: prompt("Enter the name"),
            code: prompt("Enter the code"),
        }
        $scope.data.push(newObject);
    }
});