package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.ReviewVO;

public class ReviewDAO {
	private SqlSession sqlSession;

	public ReviewDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertReview(ReviewVO vo) {
		sqlSession.insert("ReviewDAO.insertReview", vo);
	}

	public void deleteReview(ReviewVO vo) {
		sqlSession.delete("ReviewDAO.deleteReview", vo);
	}

	public ReviewVO getReview(ReviewVO vo) {

		return (ReviewVO) sqlSession.selectOne("ReviewDAO.getReview", vo);
	}

	public List<ReviewVO> getReviewList(ReviewVO vo) {
		return sqlSession.selectList("ReviewDAO.getReviewList", vo);
	}
}
