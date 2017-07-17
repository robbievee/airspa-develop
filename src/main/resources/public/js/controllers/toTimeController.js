 angular.module('AirApp')
   .controller('toTimeController', ['$scope', function($scope) {
     $scope.toTime = {
       value: new Date(1970, 0, 1, 14, 57, 0)
     };
   }]);