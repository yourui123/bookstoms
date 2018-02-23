package entlty;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
@Table(name = "booktypeinfo")
public class booktypeinfo extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1312712198997622594L;
	//图书类型主键
	@Column(name = "booktypeid",type = MySqlTypeConstant.INT,isKey = true ,isAutoIncrement = true)
	private Integer booktypeid;
	//图书类型名称
	@Column(name = "Booktypename",type = MySqlTypeConstant.VARCHAR,length = 50)
	private String Booktypename;
	public Integer getBooktypeid() {
		return booktypeid;
	}
	public void setBooktypeid(Integer booktypeid) {
		this.booktypeid = booktypeid;
	}
	public String getBooktypename() {
		return Booktypename;
	}
	public void setBooktypename(String booktypename) {
		Booktypename = booktypename;
	}

}
