package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.ReserveVO;

public class ReserveDAO {
	
	private SqlSession sqlSession;

	public ReserveDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertReserve(ReserveVO vo) {
		sqlSession.insert("ReserveDAO.insertReserve", vo);
	}

	public void deleteReserve(ReserveVO vo) {
		sqlSession.delete("ReserveDAO.deleteReserve", vo);
	}

	public ReserveVO getReserve(ReserveVO vo) {

		return (ReserveVO) sqlSession.selectOne("ReserveDAO.getReserve", vo);
	}

	public List<ReserveVO> getReserveList(ReserveVO vo) {
		return sqlSession.selectList("ReserveDAO.getReserveList", vo);
	}
}
