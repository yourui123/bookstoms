package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CustomerDao;
import entlty.CustomerInfo;

@Service
public class LoginService {
       @Autowired
       private CustomerDao customerDao;

	   public LoginService(CustomerDao customerDao) {
	
	   this.customerDao = customerDao;
	}
       
       public CustomerInfo login(String customeraccount,String customerpwd){
    	   CustomerInfo islogin = null;
    	   islogin=customerDao.LoginByemile(customeraccount,customerpwd);
    	   if(customerDao.LoginByemile(customeraccount,customerpwd)!=null){
    		   islogin = customerDao.LoginByemile(customeraccount,customerpwd);
    	   }
    	   if(customerDao.LoginBytel(customeraccount,customerpwd)!=null){
    		   islogin = customerDao.LoginBytel(customeraccount,customerpwd);
    	   }
    	   if(customerDao.LoginByname(customeraccount,customerpwd)!=null){
    		   islogin = customerDao.LoginByname(customeraccount,customerpwd);
    	   }
    	   if(islogin !=null){
    		   
    	   }
		return islogin;   
		
       }
}
