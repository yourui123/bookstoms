package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entlty.bookinfo;

public interface BookInfoDao {

	@Select("select * FROM bookinfo  ORDER BY bookdealmount DESC limit 5")
	List<bookinfo> getBookorderBysell();
	
	@Select("select * FROM bookinfo  where bookid = #{bookid}")
	List<bookinfo> getfullBook(@Param("bookid")String bookid);
	
	@Select("select * FROM bookinfo  where booktypeid = #{booktypeid} ORDER BY bookdealmount DESC limit 5")
	List<bookinfo> getBookbytypeid(@Param("booktypeid")String booktypeid);
    
	@Select("select * FROM bookinfo  ORDER BY bookdiscount DESC limit 5")
	List<bookinfo> getBookorderByplice();
	
	
}
