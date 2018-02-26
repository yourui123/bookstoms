package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CustomerDao;

@Service
public class LoginService {
       @Autowired
       private CustomerDao customerDao;

	   public LoginService(CustomerDao customerDao) {
	
	   this.customerDao = customerDao;
	}
       
       public Boolean login(String customeraccount,String customerpwd){
    	   Boolean islogin = false;
    	   if(!customerDao.LoginByemile(customeraccount,customerpwd).equals(null)){
    		   islogin = true;
    	   }
    	   if(!customerDao.LoginBytel(customeraccount,customerpwd).equals(null)){
    		   islogin = true;
    	   }
    	   if(!customerDao.LoginByname(customeraccount,customerpwd).equals(null)){
    		   islogin = true;
    	   }
		return null;   
		
       }
}
