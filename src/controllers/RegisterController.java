package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Data;

import entlty.CustomerInfo;
import net.sf.json.JSONObject;
import service.RegisterService;

@Controller
public class RegisterController {
	
    @Autowired
    private RegisterService registerService;

	public RegisterController(RegisterService registerService) {
		super();
		this.registerService = registerService;
	}
	
    @PostMapping("/register")
    @ResponseBody
    private void Register(String form) {
		// TODO 自动生成的方法存根
        
    	JSONObject object = JSONObject.fromObject(form);
    	CustomerInfo customerInfo = new CustomerInfo();
    	customerInfo.setCustomercame(object.getString("customercame"));
    	customerInfo.setCustomeraddr(object.getString("customeraddr"));
    	customerInfo.setCustomeranswer(object.getString("customeranswer"));
    	customerInfo.setCustomeremail(object.getString("customeremail"));
    	customerInfo.setCustomerpwd(object.getString("customerpwd"));
    	customerInfo.setCustomerques(object.getString("customerques"));
    	customerInfo.setCustomerregtime(new Data().toString());
    	
    	
	}
}
