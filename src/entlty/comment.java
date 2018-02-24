package entlty;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "comment")
public class comment extends BaseModel{
    //图书评价编号
	@Column(name = "commentid",type = MySqlTypeConstant.INT,isKey = true,isAutoIncrement = true)
	private int commentid;
	
    //图书编号
	@Column(name = "bookid",type = MySqlTypeConstant.INT)
	private int bookid;
	
	 //客户编号
	@Column(name = "customerid",type = MySqlTypeConstant.INT)
	private int customerid;
	
	 //评论时间
	@Column(name = "commentdate",type = MySqlTypeConstant.DATETIME)
	private int commentdate;
	
	 //评论内容
	@Column(name = "commentcontent",type = MySqlTypeConstant.VARCHAR,length = 1000)
	private int commentcontent;
	
	 //好评差评
    @Column(name = "isgood",type = MySqlTypeConstant.VARCHAR,length = 11)
	private int isgood;
}
