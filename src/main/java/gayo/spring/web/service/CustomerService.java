package gayo.spring.web.service;

import gayo.spring.web.customer.impl.CustomerVO;

public interface CustomerService {
	
	public void register(CustomerVO vo) throws Exception;
	
	public CustomerVO login(CustomerVO vo) throws Exception;
 }
