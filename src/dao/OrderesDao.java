package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entlty.orderes;

public interface OrderesDao {
	@Select("select * from orders where customerid = #{customerid}")
	List<orderes> getOrderesByid(@Param("customerid")String customerid);

	
}
