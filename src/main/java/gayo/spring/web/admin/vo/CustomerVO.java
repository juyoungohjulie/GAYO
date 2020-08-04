package gayo.spring.web.admin.vo;

import java.sql.Date;

public class CustomerVO {
	private String customer_Id;
	private String customer_Name;
	private String customer_Pw;
	private String customer_Email;
	private String customer_Phone;
	private Date customer_JoinDate;
	private Date customer_LastLogin;
	private String customer_State;
	private String customer_PostCode;
	private String customer_Addr1;
	private String customer_Addr2;
	private String customer_Birth;
	private String customer_Term_Agree;
	private String customer_Gender;
	
	
	
	@Override
	public String toString() {
		return "CustomerVO [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", customer_Pw="
				+ customer_Pw + ", customer_Email=" + customer_Email + ", customer_Phone=" + customer_Phone
				+ ", customer_JoinDate=" + customer_JoinDate + ", customer_LastLogin=" + customer_LastLogin
				+ ", customer_State=" + customer_State + ", customer_PostCode=" + customer_PostCode
				+ ", customer_Addr1=" + customer_Addr1 + ", customer_Addr2=" + customer_Addr2 + ", customer_Birth="
				+ customer_Birth + ", customer_Term_Agree=" + customer_Term_Agree + ", customer_Gender="
				+ customer_Gender + "]";
	}



	public String getCustomer_Id() {
		return customer_Id;
	}



	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}



	public String getCustomer_Name() {
		return customer_Name;
	}



	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}



	public String getCustomer_Pw() {
		return customer_Pw;
	}



	public void setCustomer_Pw(String customer_Pw) {
		this.customer_Pw = customer_Pw;
	}



	public String getCustomer_Email() {
		return customer_Email;
	}



	public void setCustomer_Email(String customer_Email) {
		this.customer_Email = customer_Email;
	}



	public String getCustomer_Phone() {
		return customer_Phone;
	}



	public void setCustomer_Phone(String customer_Phone) {
		this.customer_Phone = customer_Phone;
	}



	public Date getCustomer_JoinDate() {
		return customer_JoinDate;
	}



	public void setCustomer_JoinDate(Date customer_JoinDate) {
		this.customer_JoinDate = customer_JoinDate;
	}



	public Date getCustomer_LastLogin() {
		return customer_LastLogin;
	}



	public void setCustomer_LastLogin(Date customer_LastLogin) {
		this.customer_LastLogin = customer_LastLogin;
	}



	public String getCustomer_State() {
		return customer_State;
	}



	public void setCustomer_State(String customer_State) {
		this.customer_State = customer_State;
	}



	public String getCustomer_PostCode() {
		return customer_PostCode;
	}



	public void setCustomer_PostCode(String customer_PostCode) {
		this.customer_PostCode = customer_PostCode;
	}



	public String getCustomer_Addr1() {
		return customer_Addr1;
	}



	public void setCustomer_Addr1(String customer_Addr1) {
		this.customer_Addr1 = customer_Addr1;
	}



	public String getCustomer_Addr2() {
		return customer_Addr2;
	}



	public void setCustomer_Addr2(String customer_Addr2) {
		this.customer_Addr2 = customer_Addr2;
	}



	public String getCustomer_Birth() {
		return customer_Birth;
	}



	public void setCustomer_Birth(String customer_Birth) {
		this.customer_Birth = customer_Birth;
	}

	



	public String getCustomer_Term_Agree() {
		return customer_Term_Agree;
	}



	public void setCustomer_Term_Agree(String customer_Term_Agree) {
		this.customer_Term_Agree = customer_Term_Agree;
	}



	public String getCustomer_Gender() {
		return customer_Gender;
	}



	public void setCustomer_Gender(String customer_Gender) {
		this.customer_Gender = customer_Gender;
	}
	
	
	
}
