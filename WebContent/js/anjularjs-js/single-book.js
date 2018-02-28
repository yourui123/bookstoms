/**
 * 
 */
var singbookapp = angular.module("singlebookapp",[]);

singbookapp.config(['$locationProvider', function($locationProvider) {  
        // $locationProvider.html5Mode(true);  
        $locationProvider.html5Mode({
         enabled: true,
         requireBase: false
       });
       }]);


       app.controller('bookfullinfo', function($scope, $location) {


         console.log($location.search().name);
         console.log($location.search().age);
         console.log($location.search().gender);

       }); 
