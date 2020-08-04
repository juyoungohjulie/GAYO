package gayo.spring.web.admin.vo;

import java.sql.Date;

public class TermsVO {
	private String terms_No;
	private String customer_Id;
	private String terms_Title;
	private String terms_Content;
	private String terms_Necessary;
	private Date terms_Reg_Date;
	private Date terms_Agree_Date;
	
	@Override
	public String toString() {
		return "TermsVO [terms_No=" + terms_No + ", customer_Id=" + customer_Id + ", terms_Title=" + terms_Title
				+ ", terms_Content=" + terms_Content + ", terms_Necessary=" + terms_Necessary + ", terms_Reg_Date="
				+ terms_Reg_Date + ", terms_Agree_Date=" + terms_Agree_Date + "]";
	}
	public String getTerms_No() {
		return terms_No;
	}
	public void setTerms_No(String terms_No) {
		this.terms_No = terms_No;
	}
	public String getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getTerms_Title() {
		return terms_Title;
	}
	public void setTerms_Title(String terms_Title) {
		this.terms_Title = terms_Title;
	}
	public String getTerms_Content() {
		return terms_Content;
	}
	public void setTerms_Content(String terms_Content) {
		this.terms_Content = terms_Content;
	}
	public String getTerms_Necessary() {
		return terms_Necessary;
	}
	public void setTerms_Necessary(String terms_Necessary) {
		this.terms_Necessary = terms_Necessary;
	}
	public Date getTerms_Reg_Date() {
		return terms_Reg_Date;
	}
	public void setTerms_Reg_Date(Date terms_Reg_Date) {
		this.terms_Reg_Date = terms_Reg_Date;
	}
	public Date getTerms_Agree_Date() {
		return terms_Agree_Date;
	}
	public void setTerms_Agree_Date(Date terms_Agree_Date) {
		this.terms_Agree_Date = terms_Agree_Date;
	}
	
	
}
