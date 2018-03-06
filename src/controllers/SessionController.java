package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entlty.CustomerInfo;
import service.OrderesService;
import service.ShopBookService;

@Controller
public class SessionController {

	private ShopBookService sbs;
	private OrderesService os;
	@Autowired
	public SessionController(ShopBookService sbs, OrderesService os) {
		super();
		this.sbs = sbs;
		this.os = os;
	}
	
      @GetMapping("/getsession")
      @ResponseBody
      public CustomerInfo getSession(HttpSession session,String name){
    	  CustomerInfo yy=(CustomerInfo) session.getAttribute(name);
    	  if(yy!=null){
    	  yy.setShopbook(sbs.getShopBookBycid(yy.getCustomerid().toString()));
    	  }
		return yy;
    	  
      }
}
