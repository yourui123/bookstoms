package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BookInfoDao;
import entlty.bookinfo;

@Service
public class BookService {

	@Autowired
	private BookInfoDao bookinfodao;

	public BookService(BookInfoDao bookinfodao) {
		this.bookinfodao = bookinfodao;
	}
	
	public List<bookinfo> getBookinfOrderbysell(){
		
		return bookinfodao.getBookorderBysell();
		
	}
}
