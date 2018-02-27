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

/*indapp.controller('isloginCountry', [
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
	                                                    ]);*/

indapp.controller('LoginCountry', ["$scope","$http","$rootScope",
 function($scope,$http,$rootScope) {
	 debugger
	 $scope.login = function($event) {  
		 debugger
		 alert($scope.customerpwd)
	 $http({  
         url:'/login',  
         method: 'post',    
         data: { "customeraccount": $scope.customeraccount,"customerpwd": $scope.customerpwd},
         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
         transformRequest: function (data) {
             return $.param(data);
         },
         dataType:'json',
       }).success(function(result){
    	   debugger
    	   
                	console.log(result)
                	if(result[0].msg == "success"){
                	$rootScope.custom = result[0].customer;
                	$rootScope.islogin = true;
                	debugger
                	$("#modal-login-big").modal('hide');
                	
                	}
                
                                     })
                                              }
 }
             ]);
indapp.controller("BookOrderBYsellController", ["$scope","$http",
	function($scope,$http){
		$http.get("/showBookOrderbysell")
        .success(function(result){
        	console.log(result)
        	$scope.books = result
                             })
}
])



//自定义
indapp.filter('rmb',function(){     
	
	return function(price){    
		
		return "￥"+price;
	
}
	});















