package entlty;

import java.util.List;

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
	@Column(name = "booktypeid",type = MySqlTypeConstant.INT,isKey = true)
	private Integer booktypeid;
	//图书类型名称
	@Column(name = "Booktypename",type = MySqlTypeConstant.VARCHAR,length = 50)
	private String Booktypename;
	
	//父类型
	@Column(name = "parenttypeid",type = MySqlTypeConstant.INT)
	private Integer parenttypeid;
	
	private List<booktypeinfo> childent;
	
	public Integer getParenttypeid() {
		return parenttypeid;
	}
	public void setParenttypeid(Integer parenttypeid) {
		this.parenttypeid = parenttypeid;
	}
	public List<booktypeinfo> getChildent() {
		return childent;
	}
	public void setChildent(List<booktypeinfo> childent) {
		this.childent = childent;
	}
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
