package entlty;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;


	@Table(name = "userinfo")
	public class userinfo extends BaseModel{
	/**
		 * 
		 */
		private static final long serialVersionUID = -5701742495511849927L;
	@Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
	private Integer id;
	@Column(name = "username",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String username;
	@Column(name = "userpwd",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String userpwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	}

