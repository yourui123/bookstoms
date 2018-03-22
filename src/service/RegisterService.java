package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CustomerDao;
import entlty.CustomerInfo;

@Service
public class RegisterService {
      @Autowired
      private CustomerDao customerDao;

	public RegisterService(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}
      public List<Map<String, Object>> Register(CustomerInfo customerInfo){
    	  List<Map<String, Object>> reList = new ArrayList<Map<String, Object>>();
    	  Map<String, Object> map = new HashMap<String, Object>();
    	  if(customerDao.seavecustomer(customerInfo)>0){
    		 
    		  map.put("result", 1);
    		  map.put("msg", "注册成功");
    	  }
    	  reList.add(map);
    	  return reList;
      }
}
