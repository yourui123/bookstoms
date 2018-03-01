package entlty;

import java.util.List;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "customerinfo")
public class CustomerInfo extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6807803347014007571L;

	//主键id
	@Column(name = "customerid",type = MySqlTypeConstant.INT,isKey = true,isAutoIncrement = true)
	private Integer customerid;
	
	//客户名称
	@Column(name = "customercame",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String customercame;
	
	
	//客户密码
	@Column(name = "customerpwd",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String customerpwd;
	
	//客户真实姓名
	@Column(name = "customertruename",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String customertruename;
	
	//客户性别
	@Column(name = "customersex",type = MySqlTypeConstant.VARCHAR,length = 2)
	private String customersex;
	
	//客户电话
	@Column(name = "customertel",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String customertel;
	
	//客户邮箱
	@Column(name = "customeremail",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String customeremail;
	
	//客户地址
	@Column(name = "customeraddr",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String customeraddr;
	
	//客户注册时间
	@Column(name = "customerregtime",type = MySqlTypeConstant.DATETIME)
	private String customerregtime;
	
	//提示问题
	@Column(name = "customerques",type = MySqlTypeConstant.VARCHAR,length = 200)
	private String customerques;
	
    //问题答案
	@Column(name = "customeranswer",type = MySqlTypeConstant.VARCHAR,length = 200)
	private String customeranswer;
	
	//登录次数
	@Column(name = "customerlogtime",type = MySqlTypeConstant.INT)
	private String customerlogtime;
	
	//最近登录时间
	@Column(name = "customerlastlogt",type = MySqlTypeConstant.DATETIME)
	private String customerlastlogt;
	
	private List<shopbook> shopbook;
	
	private List<orderes> orderes;

	public List<shopbook> getShopbook() {
		return shopbook;
	}

	public void setShopbook(List<shopbook> shopbook) {
		this.shopbook = shopbook;
	}

	public List<orderes> getOrderes() {
		return orderes;
	}

	public void setOrderes(List<orderes> orderes) {
		this.orderes = orderes;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomercame() {
		return customercame;
	}

	public void setCustomercame(String customercame) {
		this.customercame = customercame;
	}

	public String getCustomerpwd() {
		return customerpwd;
	}

	public void setCustomerpwd(String customerpwd) {
		this.customerpwd = customerpwd;
	}

	public String getCustomertruename() {
		return customertruename;
	}

	public void setCustomertruename(String customertruename) {
		this.customertruename = customertruename;
	}

	public String getCustomersex() {
		return customersex;
	}

	public void setCustomersex(String customersex) {
		this.customersex = customersex;
	}

	public String getCustomertel() {
		return customertel;
	}

	public void setCustomertel(String customertel) {
		this.customertel = customertel;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getCustomeraddr() {
		return customeraddr;
	}

	public void setCustomeraddr(String customeraddr) {
		this.customeraddr = customeraddr;
	}

	public String getCustomerregtime() {
		return customerregtime;
	}

	public void setCustomerregtime(String customerregtime) {
		this.customerregtime = customerregtime;
	}

	public String getCustomerques() {
		return customerques;
	}

	public void setCustomerques(String customerques) {
		this.customerques = customerques;
	}

	public String getCustomeranswer() {
		return customeranswer;
	}

	public void setCustomeranswer(String customeranswer) {
		this.customeranswer = customeranswer;
	}

	public String getCustomerlogtime() {
		return customerlogtime;
	}

	public void setCustomerlogtime(String customerlogtime) {
		this.customerlogtime = customerlogtime;
	}

	public String getCustomerlastlogt() {
		return customerlastlogt;
	}

	public void setCustomerlastlogt(String customerlastlogt) {
		this.customerlastlogt = customerlastlogt;
	}
	
	
}
