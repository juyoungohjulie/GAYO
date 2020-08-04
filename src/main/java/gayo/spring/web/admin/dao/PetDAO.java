package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.pet.vo.PetVO;

public class PetDAO {
	private SqlSession sqlSession;

	public PetDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertPet(PetVO vo) {
		sqlSession.insert("PetDAO.insertPet", vo);
	}

	public void deletePet(PetVO vo) {
		sqlSession.delete("PetDAO.deletePet", vo);
	}

	public PetVO getReview(PetVO vo) {

		return (PetVO) sqlSession.selectOne("PetDAO.getPet", vo);
	}

	public List<PetVO> getPetList(PetVO vo) {
		return sqlSession.selectList("PetDAO.getPetList", vo);
	}
}
