package controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entlty.CustomerInfo;
import entlty.shopbook;
import net.sf.json.JSONObject;
import service.ShopBookService;

@Controller
public class AddBookShopController {
	
	@Autowired
	private ShopBookService shopBookService;

	public AddBookShopController(ShopBookService shopBookService) {
		
		this.shopBookService = shopBookService;
	}
	@RequestMapping("/addbookshop")
	private Map<String, Object> addShopBook(String bookinfo,String bookshop,HttpSession session){
		
		
		JSONObject books = JSONObject.fromObject(bookinfo);
		JSONObject bookcat = JSONObject.fromObject(bookshop);
		
		
		shopbook shopbook = new shopbook();
		shopbook.setBookid(books.getString("bookid"));
		shopbook.setCustomerid(((CustomerInfo) session.getAttribute("customer")).getCustomerid().toString());
		shopbook.setOrdermount(bookcat.getString("ordermount"));
		shopbook.setPrice(books.getDouble("bookprprice")*bookcat.getInt("ordermount"));
		shopbook.setIsorder("0");
		return null;
		
	}
	
}
