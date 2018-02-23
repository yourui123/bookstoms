package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;

import entlty.userinfo;

@Service
public class Login  {

	@Autowired
	private UserDao userdao;


	public Login(UserDao userdao) {
		this.userdao = userdao;
	}


	public boolean execute(userinfo user) {
		if(userdao.findUser(user).size()>0){
			return true;
		}else{
			return false;
		}
			

	}

}
