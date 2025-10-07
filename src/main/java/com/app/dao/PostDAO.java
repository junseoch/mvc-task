package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.PostVO;

public class PostDAO {
   
   public SqlSession sqlSession;
   
   public PostDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   public void insert(PostVO postVO) {
	   sqlSession.insert("post.insert");
   }
  
//   public Optional<PostVO> select(Long id) {
//	   return Optional.ofNullable(sqlSession.selectOne("post.select", id));
//   }
   
   public Optional<PostVO> select(Long id) {
	   return sqlSession.selectOne("post.select", id);
   }

   public List<PostVO> selectAll() {
	return sqlSession.selectList("post.selectAll");
   }

	public void update(PostVO postVO) {
	sqlSession.update("post.update", postVO);
	
	}
	
	public void delete(Long id) {
		sqlSession.delete("post.delete", id);
	}


}





