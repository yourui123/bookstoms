package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrderesDao;
import dao.ShopBookDao;
import entlty.orderes;
import entlty.shopbook;

@Service
public class OrderesService {

	@Autowired
	private OrderesDao bookDao;
	


	public OrderesService(OrderesDao bookDao) {
	
		this.bookDao = bookDao;
	}



	public List<orderes> getOrderesBycid(String customerid){
		
		
		
		return bookDao.getOrderesByid(customerid);
		
		
	}
	
}
