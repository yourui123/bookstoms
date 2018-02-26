package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BookTypeDao;
import entlty.booktypeinfo;

@Service
public class BookTypeService {
	



		@Autowired
		private BookTypeDao bookTypeDao;


		public BookTypeService(BookTypeDao bookTypeDao) {
			this.bookTypeDao = bookTypeDao;
		}


		public List<booktypeinfo> findAllBookType () {
			List<booktypeinfo> booktypeinfos = bookTypeDao.findAllparentBookType();
			if(booktypeinfos.size()>0){
				for(int i = 0; i<booktypeinfos.size();i++){
					List<booktypeinfo> childent = bookTypeDao.findAllchildBookType(booktypeinfos.get(i).getBooktypeid());
					booktypeinfos.get(i).setChildent(childent);
				}
			}
			return booktypeinfos;
				

		}

	

}
