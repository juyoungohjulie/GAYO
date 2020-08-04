package gayo.spring.web.admin.vo;

public class BannerVO {
	private String banner_No;
	private String banner_Img;
	
	
	
	@Override
	public String toString() {
		return "BannerVO [banner_No=" + banner_No + ", banner_Img=" + banner_Img + "]";
	}
	public String getBanner_No() {
		return banner_No;
	}
	public void setBanner_No(String banner_No) {
		this.banner_No = banner_No;
	}
	public String getBanner_Img() {
		return banner_Img;
	}
	public void setBanner_Img(String banner_Img) {
		this.banner_Img = banner_Img;
	}
	
	
}
