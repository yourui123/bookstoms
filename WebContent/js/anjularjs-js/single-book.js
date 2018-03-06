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


singbookapp.controller('bookfullinfo', function($rootScope, $location,$http) {


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
	                		$rootScope.bookfulinfo = result.bookinfo[0];
	                		if(result.bookshop != ''&& result.bookshop != null){
	                			$rootScope.bookshop1 = result.bookshop[0];
	                		}
	                    	debugger
	                    	 $http({
	                  		   url:'/showbooksbytype',  
	                	         method: 'get',    
	                	         params: { "book": $rootScope.bookfulinfo},
	                	         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
	                	         dataType:'json',
	                  	   }).success(function(result){
	                  		   debugger
	                  		   $rootScope.bookinfobytype = result.bookinfobytype
	                  		   console.log(result.bookinfobytype)
	                  	   })
	                    	
	                    	}
	                
	                                     })
	   
         $rootScope.addshopbook= function($event) {  
			 debugger
			console.log($rootScope.bookfulshop)
			console.log($rootScope.bookfulinfo)
		 $http({  
	         url:'/addbookshop',  
	         method: 'post',    
	         params: { "bookshop": $rootScope.bookshop1,"bookinfo": $rootScope.bookfulinfo},
	         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
	         dataType:'json',
	       }).success(function(result){
	    	   debugger
	    	   
	                	console.log(result)
	             /*   	var id = jQuery.session.get("customer");*/
	                	if(result.msg == "success"){
	                		alert(result.msg);
	                		
	                	
	                	
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
				
	                 $scope.addordermount = function($event){
	                	 debugger
	                	this.bookfullshop.ordermount++
	                	this.bookfullshop.price = this.bookfullshop.ordermount*this.bookfullshop.bookinfo[0].bookprprice
	                	$rootScope.count = Number($rootScope.count)+Number(this.bookfullshop.bookinfo[0].bookprprice)
	                 }   
	                 $scope.addnewordermount = function($event){
	                	 debugger
	                	this.bookshop1.ordermount++
	                	
	                	
	                 }   
	                 $scope.jianordermount = function($event){
	                	 debugger
	                	this.bookfullshop.ordermount--
	                	this.bookfullshop.price = this.bookfullshop.ordermount*this.bookfullshop.bookinfo[0].bookprprice
	                	$rootScope.count = $rootScope.count-this.bookfullshop.bookinfo[0].bookprprice
	                 } 
	                 $scope.jiannewordermount = function($event){
	                	 debugger
	                	this.bookshop1.ordermount--
	                
	                	
	                 } 
	                 $scope.relod = function($event){
	                
	                
	                	
	                 } 
	                 $scope.savebookshop = function($event){
	                	 debugger
	                	 console.log($rootScope.bookshop)
	                	 var te = $rootScope.bookshop;
	                	 var rel = '';
	                	 for(var i = 0;i<te.length;i++){
	                		 var a = "["+JSON.stringify($rootScope.bookshop[i])+"],";
	                		 rel=rel+a
	                	 }
	                	 $http({  
	         url:'/seavebookshop',  
	         method: 'post',    
	         params: { "bookshops": JSON.stringify($rootScope.bookshop)},
	         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
	         dataType:'json',
	       }).success(function(result){
	    	   debugger
	    	   
	                	console.log(result)
	             /*   	var id = jQuery.session.get("customer");*/
	                	if(result.msg == "success"){
	                		alert(result.msg);
	                		
	                	
	                	
	                	}
	                
	                                     })
	                	 
	                 }
		                                   
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

