angular.module('AirApp').controller(
		'formController',
		[
				'$scope',
				'$http',
				function($scope, $http) {

					$http.get('http://localhost:8080/busstop/list').then(
							function(response) {
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
					
					$scope.showDeparture = function() {
						var departureCode = document.getElementById(
								"departureOption").getAttribute("value");
						var departureName = document
								.getElementById("departureOption").innerText;
						var arrivalCode = document.getElementById(
								"arrivalOption").getAttribute("value");
						var arrivalName = document
								.getElementById("arrivalOption").innerText;

						console.log(departureCode + " " + departureName);
						console.log(arrivalCode + " " + arrivalName);
						console.log($scope.myDate);
						console.log($scope.fromTime.value);
						console.log($scope.toTime.value);
					};
				} ]);