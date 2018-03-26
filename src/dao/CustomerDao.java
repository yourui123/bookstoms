package dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entlty.CustomerInfo;
import entlty.shopbook;

public interface CustomerDao {
	   //登录byname
       @Select("SELECT * from customerinfo WHERE customercame = #{customername}  AND customerpwd = #{customerpwd}")
       CustomerInfo LoginByname(@Param("customername")String customername,@Param("customerpwd")String customerpwd);
       //登录bytel
       @Select("SELECT * from customerinfo WHERE customertel = #{customertel}  AND customerpwd = #{customerpwd}")
       CustomerInfo LoginBytel(@Param("customerpwd")String customerpwd,@Param("customertel")String customertel);
       //登录byemail
       @Select("SELECT * from customerinfo WHERE customeremail = #{customeremail}  AND customerpwd = #{customerpwd}")
       CustomerInfo LoginByemile(@Param("customeremail")String customeremail,@Param("customerpwd")String customerpwd);
       
       @Insert("INSERT INTO customerinfo (customercame,customerpwd,customertruename,customersex,customertel,customeremail,customeraddr,customerregtime,customerques,customeranswer,customerlogtime) " +
               " VALUES (#{customercame},#{customerpwd},#{customertruename},#{customersex},#{customertel},#{customeremail},#{customeraddr},#{customerregtime},#{customerques},#{customeranswer},#{customerlogtime"
               + "})")
   	   int seavecustomer(CustomerInfo customer);
       //校验name
       @Select("SELECT * from customerinfo WHERE customercame = #{customercame}")
       List<CustomerInfo> jyname(CustomerInfo customer);
       
       //校验email
       @Select("SELECT * from customerinfo WHERE customeremail = #{customeremail}")
       List<CustomerInfo> jyemail(CustomerInfo customer);
       
       //校验email
       @Select("SELECT * from customerinfo WHERE customertel = #{customertel}")
       List<CustomerInfo> jytel(CustomerInfo customer);
}
