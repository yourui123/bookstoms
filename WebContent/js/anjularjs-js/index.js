/**
 * 
 */
var indapp = angular.module('IndexApp', [ 'ngRoute', 'ngAnimate']);

indapp.config(function($routeProvider) {
    $routeProvider.when('/main', {
        templateUrl: 'page/main.html',
        controller: 'BookOrderBYsellController'
    }).when('/singlebook', {
        templateUrl: 'page/single-book.html',
        controller: 'bookfullinfo'
    }).otherwise({
        redirectTo: '/main'
    })
});

indapp.controller('navcontroller',['$scope','$http', 
	function($scope,$http){
	 $scope.zx = function($event) {  
		 
		 alert($scope.customerpwd)
	 $http({  
         url:'/qksession',  
         method: 'post',    
         data: {},
         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
         transformRequest: function (data) {
             return $.param(data);
         },
         dataType:'json',
       }).success(function(result){
    	   
    	   
    	   window.location.reload();

                	
                	
                
                                     })
                                              }
}]) 

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
    	   
    	   
                	console.log(result)
                	if(result != ''&&result != null){
                		
                		console.log(result)
                		$rootScope.custom =result;
                    	$rootScope.islogin = true;
                    	$rootScope.bookshop = result.shopbook;
                    	var pri = 0;
                    	for(var i = 0;i<result.shopbook.length;i++){
                    		pri+=result.shopbook[i].price;
                    	}
                    	$rootScope.count = pri;
                    	
                    	
                    	
                   
                    	
                    	}
                
                                     })
	                                              }
	}
	                                                    );

indapp.controller('load', ["$scope","$http","$rootScope","getssion",
	 function($scope,$http,$rootScope,getssion) {
	         
                 
			 getssion.getsession($http,$rootScope);
                 $scope.addordermount = function($event){
                	 
                	this.bookfullshop.ordermount++
                	this.bookfullshop.price = this.bookfullshop.ordermount*this.bookfullshop.bookinfo[0].bookprprice
                	$rootScope.count = Number($rootScope.count)+Number(this.bookfullshop.bookinfo[0].bookprprice)
                 }   
                 $scope.jianordermount = function($event){
                	 
                	this.bookfullshop.ordermount--
                	this.bookfullshop.price = this.bookfullshop.ordermount*this.bookfullshop.bookinfo[0].bookprprice
                	$rootScope.count = $rootScope.count-this.bookfullshop.bookinfo[0].bookprprice
                 } 
                 $scope.savebookshop = function($event){
                	 
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
	 
	 $scope.login = function($event) {  
		 
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
    	   
    	   
                	console.log(result)
                	
                	if(result[0].msg == "success"){
                		getssion.getsession($http,$rootScope);
                	
                	$("#modal-login-big").modal('hide');
                	
                	}
                
                                     })
                                              }
	 $scope.getregister = function(){
		
		 $scope.zc = true;
		 $scope.dl = false;
	 }
	 $scope.ret = function(){
		 
		 $scope.zc = false;
		 $scope.dl = true;
	 }
	 $scope.register = function($event){
		 $http({  
	         url:'/register',  
	         method: 'post',    
	         data: { "form": JSON.stringify($scope.form)},
	         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
	         transformRequest: function (data) {
	             return $.param(data);
	         },
	         dataType:'json',
	       }).success(function(result){
	    	   
	    	   
	                	console.log(result)
	                	alert(result[0].msg)
	                	if(result[0].result == 1){
	                	 $scope.zc = false;
	               		 $scope.dl = true;
	                
	                	
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
        	
        	$http.get("/showBookOrderbyplice")
            .success(function(result){
            	console.log(result)
            	$scope.pbooks = result
                                 })
                             })
    $scope.addcat = function(book){
			window.location.href="index.html#/singlebook?bookid="+book.bookid;
		}
}
])

indapp.controller("BookOrderBYpliceController", ["$scope","$http",
	function($scope,$http){
		
    $scope.addcat = function(book){
			window.location.href="index.html#/singlebook?bookid="+book.bookid;
		}
}
])



//自定义
indapp.filter('rmb',function(){     
	
	return function(price){    
		
		return "￥"+price;
	
}
	});

indapp.controller('bookfullinfo', function($rootScope, $location,$http) {


    console.log($location.search().bookid);
    $http({  
        url:'/getfullbook',  
        method: 'get',    
        params: { "bookid": $location.search().bookid},
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        dataType:'json',
      }).success(function(result){
   	   
   	   
               	console.log(result)
            /*   	var id = jQuery.session.get("customer");*/
               	if(result != ''&&result != null){
               		$rootScope.bookfulinfo = result.bookinfo[0];
               		if(result.bookshop != ''&& result.bookshop != null){
               			$rootScope.bookshop1 = result.bookshop[0];
               		}
                   	
                   	 $http({
                 		   url:'/showbooksbytype',  
               	         method: 'get',    
               	         params: { "book": $rootScope.bookfulinfo},
               	         headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
               	         dataType:'json',
                 	   }).success(function(result){
                 		   
                 		   $rootScope.bookinfobytype = result.bookinfobytype
                 		   console.log(result.bookinfobytype)
                 	   })
                   	
                   	}
               
                                    })
  
    $rootScope.addshopbook= function($event) {  
		 
		console.log($rootScope.bookfulshop)
		console.log($rootScope.bookfulinfo)
	 $http({  
        url:'/addbookshop',  
        method: 'post',    
        params: { "bookshop": $rootScope.bookshop1,"bookinfo": $rootScope.bookfulinfo},
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        dataType:'json',
      }).success(function(result){
   	   
   	   
               	console.log(result)
            /*   	var id = jQuery.session.get("customer");*/
               	if(result.msg == "success"){
               		alert(result.msg);
               		
               	
               	
               	}
               
                                    })
                                             }

  }); 
indapp.controller('load', ["$scope","$http","$rootScope","getssion",
	 function($scope,$http,$rootScope,getssion) {
	         
                  
			 getssion.getsession($http,$rootScope);
			
                $scope.addordermount = function($event){
               	 
               	this.bookfullshop.ordermount++
               	this.bookfullshop.price = this.bookfullshop.ordermount*this.bookfullshop.bookinfo[0].bookprprice
               	$rootScope.count = Number($rootScope.count)+Number(this.bookfullshop.bookinfo[0].bookprprice)
                }   
                $scope.addnewordermount = function($event){
               	 
               	this.bookshop1.ordermount++
               	
               	
                }   
                $scope.jianordermount = function($event){
               	 
               	this.bookfullshop.ordermount--
               	this.bookfullshop.price = this.bookfullshop.ordermount*this.bookfullshop.bookinfo[0].bookprprice
               	$rootScope.count = $rootScope.count-this.bookfullshop.bookinfo[0].bookprprice
                } 
                $scope.jiannewordermount = function($event){
               	 
               	this.bookshop1.ordermount--
               
               	
                } 
                $scope.relod = function($event){
               
               
               	
                } 
                $scope.savebookshop = function($event){
               	 
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
   	   
   	   
               	console.log(result)
            /*   	var id = jQuery.session.get("customer");*/
               	if(result.msg == "success"){
               		alert(result.msg);
               		
               	
               	
               	}
               
                                    })
               	 
                }
	                                   
	                                              }
	                                                    ]);














