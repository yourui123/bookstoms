package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Data;

import entlty.CustomerInfo;
import net.sf.json.JSONObject;
import service.RegisterService;
import toolutil.Md5;

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
    private List<Map<String, Object>> Register(String form) {
		// TODO 自动生成的方法存根
        System.out.println(form);
    	try {
			JSONObject object = JSONObject.fromObject(form);
			CustomerInfo customerInfo = new CustomerInfo();
			/*{"customercame":"1","customerpwd":"1","customertruename":"1","customertel":"1",
				"customeraddr":"1","customersex":"男","customerques":"1","customeranswer":"1"}*/
			//客户名称
			customerInfo.setCustomercame(object.getString("customercame"));
			//客户密码
			customerInfo.setCustomerpwd(Md5.encryptPassword(object.getString("customerpwd")));
			//客户真实姓名
			customerInfo.setCustomertruename(object.getString("customertruename"));
			//客户电话
			customerInfo.setCustomertel(object.getString("customertel"));
			//客户地址
			customerInfo.setCustomeraddr(object.getString("customeraddr"));
			//客户问答
			customerInfo.setCustomeranswer(object.getString("customeranswer"));
			//客户邮箱
			customerInfo.setCustomeremail(object.getString("customeremail"));
			//客户登陆次数
			customerInfo.setCustomerlogtime("0");
			//客户密保问题
			customerInfo.setCustomerques(object.getString("customerques"));
			//客户注册日期
			customerInfo.setCustomerregtime((new Date()));
			return registerService.Register(customerInfo);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			List<Map<String, Object>> reList = new ArrayList<Map<String, Object>>();
	    	  Map<String, Object> map = new HashMap<String, Object>();
		     map.put("result", 0);
  		     map.put("msg", "请填完");
  		      reList.add(map);
  		      return reList;
			
		}
    	
    	
	}
}
