package gayo.spring.admin;

import java.util.List;

import gayo.spring.web.admin.vo.TermsVO;


public class ReviewServiceClient {
	public static void main(String[] args) {
		TermsVO vo = new TermsVO();
		classDAOMybatis boardDAO = new classDAOMybatis();
		vo.setCustomer_Id("c");
		vo.setTerms_Title("T");
		vo.setTerms_Content("C");
		vo.setTerms_No("1");
		vo.setTerms_Necessary("N");
		boardDAO.insertTerms(vo);
		List<TermsVO> boardList = boardDAO.getTermsList(vo);
		for (TermsVO board : boardList) {
			System.out.println("===> " + board.toString());
		}
		System.out.println("hello");
	}
}
