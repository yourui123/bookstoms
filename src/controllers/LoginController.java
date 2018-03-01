package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import entlty.CustomerInfo;
import service.LoginService;
import service.OrderesService;
import service.ShopBookService;

@SessionAttributes("customer")
@Controller
public class LoginController {
	   @Autowired
	   private LoginService loginservice;
	   private ShopBookService shopBookService;
	   private OrderesService orderesService;
	   
	   
	   public LoginController(LoginService loginservice, ShopBookService shopBookService, OrderesService orderesService) {
		super();
		this.loginservice = loginservice;
		this.shopBookService = shopBookService;
		this.orderesService = orderesService;
	}


	@PostMapping("/login")
	   @ResponseBody
       public List<Map<String, Object>> Login(String customeraccount,String customerpwd,ModelMap map,HttpSession session){
		CustomerInfo result = loginservice.login(customeraccount, customerpwd);
		if(result!=null){
			result.setShopbook(shopBookService.getShopBookBycid(result.getCustomerid().toString()));
		    map.put("customer",result);
		    map.put("msg", "success");
		}else{
			map.put("msg", "fall");
		}
		Object object = session.getAttribute("customer");
		List<Map<String, Object>> re = new ArrayList<Map<String, Object>>();
		re.add(map);
		return re;
       }
}
