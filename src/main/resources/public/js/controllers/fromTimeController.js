 angular.module('AirApp')
   .controller('fromTimeController', ['$scope', function($scope) {
     $scope.fromTime = {
       value: new Date(1970, 0, 1, 14, 57, 0)
     };
   }]);