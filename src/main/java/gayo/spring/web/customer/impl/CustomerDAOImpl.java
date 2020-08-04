package gayo.spring.web.customer.impl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Inject SqlSession sql;
	//회원가입
	
	@Override
	public void register(CustomerVO vo) throws Exception {
		sql.insert("memberMapper.register", vo);
	}
	
	@Override
	public CustomerVO login(CustomerVO vo) throws Exception{
			return sql.selectOne("customerMapper.login", vo);
	}	
	
}
