/**
 * 
 */
var indapp = angular.module('IndexApp', []);
indapp.controller('BooktypeCountry', ['$scope','$http',
 function($scope,$http) {
          $http.get("/ShowBookType")
                .success(function(result){
                	console.log(result)
                	$scope.booktypes = result
                                     })
                                              }
                                                    ]);

indapp.controller('isloginCountry', [
	 function($scope) {
	         
		 $scope.islogin = function($event, value) {  
		      // console.log(value)  
			 var li="<%=session.getAttribute('code') %>";
			 alert(li)
		      if (value) {  
		        $($event.target).addClass("checked");  
		      } else {  
		        $($event.target).removeClass("checked");  
		      }  
		    }  
	                                   
	                                              }
	                                                    ]);

var indapp = angular.module('IndexApp', []);
indapp.controller('LoginCountry', ["$scope","$http",
 function($scope,$http) {
	 debugger
	 $scope.login = function($event) {  
	 $http({  
         url:'/login',  
         method: 'post',    
         params: { customeraccount: $scope.customeraccount, customerpwd: $scope.customerpwd },//params作为url的参数  
       }).success(function(result){
                	console.log(result)
                
                                     })
                                              }
 }
                                                    ]);