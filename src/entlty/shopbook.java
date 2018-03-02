package entlty;

import java.util.List;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
@Table(name = "shopbook" )
public class shopbook extends BaseModel{
	    /**
	 * 
	 */
	private static final long serialVersionUID = 460262181812652605L;
		//���ﳵ����
		@Column(name = "shopbookid",type = MySqlTypeConstant.INT,isKey = true ,isAutoIncrement = true)
		private Integer shopbookid;
		//�ͻ����
		@Column(name = "customerid",type = MySqlTypeConstant.INT,length = 11)
		private String customerid;
		//ͼ����
		@Column(name = "bookid",type = MySqlTypeConstant.INT,length = 11)
		private String bookid;
		//��������
		@Column(name = "ordermount",type = MySqlTypeConstant.INT,length = 11)
		private String ordermount;
		//�ܼ�
		@Column(name = "price",type = MySqlTypeConstant.DOUBLE,length = 11,decimalLength = 2)
		private double price;
		//�Ƿ��ύ����
		@Column(name = "isorder",type = MySqlTypeConstant.VARCHAR,length = 11)
		private String isorder;
		
		private List<bookinfo> bookinfo;

		public List<bookinfo> getBookinfo() {
			return bookinfo;
		}
		public void setBookinfo(List<bookinfo> bookinfo) {
			this.bookinfo = bookinfo;
		}
		public Integer getShopbookid() {
			return shopbookid;
		}
		public void setShopbookid(Integer shopbookid) {
			this.shopbookid = shopbookid;
		}
		public String getCustomerid() {
			return customerid;
		}
		public void setCustomerid(String customerid) {
			this.customerid = customerid;
		}
		public String getBookid() {
			return bookid;
		}
		public void setBookid(String bookid) {
			this.bookid = bookid;
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
		public String getIsorder() {
			return isorder;
		}
		public void setIsorder(String isorder) {
			this.isorder = isorder;
		}
		
		
		
}
