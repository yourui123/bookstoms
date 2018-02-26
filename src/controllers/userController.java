package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import entlty.userinfo;
import service.Login;

@Controller
public class userController {
	@Autowired
	private Login login;
	
	public userController(Login login) {
		this.login = login;
	}

	@PostMapping("/login1")
	public String checkUser(userinfo u) {
		if (login.execute(u)) {
			return "loginSuccess";
		} else {
			return "loginFailed";
		}		
	}	
}
