package gayo.spring.web.admin.vo;

public class ReserveVO {
	private String reserve_No;
	private String reserve_Date;
	private String reserve_Kind;
	private String reserve_Time;
	private String pet_Id;
	private String customer_Id;
	private String customer_Phone;
	private String reserve_Area;
	private String reserve_Pet;
	private String reserve_Pet_No;
	private String reserve_Size;
	private String reserve_Unique;
	private String reserve_Pay;
	private String reserve_Match;
	
	@Override
	public String toString() {
		return "ReserveVO [reserve_No=" + reserve_No + ", reserve_Date=" + reserve_Date + ", reserve_Kind="
				+ reserve_Kind + ", reserve_Time=" + reserve_Time + ", pet_Id=" + pet_Id + ", customer_Id="
				+ customer_Id + ", customer_Phone=" + customer_Phone + ", reserve_Area=" + reserve_Area
				+ ", reserve_Pet=" + reserve_Pet + ", reserve_Pet_No=" + reserve_Pet_No + ", reserve_Size="
				+ reserve_Size + ", reserve_Unique=" + reserve_Unique + ", reserve_Pay=" + reserve_Pay
				+ ", reserve_Match=" + reserve_Match + "]";
	}
	public String getReserve_No() {
		return reserve_No;
	}
	public void setReserve_No(String reserve_No) {
		this.reserve_No = reserve_No;
	}
	public String getReserve_Date() {
		return reserve_Date;
	}
	public void setReserve_Date(String reserve_Date) {
		this.reserve_Date = reserve_Date;
	}
	public String getReserve_Kind() {
		return reserve_Kind;
	}
	public void setReserve_Kind(String reserve_Kind) {
		this.reserve_Kind = reserve_Kind;
	}
	public String getReserve_Time() {
		return reserve_Time;
	}
	public void setReserve_Time(String reserve_Time) {
		this.reserve_Time = reserve_Time;
	}
	public String getPet_Id() {
		return pet_Id;
	}
	public void setPet_Id(String pet_Id) {
		this.pet_Id = pet_Id;
	}
	public String getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}
	public String getCustomer_Phone() {
		return customer_Phone;
	}
	public void setCustomer_Phone(String customer_Phone) {
		this.customer_Phone = customer_Phone;
	}
	public String getReserve_Area() {
		return reserve_Area;
	}
	public void setReserve_Area(String reserve_Area) {
		this.reserve_Area = reserve_Area;
	}
	public String getReserve_Pet() {
		return reserve_Pet;
	}
	public void setReserve_Pet(String reserve_Pet) {
		this.reserve_Pet = reserve_Pet;
	}
	public String getReserve_Pet_No() {
		return reserve_Pet_No;
	}
	public void setReserve_Pet_No(String reserve_Pet_No) {
		this.reserve_Pet_No = reserve_Pet_No;
	}
	public String getReserve_Size() {
		return reserve_Size;
	}
	public void setReserve_Size(String reserve_Size) {
		this.reserve_Size = reserve_Size;
	}
	public String getReserve_Unique() {
		return reserve_Unique;
	}
	public void setReserve_Unique(String reserve_Unique) {
		this.reserve_Unique = reserve_Unique;
	}
	public String getReserve_Pay() {
		return reserve_Pay;
	}
	public void setReserve_Pay(String reserve_Pay) {
		this.reserve_Pay = reserve_Pay;
	}
	public String getReserve_Match() {
		return reserve_Match;
	}
	public void setReserve_Match(String reserve_Match) {
		this.reserve_Match = reserve_Match;
	}
	
	
}
