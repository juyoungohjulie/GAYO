package gayo.spring.web.admin.vo;

import java.sql.Date;

public class PayVO {
	private String customer_Id;
	private String reserve_Pay;
	private Date pay_Date;
	
	
	
	@Override
	public String toString() {
		return "PayVO [customer_Id=" + customer_Id + ", reserve_Pay=" + reserve_Pay + ", pay_Date=" + pay_Date + "]";
	}
	public String getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getReserve_Pay() {
		return reserve_Pay;
	}
	public void setReserve_Pay(String reserve_Pay) {
		this.reserve_Pay = reserve_Pay;
	}
	public Date getPay_Date() {
		return pay_Date;
	}
	public void setPay_Date(Date pay_Date) {
		this.pay_Date = pay_Date;
	}
	
	
	
}
