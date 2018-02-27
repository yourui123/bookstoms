package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entlty.bookinfo;
import entlty.booktypeinfo;
import entlty.userinfo;
import service.BookService;
import service.BookTypeService;

@Controller
public class IndexController {
	@Autowired
	private BookTypeService booktypeservice;
	private BookService bookService;
	
	


	public IndexController(BookTypeService booktypeservice, BookService bookService) {
		super();
		this.booktypeservice = booktypeservice;
		this.bookService = bookService;
	}
	
	
	@GetMapping("/ShowBookType")
	@ResponseBody
	public List<booktypeinfo> showBookType() {
		return booktypeservice.findAllBookType();
	
	}	
	
	
	@GetMapping("/showBookOrderbysell")
	@ResponseBody
	public List<bookinfo> getBookOrderbysell() {
		return bookService.getBookinfOrderbysell();
	
	}	
}
