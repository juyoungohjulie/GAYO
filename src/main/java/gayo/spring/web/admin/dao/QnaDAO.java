package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.QnaVO;

public class QnaDAO {
	private SqlSession sqlSession;

	public QnaDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertQnaCustomer(QnaVO vo) {
		sqlSession.insert("QnaDAO.insertQnaCustomer", vo);
	}
	
	public void insertQnaAdmin(QnaVO vo) {
		sqlSession.insert("QnaDAO.insertQnaAdmin", vo);
	}

	public void deleteQna(QnaVO vo) {
		sqlSession.delete("QnaDAO.deleteQna", vo);
	}

	public QnaVO getQna(QnaVO vo) {

		return (QnaVO) sqlSession.selectOne("QnaDAO.getQna", vo);
	}

	public List<QnaVO> getQnaList(QnaVO vo) {
		return sqlSession.selectList("QnaDAO.getQnaList", vo);
	}
}
