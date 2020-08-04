package gayo.spring.web.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import gayo.spring.admin.sqlSessionFactoryBean;
import gayo.spring.web.admin.vo.NoticeVO;

public class NoticeDAO {
	private SqlSession sqlSession;

	public NoticeDAO() {
		sqlSession = sqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertNotice(NoticeVO vo) {
		sqlSession.insert("NoticeDAO.insertNotice", vo);
	}

	public void deleteNotice(NoticeVO vo) {
		sqlSession.delete("NoticeDAO.deleteNotice", vo);
	}

	public NoticeVO getNotice(NoticeVO vo) {

		return (NoticeVO) sqlSession.selectOne("NoticeDAO.getNotice", vo);
	}

	public List<NoticeVO> getNoticeList(NoticeVO vo) {
		return sqlSession.selectList("NoticeDAO.getNoticeList", vo);
	}
}
