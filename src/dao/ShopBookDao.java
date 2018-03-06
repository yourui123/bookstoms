package dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entlty.shopbook;

public interface ShopBookDao {

	@Select("select * from shopbook where customerid = #{customerid} and isorder != 1") 
	List<shopbook> getBookshopbyid(@Param("customerid") String customerid);
	
	@Select("select * from shopbook where customerid = #{customerid} and isorder != 1 and bookid = #{bookid}") 
	List<shopbook> getBookshopbycidqid(@Param("customerid") String customerid,@Param("bookid") String bookid);
	
	
	@Insert("INSERT INTO shopbook (customerid,bookid,ordermount,price,isorder) " +
            " VALUES (#{customerid},#{bookid},#{ordermount},#{price},#{isorder})")
	int seaveShopbook(shopbook shopbook);
	
	 @Update("update shopbook set ordermount = #{ordermount},price = #{price} where customerid=#{customerid} and bookid=#{bookid}")
	 int updataShopbook(shopbook shopbook);
	
	
}
