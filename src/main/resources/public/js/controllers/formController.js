angular.module('AirApp').controller('formController',
  [ '$scope', '$http', function($scope, $http) {

   $http.get('http://localhost:8080/busstop/list').then(function(response) {
    $scope.busStopList = response.data;
   });

   $scope.myDate = new Date();
   $scope.isOpen = false;

   $scope.fromTime = {
    value : new Date(1970, 0, 1, 14, 00, 0)
   };

   $scope.toTime = {
    value : new Date(1970, 0, 1, 15, 00, 0)
   };

   function computeStationName(code) {
    for (let stop in $scope.busStopList) {
     if (code === $scope.busStopList[stop].codeStop) {
      return $scope.busStopList[stop].name;
     }
    }
   }

   $scope.showDeparture = function() {
    var departureCode = $scope.departure;
    var departureName = computeStationName($scope.departure);
    var arrivalCode = $scope.arrival;
    var arrivalName = computeStationName($scope.arrival);

    console.log(departureCode + " " + departureName);
    console.log(arrivalCode + " " + arrivalName);
    console.log($scope.myDate);
    console.log($scope.fromTime.value);
    console.log($scope.toTime.value);
   };
  } ]);