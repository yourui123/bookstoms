package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entlty.CustomerInfo;
import entlty.shopbook;
import net.sf.json.JSONArray;
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
	@ResponseBody
	private Map<String, Object> addShopBook(String bookinfo,String bookshop,HttpSession session){
		
		
		JSONObject books = JSONObject.fromObject(bookinfo);
		JSONObject bookcat = JSONObject.fromObject(bookshop);
		
		
		shopbook shopbook = new shopbook();
		shopbook.setBookid(books.getString("bookid"));
		shopbook.setCustomerid(((CustomerInfo) session.getAttribute("customer")).getCustomerid().toString());
		shopbook.setOrdermount(bookcat.getString("ordermount"));
		shopbook.setPrice(books.getDouble("bookprprice")*bookcat.getInt("ordermount"));
		shopbook.setIsorder("0");
		Map<String, Object> result = new HashMap<String, Object>();
		if(shopBookService.seaveShopBook(shopbook)>0){
			
			result.put("bookshop", shopBookService.seaveShopBook(shopbook));
			result.put("msg", "success");
		}
		return result ;
		
	}
	
	
	@RequestMapping("/seavebookshop")
	@ResponseBody
	private Map<String, Object> seavebookshop(String bookshops,HttpSession session){
		
		
		JSONArray bookcat = JSONArray.fromObject(bookshops);
		List<shopbook> list=(List)JSONArray.toCollection(bookcat,shopbook.class);
		for(int i = 0;i<list.size();i++){
			Map<String, Object> result = new HashMap<String, Object>();
			if(shopBookService.seaveShopBook(list.get(i))>0){
				
				result.put("bookshop", shopBookService.seaveShopBook(list.get(i)));
				result.put("msg", "success");
			}

		
		
		}
		Map<String, Object> result = new HashMap<String, Object>();
	/*	if(shopBookService.seaveShopBook(shopbook)>0){
			
			result.put("bookshop", shopBookService.seaveShopBook(shopbook));
			result.put("msg", "success");
		}*/
		return result ;
		
	}
	
}
