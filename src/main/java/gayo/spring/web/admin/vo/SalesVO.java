package gayo.spring.web.admin.vo;

public class SalesVO {
	private String customer_Id;
	private String reserve_No;
	private String reserve_Pay;
	
	
	@Override
	public String toString() {
		return "SalesVO [customer_Id=" + customer_Id + ", reserve_No=" + reserve_No + ", reserve_Pay=" + reserve_Pay
				+ "]";
	}
	public String getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getReserve_No() {
		return reserve_No;
	}
	public void setReserve_No(String reserve_No) {
		this.reserve_No = reserve_No;
	}
	public String getReserve_Pay() {
		return reserve_Pay;
	}
	public void setReserve_Pay(String reserve_Pay) {
		this.reserve_Pay = reserve_Pay;
	}
	
}
