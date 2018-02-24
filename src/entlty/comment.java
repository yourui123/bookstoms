package entlty;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "comment")
public class comment extends BaseModel{
    //ͼ�����۱��
	@Column(name = "commentid",type = MySqlTypeConstant.INT,isKey = true,isAutoIncrement = true)
	private int commentid;
	
    //ͼ����
	@Column(name = "bookid",type = MySqlTypeConstant.INT)
	private int bookid;
	
	 //�ͻ����
	@Column(name = "customerid",type = MySqlTypeConstant.INT)
	private int customerid;
	
	 //����ʱ��
	@Column(name = "commentdate",type = MySqlTypeConstant.DATETIME)
	private int commentdate;
	
	 //��������
	@Column(name = "commentcontent",type = MySqlTypeConstant.VARCHAR,length = 1000)
	private int commentcontent;
	
	 //��������
    @Column(name = "isgood",type = MySqlTypeConstant.VARCHAR,length = 11)
	private int isgood;
}
