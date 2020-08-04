package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.UserCountVO;

public class UserCountDAO {
	private SqlSession sqlSession;

	public UserCountDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertUserCount(UserCountVO vo) {
		sqlSession.insert("UserCountDAO.insertUserCount", vo);
	}

	public void deleteUserCount(UserCountVO vo) {
		sqlSession.delete("UserCountDAO.deleteUserCount", vo);
	}

	public UserCountVO getUserCount(UserCountVO vo) {

		return (UserCountVO) sqlSession.selectOne("UserCountDAO.getUserCount", vo);
	}

	public List<UserCountVO> getUserCountList(UserCountVO vo) {
		return sqlSession.selectList("UserCountDAO.getUserCountList", vo);
	}
}
