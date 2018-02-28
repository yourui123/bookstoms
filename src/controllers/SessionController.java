package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.jr.ob.JSON;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class SessionController {
      @GetMapping("/getsession")
      private String getSession(HttpSession session,String name){
    	  session.getAttribute(name);
    	  JSONObject.fromObject(session.getAttribute(name));
		return JSONObject.fromObject(session.getAttribute(name)).toString();
    	  
      }
}
