/**
 * 
 */
var indapp = angular.module('IndexApp', [ 'ngRoute', 'ngAnimate']);

indapp.config(function($routeProvider) {
    $routeProvider.when('/main', {
        templateUrl: 'page/main.html',
        controller: 'BookOrderBYsellController'
    }).otherwise({
        redirectTo: '/main'
    })
});
indapp.controller('BooktypeCountry', ['$scope','$http',
 function($scope,$http) {
          $http.get("/ShowBookType")
                .success(function(result){
                	console.log(result)
                	$scope.booktypes = result
                                     })
                                              }
                                                    ]);

indapp.service('getssion',  function() {
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

indapp.controller('load', ["$scope","$http","$rootScope","getssion",
	 function($scope,$http,$rootScope,getssion) {
	         
                 debugger
			 getssion.getsession($http,$rootScope);
                 $scope.addordermount = function($event){
                	 debugger
                	this.bookfullshop.ordermount++
                	this.bookfullshop.price = this.bookfullshop.ordermount*this.bookfullshop.bookinfo[0].bookprprice
                	$rootScope.count = Number($rootScope.count)+Number(this.bookfullshop.bookinfo[0].bookprprice)
                 }   
                 $scope.jianordermount = function($event){
                	 debugger
                	this.bookfullshop.ordermount--
                	this.bookfullshop.price = this.bookfullshop.ordermount*this.bookfullshop.bookinfo[0].bookprprice
                	$rootScope.count = $rootScope.count-this.bookfullshop.bookinfo[0].bookprprice
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
                	var id = jQuery.session.get("customer");
                	if(result.msg == "success"){
                		alert(result.msg);
                		
                	
                	
                	}
                
                                     })
                	 
                 }
	                                   
	                                              
			
		        
	                                   
	                                              }
	                                                    ]);

indapp.controller('LoginCountry', ["$scope","$http","$rootScope","getssion",
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
                	
                	if(result[0].msg == "success"){
                		getssion.getsession($http,$rootScope);
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















