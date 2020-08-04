package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.AdminVO;

public class AdminDAO {
	private SqlSession sqlSession;

	public AdminDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertAdmin(AdminVO vo) {
		sqlSession.insert("AdminDAO.insertAdmin", vo);
	}

	public void deleteAdmin(AdminVO vo) {
		sqlSession.delete("AdminDAO.deleteAdmin", vo);
	}

	public AdminVO getAdmin(AdminVO vo) {

		return (AdminVO) sqlSession.selectOne("AdminDAO.getAdmin", vo);
	}

	public List<AdminVO> getAdminList(AdminVO vo) {
		return sqlSession.selectList("AdminDAO.getAdminList", vo);
	}
}
