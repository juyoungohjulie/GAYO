package gayo.spring.web.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import gayo.spring.web.customer.impl.CustomerDAO;
import gayo.spring.web.customer.impl.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Inject CustomerDAO dao;
	
	@Override
	public void register(CustomerVO vo) throws Exception {
		dao.register(vo);
	}
	
	@Override
	public CustomerVO login(CustomerVO vo) throws Exception {
		return dao.login(vo);
	}

}
