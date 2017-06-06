//jshint strict: false
module.exports = function(config) {
	config.set({
		basePath : './',

		files : [ 'bower_components/angular/angular.js',
			'bower_components/angular-route/angular-route.js',
			'bower_components/angular-mocks/angular-mocks.js',
			'js/**/*.js',
			'test/*.js'],

		autoWatch : true,

		frameworks : [ 'jasmine' ],

		browsers : [ 'Firefox' ],

		plugins : [ 'karma-chrome-launcher', 'karma-firefox-launcher',
			'karma-jasmine' ],

		junitReporter : {
			outputFile : 'test_out/unit.xml',
			suite : 'unit'
		}
	});
};