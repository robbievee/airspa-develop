angular.module('AirApp').controller('datePickerController',['$scope', function() {
  this.myDate = new Date();
  this.isOpen = false;
}
]);