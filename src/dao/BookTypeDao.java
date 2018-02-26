package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entlty.booktypeinfo;

public interface BookTypeDao {
     @Select("select * from booktypeinfo where parenttypeid= 0")
     List<booktypeinfo> findAllparentBookType();
     
     @Select("select * from booktypeinfo where parenttypeid= #{parenttypeid}")
     List<booktypeinfo> findAllchildBookType( @Param("parenttypeid")Integer parenttypeid);
}
