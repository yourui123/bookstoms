package dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entlty.shopbook;

public interface ShopBookDao {

	@Select("select * from shopbook where customerid = #{customerid} and isorder != 1") 
	List<shopbook> getBookshopbyid(@Param("customerid") String customerid);
	
	@Select("select * from shopbook where customerid = #{customerid} and isorder != 1 and bookid = #{bookid}") 
	List<shopbook> getBookshopbycidqid(@Param("customerid") String customerid,@Param("bookid") String bookid);
	
	
	@Insert("INSERT INTO users (uid,uname,pwd,sex,phone,rid) " +
            " VALUES (#{uid},#{uname},#{pwd},#{sex},#{phone},#{rid})")
	
	
}
