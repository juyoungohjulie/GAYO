package gayo.spring.web.admin.vo;

public class UserCountVO {
	private String customer_Count_Date;
	private String customer_Count_Visitors;
	private String customer_Count_Joiners;
	private String customer_Count_Out;
	
	@Override
	public String toString() {
		return "UserCountVO [customer_Count_Date=" + customer_Count_Date + ", customer_Count_Visitors="
				+ customer_Count_Visitors + ", customer_Count_Joiners=" + customer_Count_Joiners
				+ ", customer_Count_Out=" + customer_Count_Out + "]";
	}
	public String getCustomer_Count_Date() {
		return customer_Count_Date;
	}
	public void setCustomer_Count_Date(String customer_Count_Date) {
		this.customer_Count_Date = customer_Count_Date;
	}
	public String getCustomer_Count_Visitors() {
		return customer_Count_Visitors;
	}
	public void setCustomer_Count_Visitors(String customer_Count_Visitors) {
		this.customer_Count_Visitors = customer_Count_Visitors;
	}
	public String getCustomer_Count_Joiners() {
		return customer_Count_Joiners;
	}
	public void setCustomer_Count_Joiners(String customer_Count_Joiners) {
		this.customer_Count_Joiners = customer_Count_Joiners;
	}
	public String getCustomer_Count_Out() {
		return customer_Count_Out;
	}
	public void setCustomer_Count_Out(String customer_Count_Out) {
		this.customer_Count_Out = customer_Count_Out;
	}
	
}
