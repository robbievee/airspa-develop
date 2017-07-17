angular.module('AirApp').controller('departuresController',['$scope','$http', function($scope,$http){
	 $http.get('http://localhost:8080/busstop/list').
    then(function(response) {
        $scope.departuresList = response.data;
    });
	 
//	 var e = document.getElementById("ddlViewBy");
//	 var strUser = e.options[e.selectedIndex].value;
//	 console.log(strUser);
}
]);

