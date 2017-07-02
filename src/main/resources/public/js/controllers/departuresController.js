angular.module('AirApp').controller('departuresController',['$scope','$http', function($scope,$http){
	 $http.get('http://localhost:8080/busstop/list').
    then(function(response) {
        $scope.busStopList = response.data;
        $scope.departures = getBusStopNamesList($scope.busStopList);
    });
}
]);


function getBusStopNamesList(busStopList){
	var busStopNameList = [];
    for (var i=0; i < busStopList.length; i++) {
    	busStopNameList[i] = busStopList[i].name;
    }        
    return busStopNameList;    
};