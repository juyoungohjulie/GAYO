package gayo.spring.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.admin.vo.CustomerVO;

public class CustomerDAO {
	private SqlSession sqlSession;

	public CustomerDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertCustomer(CustomerVO vo) {
		sqlSession.insert("CustomerDAO.insertCustomer", vo);
	}

	public void deleteCustomer(CustomerVO vo) {
		sqlSession.delete("CustomerDAO.deleteCustomer", vo);
	}

	public CustomerVO getCustomer(CustomerVO vo) {

		return (CustomerVO) sqlSession.selectOne("CustomerDAO.getCustomer", vo);
	}

	public List<CustomerVO> getCustomerList(CustomerVO vo) {
		return sqlSession.selectList("CustomerDAO.getCustomerList", vo);
	}
}
