package gayo.spring.pet.vo;



public class PetVO {
	private String customer_Id;
	private String customer_Name;
	private String customer_Gender;
	private String customer_Birth;
	private String customer_Phone;
	private String customer_Email;
	private String pet_Img;
	private String pet_Area;
	private String pet_Dtails;
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
	public String getCustomer_Gender() {
		return customer_Gender;
	}
	public void setCustomer_Gender(String customer_Gender) {
		this.customer_Gender = customer_Gender;
	}
	public String getCustomer_Birth() {
		return customer_Birth;
	}
	public void setCustomer_Birth(String customer_Birth) {
		this.customer_Birth = customer_Birth;
	}
	public String getCustomer_Phone() {
		return customer_Phone;
	}
	public void setCustomer_Phone(String customer_Phone) {
		this.customer_Phone = customer_Phone;
	}
	public String getCustomer_Email() {
		return customer_Email;
	}
	public void setCustomer_Email(String customer_Email) {
		this.customer_Email = customer_Email;
	}
	public String getPet_Img() {
		return pet_Img;
	}
	public void setPet_Img(String pet_Img) {
		this.pet_Img = pet_Img;
	}
	public String getPet_Area() {
		return pet_Area;
	}
	public void setPet_Area(String pet_Area) {
		this.pet_Area = pet_Area;
	}
	public String getPet_Dtails() {
		return pet_Dtails;
	}
	public void setPet_Dtails(String pet_Dtails) {
		this.pet_Dtails = pet_Dtails;
	}
	@Override
	public String toString() {
		return "PetVO [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", customer_Gender="
				+ customer_Gender + ", customer_Birth=" + customer_Birth + ", customer_Phone=" + customer_Phone
				+ ", customer_Email=" + customer_Email + ", pet_Img=" + pet_Img + ", pet_Area=" + pet_Area
				+ ", pet_Dtails=" + pet_Dtails + "]";
	}
	
	
	
}
