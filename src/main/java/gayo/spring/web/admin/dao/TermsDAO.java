package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.TermsVO;
@Repository
public class TermsDAO {
	
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	public TermsDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertTerms(TermsVO vo) {
		sqlSession.insert("TermsDAO.insertTerms", vo);
	}

	public void deleteTerms(TermsVO vo) {
		sqlSession.delete("TermsDAO.deleteTerms", vo);
	}

	public TermsVO getTerms(TermsVO vo) {

		return (TermsVO) sqlSession.selectOne("TermsDAO.getTerms", vo);
	}

	public List<TermsVO> getTermsList(TermsVO vo) {
		return sqlSession.selectList("TermsDAO.getTermsList", vo);
	}
}
