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


singbookapp.controller('bookfullinfo', function($scope, $location,$http) {


         console.log($location.search().bookid);
         $http({  
	         url:'/getfullbook',  
	         method: 'get',    
	         params: { "bookid": $location.search().bookid},
	         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
	         dataType:'json',
	       }).success(function(result){
	    	   debugger
	    	   
	                	console.log(result)
	             /*   	var id = jQuery.session.get("customer");*/
	                	if(result != ''&&result != null){
	                		$scope.bookfulinfo = result.bookinfo[0];
	                		if(result.bookshop != ''&& result.bookshop != null){
	                		$scope.bookfulshop = result.bookshop[0];
	                		}
	                    	debugger
	                   
	                    	
	                    	}
	                
	                                     })
	   
         $scope.addshopbook= function($event) {  
			 debugger
			console.log($scope.bookfulshop)
			console.log($scope.bookfulinfo)
		 $http({  
	         url:'/addbookshop',  
	         method: 'post',    
	         params: { "bookshop": $scope.bookfulshop,"bookinfo": $scope.bookfulinfo},
	         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
	         dataType:'json',
	       }).success(function(result){
	    	   debugger
	    	   
	                	console.log(result)
	             /*   	var id = jQuery.session.get("customer");*/
	                	if(result[0].msg == "success"){
	                		getssion.getsession($http,$rootScope);
	                	debugger
	                	$("#modal-login-big").modal('hide');
	                	
	                	}
	                
	                                     })
	                                              }

       }); 
singbookapp.controller('BooktypeCountry', ['$scope','$http',
	 function($scope,$http) {
	          $http.get("/ShowBookType")
	                .success(function(result){
	                	console.log(result)
	                	$scope.booktypes = result
	                                     })
	                                              }
	                                                    ]);

	singbookapp.service('getssion',  function() {
		this.getsession = function($http,$rootScope){ 
			$http({  
	         url:'/getsession',  
	         method: 'get',    
	         params: { "name": "customer"},
	         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
	         dataType:'json',
	       }).success(function(result){
	    	   debugger
	    	   
	                	console.log(result)
	             /*   	var id = jQuery.session.get("customer");*/
	                	if(result != ''&&result != null){
	                		debugger
	                		console.log(result)
	                		$rootScope.custom =result;
	                    	$rootScope.islogin = true;
	                    	$rootScope.bookshop = result.shopbook;
	                    	var pri = 0;
	                    	for(var i = 0;i<result.shopbook.length;i++){
	                    		pri+=result.shopbook[i].price;
	                    	}
	                    	$rootScope.count = pri;
	                    	
	                    	debugger
	                   
	                    	
	                    	}
	                
	                                     })
		                                              }
		}
		                                                    );

	singbookapp.controller('load', ["$scope","$http","$rootScope","getssion",
		 function($scope,$http,$rootScope,getssion) {
		         
	                 debugger
				 getssion.getsession($http,$rootScope);
				
			        
		                                   
		                                              }
		                                                    ]);

	singbookapp.controller('LoginCountry', ["$scope","$http","$rootScope","getssion",
	 function($scope,$http,$rootScope,getssion) {
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
	             /*   	var id = jQuery.session.get("customer");*/
	                	if(result[0].msg == "success"){
	                		getssion.getsession($http,$rootScope);
	                	debugger
	                	$("#modal-login-big").modal('hide');
	                	
	                	}
	                
	                                     })
	                                              }
	 }
	             ]);
	singbookapp.controller("BookOrderBYsellController", ["$scope","$http",
		function($scope,$http){
			$http.get("/showBookOrderbysell")
	        .success(function(result){
	        	console.log(result)
	        	$scope.books = result
	                             })
	}
	])



	//自定义
	singbookapp.filter('rmb',function(){     
		
		return function(price){    
			
			return "￥"+price;
		
	}
		});

