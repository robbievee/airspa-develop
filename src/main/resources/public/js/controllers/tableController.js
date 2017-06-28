angular.module('AirApp').controller('tableController', function($scope,$http){
	 $http.get('http://localhost:8080/busstop/list').
     then(function(response) {
         $scope.busStopList = response.data;
     });
})