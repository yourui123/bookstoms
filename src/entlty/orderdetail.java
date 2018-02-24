package entlty;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
@Table(name = "orderdetail")
public class orderdetail extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8104015753826409315L;
	
	//��ϸ��������
	@Column(name = "orderdetalid",type = MySqlTypeConstant.INT,isKey = true,isAutoIncrement = true)
	private int orderdetalid;
	
	//������
	@Column(name = "orderid",type = MySqlTypeConstant.INT)
	private int orderid;
	
	//ͼ����
	@Column(name = "bookid",type = MySqlTypeConstant.INT)
	private int bookid;
	
	//��������
	@Column(name = "ordermount",type = MySqlTypeConstant.INT)
	private int ordermount;
	
	//����״̬
	@Column(name = "poststatus",type = MySqlTypeConstant.VARCHAR,length = 11)
	private int poststatus;
	
	//�ջ�״̬
	@Column(name = "Recevstatus",type = MySqlTypeConstant.VARCHAR,length = 11)
	private int Recevstatus;

	public int getOrderdetalid() {
		return orderdetalid;
	}

	public void setOrderdetalid(int orderdetalid) {
		this.orderdetalid = orderdetalid;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getOrdermount() {
		return ordermount;
	}

	public void setOrdermount(int ordermount) {
		this.ordermount = ordermount;
	}

	public int getPoststatus() {
		return poststatus;
	}

	public void setPoststatus(int poststatus) {
		this.poststatus = poststatus;
	}

	public int getRecevstatus() {
		return Recevstatus;
	}

	public void setRecevstatus(int recevstatus) {
		Recevstatus = recevstatus;
	}

     
}
