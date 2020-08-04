package gayo.spring.web.admin.vo;

import java.sql.Date;

public class QnaVO {
	private String qna_No;
	private String customer_Id;
	private String admin_Id;
	private String qna_Title;
	private String qna_Content;
	private Date qna_Reg_Date;
	private String qna_Answer_Title;
	private String qna_Answer_Content;
	private Date qna_Answer_Date;
	
	
	
	@Override
	public String toString() {
		return "QnaVO [qna_No=" + qna_No + ", customer_Id=" + customer_Id + ", admin_Id=" + admin_Id + ", qna_Title="
				+ qna_Title + ", qna_Content=" + qna_Content + ", qna_Reg_Date=" + qna_Reg_Date + ", qna_Answer_Title="
				+ qna_Answer_Title + ", qna_Answer_Content=" + qna_Answer_Content + ", qna_Answer_Date="
				+ qna_Answer_Date + "]";
	}
	public String getAdmin_Id() {
		return admin_Id;
	}
	public void setAdmin_Id(String admin_Id) {
		this.admin_Id = admin_Id;
	}
	public String getQna_No() {
		return qna_No;
	}
	public void setQna_No(String qna_No) {
		this.qna_No = qna_No;
	}
	public String getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getQna_Title() {
		return qna_Title;
	}
	public void setQna_Title(String qna_Title) {
		this.qna_Title = qna_Title;
	}
	public String getQna_Content() {
		return qna_Content;
	}
	public void setQna_Content(String qna_Content) {
		this.qna_Content = qna_Content;
	}

	public String getQna_Answer_Title() {
		return qna_Answer_Title;
	}
	public void setQna_Answer_Title(String qna_Answer_Title) {
		this.qna_Answer_Title = qna_Answer_Title;
	}
	public String getQna_Answer_Content() {
		return qna_Answer_Content;
	}
	public void setQna_Answer_Content(String qna_Answer_Content) {
		this.qna_Answer_Content = qna_Answer_Content;
	}
	public Date getQna_Reg_Date() {
		return qna_Reg_Date;
	}
	public void setQna_Reg_Date(Date qna_Reg_Date) {
		this.qna_Reg_Date = qna_Reg_Date;
	}
	public Date getQna_Answer_Date() {
		return qna_Answer_Date;
	}
	public void setQna_Answer_Date(Date qna_Answer_Date) {
		this.qna_Answer_Date = qna_Answer_Date;
	}

	
}
