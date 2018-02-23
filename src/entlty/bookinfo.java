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

	//主键id
	@Column(name = "bookid",type = MySqlTypeConstant.INT,isKey = true,isAutoIncrement = true)
	private Integer bookid;
	
	//图书名称
	@Column(name = "bookname",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookname;
	
	//图书类型
	@Column(name = "booktypeid",type = MySqlTypeConstant.INT)
	private Integer booktypeid;
	
	//出版社
	@Column(name = "bookpress",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookpress;
	
	//出版日期
	@Column(name = "bookpubdate",type = MySqlTypeConstant.DATETIME)
	private String bookpubdate;
	
	//开本
	@Column(name = "booksize",type = MySqlTypeConstant.VARCHAR,length = 10)
	private String booksize;
	
	//版次
	@Column(name = "bookversion",type = MySqlTypeConstant.VARCHAR,length = 10)
	private String bookversion;
	
	//图书作者
	@Column(name = "bookauthor",type = MySqlTypeConstant.VARCHAR,length = 10)
	private String bookauthor;
	
	//图书译者
	@Column(name = "booktanslor",type = MySqlTypeConstant.VARCHAR,length = 10)
	private String booktanslor;
	
	//图书ISBN
	@Column(name = "bookisbn",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookisbn;
	
	//图书定价
	@Column(name = "bookprice",type = MySqlTypeConstant.DOUBLE,length = 11,decimalLength = 2)
	private String bookprice;
	
    //图书简介
	@Column(name = "bookoutline",type = MySqlTypeConstant.VARCHAR,length = 200)
	private String bookoutline;
	
	//市场价
	@Column(name = "bookmprice",type = MySqlTypeConstant.DOUBLE,length = 11,decimalLength = 2)
	private String bookmprice;
	
	//折扣价
	@Column(name = "bookprprice",type = MySqlTypeConstant.DOUBLE,length = 11,decimalLength = 2)
	private String bookprprice;

	//成交量
	@Column(name = "bookdealmount",type = MySqlTypeConstant.INT,length = 11)
	private String bookdealmount;
	
	//浏览次数
	@Column(name = "booklookmount",type = MySqlTypeConstant.INT,length = 11)
	private String booklookmount;
	
	//折扣
	@Column(name = "bookdiscount",type = MySqlTypeConstant.INT,length = 1)
	private String bookdiscount;
	
	//图书封面
	@Column(name = "bookpic",type = MySqlTypeConstant.VARCHAR,length = 20)
	private String bookpic;
	
	//库存量
    @Column(name = "bookstoremount",type = MySqlTypeConstant.INT,length = 11)
    private String bookstoremount;
    
    //入库时间
  	@Column(name = "bookstoretime",type = MySqlTypeConstant.DATETIME)
  	private String bookstoretime;
  	
	//装订方式
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
