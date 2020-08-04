package gayo.spring.web.admin.vo;

public class AdminVO {
	private String admins_Id;
	private String admins_Pw;
	private String admins_State;
	
	
	
	@Override
	public String toString() {
		return "AdminVO [admins_Id=" + admins_Id + ", admins_Pw=" + admins_Pw + ", admins_State=" + admins_State + "]";
	}
	public String getAdmins_Id() {
		return admins_Id;
	}
	public void setAdmins_Id(String admins_Id) {
		this.admins_Id = admins_Id;
	}
	public String getAdmins_Pw() {
		return admins_Pw;
	}
	public void setAdmins_Pw(String admins_Pw) {
		this.admins_Pw = admins_Pw;
	}
	public String getAdmins_State() {
		return admins_State;
	}
	public void setAdmins_State(String admins_State) {
		this.admins_State = admins_State;
	}
}
