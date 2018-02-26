package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entlty.booktypeinfo;
import entlty.userinfo;
import service.BookTypeService;

@Controller
public class IndexController {
	@Autowired
	private BookTypeService booktypeservice;
	
	public IndexController(BookTypeService booktypeservice) {
		
		this.booktypeservice = booktypeservice;
	}

	@GetMapping("/ShowBookType")
	@ResponseBody
	public List<booktypeinfo> showBookType() {
		return booktypeservice.findAllBookType();
	
	}	
}
