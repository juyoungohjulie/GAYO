package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.PayVO;

public class PayDAO {
	private SqlSession sqlSession;

	public PayDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertPay(PayVO vo) {
		sqlSession.insert("PayDAO.insertPay", vo);
	}

	public void deletePay(PayVO vo) {
		sqlSession.delete("PayDAO.deletePay", vo);
	}

	public PayVO getPay(PayVO vo) {

		return (PayVO) sqlSession.selectOne("PayDAO.getPay", vo);
	}

	public List<PayVO> getPayList(PayVO vo) {
		return sqlSession.selectList("PayDAO.getPayList", vo);
	}
}
