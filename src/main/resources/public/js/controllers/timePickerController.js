 angular.module('AirApp')
   .controller('timePickerController', ['$scope', function($scope) {
     $scope.example = {
       value: new Date(1970, 0, 1, 14, 57, 0)
     };
   }]);