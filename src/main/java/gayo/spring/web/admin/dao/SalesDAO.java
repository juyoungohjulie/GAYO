package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.ReviewVO;
import gayo.spring.web.admin.vo.SalesVO;

public class SalesDAO {
	private SqlSession sqlSession;

	public SalesDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertSales(SalesVO vo) {
		sqlSession.insert("SalesDAO.insertSales", vo);
	}

	public void deleteSales(ReviewVO vo) {
		sqlSession.delete("SalesDAO.deleteSales", vo);
	}

	public SalesVO getSales(SalesVO vo) {

		return (SalesVO) sqlSession.selectOne("SalesDAO.getSales", vo);
	}

	public List<SalesVO> getSalesList(SalesVO vo) {
		return sqlSession.selectList("SalesDAO.getSalesList", vo);
	}
}
