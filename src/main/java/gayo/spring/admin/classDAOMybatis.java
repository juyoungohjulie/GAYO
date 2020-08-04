package gayo.spring.admin;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gayo.spring.web.admin.vo.TermsVO;

@Repository
public class classDAOMybatis {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void insertTerms(TermsVO vo) {
		System.out.println("---> MyBatis로 insertBoard() 기능 처리");
		sqlSessionTemplate.insert("TermsDAO.insertTerms", vo);
	}

	public void updateTerms(TermsVO vo) {
		System.out.println("---> MyBatis로 updateBoard() 기능 처리");
		sqlSessionTemplate.update("BoardDAO.updateBoard", vo);
	}

	public void deleteTerms(TermsVO vo) {
		System.out.println("---> MyBatis로 deleteTerms() 기능 처리");
		sqlSessionTemplate.delete("TermsDAO.deleteTerms", vo);
	}

	public TermsVO getBoard(TermsVO vo) {
		System.out.println("---> MyBatis로 getBoard() 기능 처리");
		return (TermsVO) sqlSessionTemplate.selectOne("TermsDAO.getTerms", vo);
	}

	public List<TermsVO> getTermsList(TermsVO vo) {
		System.out.println("---> MyBatis로 getBoardList() 기능 처리");
		return sqlSessionTemplate.selectList("TermsDAO.getTermsList", vo);
	}
}
