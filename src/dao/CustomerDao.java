package dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entlty.CustomerInfo;
import entlty.shopbook;

public interface CustomerDao {
       @Select("SELECT * from customerinfo WHERE customercame = #{customername}  AND customerpwd = #{customerpwd}")
       CustomerInfo LoginByname(@Param("customername")String customername,@Param("customerpwd")String customerpwd);
       
       @Select("SELECT * from customerinfo WHERE customertel = #{customertel}  AND customerpwd = #{customerpwd}")
       CustomerInfo LoginBytel(@Param("customerpwd")String customerpwd,@Param("customertel")String customertel);
       
       @Select("SELECT * from customerinfo WHERE customeremail = #{customeremail}  AND customerpwd = #{customerpwd}")
       CustomerInfo LoginByemile(@Param("customeremail")String customeremail,@Param("customerpwd")String customerpwd);
       
       @Insert("INSERT INTO customerinfo (customercame,customerpwd,customertruename,customersex,customertel,customeremail,customeraddr,customerregtime,customerques,customeranswer,customerlogtime) " +
               " VALUES (#{customercame},#{customerpwd},#{customertruename},#{customersex},#{customertel},#{customeremail},#{customeraddr},#{customerregtime},#{customerques},#{customeranswer},#{customerlogtime"
               + "})")
   	   int seavecustomer(CustomerInfo customer);
       
}
