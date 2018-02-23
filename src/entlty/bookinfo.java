package entlty;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "bookinfo")
public class bookinfo extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2968582814991022563L;

	//����id
	@Column(name = "bookid",type = MySqlTypeConstant.INT,isKey = true,isAutoIncrement = true)
	private Integer bookid;
	
	//ͼ������
	@Column(name = "bookname",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookname;
	
	//ͼ������
	@Column(name = "booktypeid",type = MySqlTypeConstant.INT)
	private Integer booktypeid;
	
	//������
	@Column(name = "bookpress",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookpress;
	
	//��������
	@Column(name = "bookpubdate",type = MySqlTypeConstant.DATETIME)
	private String bookpubdate;
	
	//����
	@Column(name = "booksize",type = MySqlTypeConstant.VARCHAR,length = 10)
	private String booksize;
	
	//���
	@Column(name = "bookversion",type = MySqlTypeConstant.VARCHAR,length = 10)
	private String bookversion;
	
	//ͼ������
	@Column(name = "bookauthor",type = MySqlTypeConstant.VARCHAR,length = 10)
	private String bookauthor;
	
	//ͼ������
	@Column(name = "booktanslor",type = MySqlTypeConstant.VARCHAR,length = 10)
	private String booktanslor;
	
	//ͼ��ISBN
	@Column(name = "bookisbn",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookisbn;
	
	//ͼ�鶨��
	@Column(name = "bookprice",type = MySqlTypeConstant.DOUBLE,length = 11,decimalLength = 2)
	private String bookprice;
	
    //ͼ����
	@Column(name = "bookoutline",type = MySqlTypeConstant.VARCHAR,length = 200)
	private String bookoutline;
	
	//�г���
	@Column(name = "bookmprice",type = MySqlTypeConstant.DOUBLE,length = 11,decimalLength = 2)
	private String bookmprice;
	
	//�ۿۼ�
	@Column(name = "bookprprice",type = MySqlTypeConstant.DOUBLE,length = 11,decimalLength = 2)
	private String bookprprice;

	//�ɽ���
	@Column(name = "bookdealmount",type = MySqlTypeConstant.INT,length = 11)
	private String bookdealmount;
	
	//�������
	@Column(name = "booklookmount",type = MySqlTypeConstant.INT,length = 11)
	private String booklookmount;
	
	//�ۿ�
	@Column(name = "bookdiscount",type = MySqlTypeConstant.INT,length = 1)
	private String bookdiscount;
	
	//ͼ�����
	@Column(name = "bookpic",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookpic;
	
	//�����
    @Column(name = "bookstoremount",type = MySqlTypeConstant.INT,length = 11)
    private String bookstoremount;
    
    //���ʱ��
  	@Column(name = "bookstoretime",type = MySqlTypeConstant.DATETIME)
  	private String bookstoretime;
  	
	//װ����ʽ
	@Column(name = "bookpackstyle",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookpackstyle;



	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public Integer getBooktypeid() {
		return booktypeid;
	}

	public void setBooktypeid(Integer booktypeid) {
		this.booktypeid = booktypeid;
	}

	public String getBookpress() {
		return bookpress;
	}

	public void setBookpress(String bookpress) {
		this.bookpress = bookpress;
	}

	public String getBookpubdate() {
		return bookpubdate;
	}

	public void setBookpubdate(String bookpubdate) {
		this.bookpubdate = bookpubdate;
	}

	public String getBooksize() {
		return booksize;
	}

	public void setBooksize(String booksize) {
		this.booksize = booksize;
	}

	public String getBookversion() {
		return bookversion;
	}

	public void setBookversion(String bookversion) {
		this.bookversion = bookversion;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBooktanslor() {
		return booktanslor;
	}

	public void setBooktanslor(String booktanslor) {
		this.booktanslor = booktanslor;
	}

	public String getBookisbn() {
		return bookisbn;
	}

	public void setBookisbn(String bookisbn) {
		this.bookisbn = bookisbn;
	}

	public String getBookprice() {
		return bookprice;
	}

	public void setBookprice(String bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookoutline() {
		return bookoutline;
	}

	public void setBookoutline(String bookoutline) {
		this.bookoutline = bookoutline;
	}

	public String getBookmprice() {
		return bookmprice;
	}

	public void setBookmprice(String bookmprice) {
		this.bookmprice = bookmprice;
	}

	public String getBookprprice() {
		return bookprprice;
	}

	public void setBookprprice(String bookprprice) {
		this.bookprprice = bookprprice;
	}

	public String getBookdealmount() {
		return bookdealmount;
	}

	public void setBookdealmount(String bookdealmount) {
		this.bookdealmount = bookdealmount;
	}

	public String getBooklookmount() {
		return booklookmount;
	}

	public void setBooklookmount(String booklookmount) {
		this.booklookmount = booklookmount;
	}

	public String getBookdiscount() {
		return bookdiscount;
	}

	public void setBookdiscount(String bookdiscount) {
		this.bookdiscount = bookdiscount;
	}

	public String getBookpic() {
		return bookpic;
	}

	public void setBookpic(String bookpic) {
		this.bookpic = bookpic;
	}

	public String getBookstoremount() {
		return bookstoremount;
	}

	public void setBookstoremount(String bookstoremount) {
		this.bookstoremount = bookstoremount;
	}

	public String getBookstoretime() {
		return bookstoretime;
	}

	public void setBookstoretime(String bookstoretime) {
		this.bookstoretime = bookstoretime;
	}

	public String getBookpackstyle() {
		return bookpackstyle;
	}

	public void setBookpackstyle(String bookpackstyle) {
		this.bookpackstyle = bookpackstyle;
	}
	
	
	
}
