package gayo.spring.notice.vo;

public class NoticeVO {
	private int notice_No;
	private String notice_Title;
	private String notice_Content;
	private String notice_Reg_Date;
	
	public int getNotice_No() {
		return notice_No;
	}
	public void setNotice_No(int notice_No) {
		this.notice_No = notice_No;
	}
	public String getNotice_Title() {
		return notice_Title;
	}
	public void setNotice_Title(String notice_Title) {
		this.notice_Title = notice_Title;
	}
	public String getNotice_Content() {
		return notice_Content;
	}
	public void setNotice_Content(String notice_Content) {
		this.notice_Content = notice_Content;
	}
	public String getNotice_Reg_Date() {
		return notice_Reg_Date;
	}
	public void setNotice_Reg_Date(String notice_Reg_Date) {
		this.notice_Reg_Date = notice_Reg_Date;
	}
	
	@Override
	public String toString() {
		return "NoticeVO [notice_No=" + notice_No + ", notice_Title=" + notice_Title + ", notice_Content="
				+ notice_Content + ", notice_Reg_Date=" + notice_Reg_Date + "]";
	}
	
	
	
}
