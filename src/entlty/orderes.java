package entlty;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
@Table(name = "orderes" )
public class orderes extends BaseModel{
	    /**
	 * 
	 */
	private static final long serialVersionUID = 5828261928728559720L;
		//��������
		@Column(name = "orderid",type = MySqlTypeConstant.INT,isKey = true ,isAutoIncrement = true)
		private Integer orderid;
		//�ͻ����
		@Column(name = "customerid",type = MySqlTypeConstant.INT,length = 11)
		private String customerid;
		//ͼ����
		@Column(name = "orderdate",type = MySqlTypeConstant.DATETIME)
		private String orderdate;
		//��������
		@Column(name = "ordermount",type = MySqlTypeConstant.INT,length = 11)
		private String ordermount;
		//�ܼ�
		@Column(name = "price",type = MySqlTypeConstant.DOUBLE,length = 11,decimalLength = 2)
		private double price;
		//����
		@Column(name = "message",type = MySqlTypeConstant.VARCHAR,length = 100)
		private String message;
		//�ͻ���ʽ
		@Column(name = "postmethod",type = MySqlTypeConstant.VARCHAR,length = 100)
		private String postmethod;
		//֧����ʽ��ʽ
		@Column(name = "paymethod",type = MySqlTypeConstant.VARCHAR,length = 100)
		private String paymethod;
		//�ջ�������
		@Column(name = "recevername",type = MySqlTypeConstant.VARCHAR,length = 11)
		private String recevername;
		//�ջ���ַ
		@Column(name = "receveraddr",type = MySqlTypeConstant.VARCHAR,length = 100)
		private String receveraddr;
		//�ջ��˵绰
		@Column(name = "recevertel",type = MySqlTypeConstant.VARCHAR,length = 11)
		private String recevertel;
		public Integer getOrderid() {
			return orderid;
		}
		public void setOrderid(Integer orderid) {
			this.orderid = orderid;
		}
		public String getCustomerid() {
			return customerid;
		}
		public void setCustomerid(String customerid) {
			this.customerid = customerid;
		}
		public String getOrderdate() {
			return orderdate;
		}
		public void setOrderdate(String orderdate) {
			this.orderdate = orderdate;
		}
		public String getOrdermount() {
			return ordermount;
		}
		public void setOrdermount(String ordermount) {
			this.ordermount = ordermount;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getPostmethod() {
			return postmethod;
		}
		public void setPostmethod(String postmethod) {
			this.postmethod = postmethod;
		}
		public String getPaymethod() {
			return paymethod;
		}
		public void setPaymethod(String paymethod) {
			this.paymethod = paymethod;
		}
		public String getRecevername() {
			return recevername;
		}
		public void setRecevername(String recevername) {
			this.recevername = recevername;
		}
		public String getReceveraddr() {
			return receveraddr;
		}
		public void setReceveraddr(String receveraddr) {
			this.receveraddr = receveraddr;
		}
		public String getRecevertel() {
			return recevertel;
		}
		public void setRecevertel(String recevertel) {
			this.recevertel = recevertel;
		}
		
		
}
