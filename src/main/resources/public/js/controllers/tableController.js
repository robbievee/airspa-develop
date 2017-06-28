angular.module('AirApp').controller('tableController', function($scope,$http,$mdToast){
	 $http.get('http://localhost:8080/busstop').
     then(function(response) {
         $scope.busStopList = response.data;
     });
})