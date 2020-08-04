package gayo.spring.web.admin.vo;

import java.sql.Date;

public class ReviewVO {

		private String review_no;
		private String customer_id;
		private String admin_Id;
		private String review_title;
		private String review_content;
		private Date review_reg_date;
		private String review_count;
		private String review_score;
		

		
		
		@Override
		public String toString() {
			return "ReviewVO [review_no=" + review_no + ", customer_id=" + customer_id + ", admin_Id=" + admin_Id
					+ ", review_title=" + review_title + ", review_content=" + review_content + ", review_reg_date="
					+ review_reg_date + ", review_count=" + review_count + ", review_score=" + review_score + "]";
		}
		public String getAdmin_Id() {
			return admin_Id;
		}
		public void setAdmin_Id(String admin_Id) {
			this.admin_Id = admin_Id;
		}
		public String getReview_no() {
			return review_no;
		}
		public void setReview_no(String review_no) {
			this.review_no = review_no;
		}
		public String getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(String customer_id) {
			this.customer_id = customer_id;
		}
		public String getReview_title() {
			return review_title;
		}
		public void setReview_title(String review_title) {
			this.review_title = review_title;
		}
		public String getReview_content() {
			return review_content;
		}
		public void setReview_content(String review_content) {
			this.review_content = review_content;
		}
		
		public Date getReview_reg_date() {
			return review_reg_date;
		}
		public void setReview_reg_date(Date review_reg_date) {
			this.review_reg_date = review_reg_date;
		}
		public String getReview_count() {
			return review_count;
		}
		public void setReview_count(String review_count) {
			this.review_count = review_count;
		}
		public String getReview_score() {
			return review_score;
		}
		public void setReview_score(String review_score) {
			this.review_score = review_score;
		}
		
		
		
		
	}
