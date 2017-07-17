angular.module('AirApp').controller('arrivalsController',['$scope','$http', function($scope,$http){
	 $http.get('http://localhost:8080/busstop/list').
    then(function(response) {
        $scope.arrivalsList = response.data;
    });
}
]);

