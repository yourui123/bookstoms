package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.jr.ob.JSON;

import entlty.CustomerInfo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class SessionController {
      @GetMapping("/getsession")
      @ResponseBody
      private CustomerInfo getSession(HttpSession session,String name){
    	  CustomerInfo yy=(CustomerInfo) session.getAttribute(name);
    	//  JSONArray re = JSONArray.fromObject(session.getAttribute(name));
		return yy;
    	  
      }
}
