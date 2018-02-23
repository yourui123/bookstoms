package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;


import entlty.userinfo;

public interface UserDao {
    @Select("SELECT * FROM userinfo WHERE username=#{username} AND userpwd=#{userpwd}")
	List<userinfo> findUser(userinfo user);
}
