package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entlty.CustomerInfo;
import entlty.bookinfo;
import entlty.shopbook;
import net.sf.json.JSONObject;
import service.BookService;
import service.ShopBookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookservice;
	private ShopBookService shopBookService;
	
	



	public BookController(BookService bookservice, ShopBookService shopBookService) {
		super();
		this.bookservice = bookservice;
		this.shopBookService = shopBookService;
	}





	@RequestMapping("/getfullbook")
	@ResponseBody
	public Map<String, Object> getFullbook(String bookid ,HttpSession session){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bookinfo", bookservice.getBookinfbyid(bookid));
		CustomerInfo customerinfo = (CustomerInfo) session.getAttribute("customer");
		List<shopbook> shopbooks= new ArrayList<shopbook>();
		if(customerinfo!=null){
		shopbooks = shopBookService.getShopBookBycidqid(customerinfo.getCustomerid().toString(), bookid);
		if(shopbooks.size()==0){
			shopbook shopbook = new shopbook();
			shopbook.setOrdermount("0");
			shopbooks.add(shopbook);
		}
		map.put("bookshop", shopbooks);
		}else{
			shopbook shopbook = new shopbook();
			shopbook.setOrdermount("0");
			shopbooks.add(shopbook);
			map.put("bookshop", shopbooks);
		}
		return map;
		
	}
	@RequestMapping("/showbooksbytype")
	@ResponseBody
	public Map<String, Object> getBookbyType(String book){
		Map<String, Object> map = new HashMap<String, Object>();
		JSONObject jsonObject = JSONObject.fromObject(book);
		map.put("bookinfobytype", bookservice.getBookinfbytypeid(jsonObject.getString("booktypeid")));
		
		return map;
		
	}
}
