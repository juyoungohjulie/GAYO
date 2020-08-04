package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.BannerVO;

public class BannerDAO {
	private SqlSession sqlSession;

	public BannerDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertBanner(BannerVO vo) {
		sqlSession.insert("BannerDAO.insertBanner", vo);
	}

	public void deleteBanner(BannerVO vo) {
		sqlSession.delete("BannerDAO.deleteBanner", vo);
	}

	public BannerVO getBanner(BannerVO vo) {

		return (BannerVO) sqlSession.selectOne("BannerDAO.getBanner", vo);
	}

	public List<BannerVO> getBannerList(BannerVO vo) {
		return sqlSession.selectList("BannerDAO.getBannerList", vo);
	}
}
