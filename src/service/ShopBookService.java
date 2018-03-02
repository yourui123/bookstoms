package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BookInfoDao;
import dao.ShopBookDao;
import entlty.shopbook;

@Service
public class ShopBookService {

	@Autowired
	private ShopBookDao bookDao;
	private BookInfoDao bookInfoDao;
	





	public ShopBookService(ShopBookDao bookDao, BookInfoDao bookInfoDao) {
		this.bookDao = bookDao;
		this.bookInfoDao = bookInfoDao;
	}






	public List<shopbook> getShopBookBycid(String customerid){
		List<shopbook> shopbooks = bookDao.getBookshopbyid(customerid);
		if(shopbooks.size()>0){
			for(int i = 0;i<shopbooks.size();i++){
			shopbooks.get(i).setBookinfo(bookInfoDao.getfullBook(shopbooks.get(i).getBookid()));
			}
		}
		
		
		return shopbooks;
		
		
	}
	public List<shopbook> getShopBookBycidqid(String customerid,String bookid){
		List<shopbook> shopbooks = bookDao.getBookshopbycidqid(customerid,bookid);
		
		
		return shopbooks;
		
		
	}
	public List<shopbook> seaveShopBook(shopbook shopbook){
		List<shopbook> shopbooks = bookDao.s(customerid,bookid);
		
		
		return shopbooks;
		
		
	}
	
	
}
