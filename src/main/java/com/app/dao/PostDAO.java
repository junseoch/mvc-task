package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.PostVO;


public class PostDAO {
   
   public SqlSession sqlSession;
   
   public PostDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   // 게시물 작성
   public void insert(PostVO postVO) {
	   sqlSession.insert("post.insert", postVO);
   }
   
   // 게시물 목록
   public List<PostVO> selectAll() {
	   List<PostVO> posts = sqlSession.selectList("post.selectAll");
	   return posts;
   }
   
   // 게시물 상세보기
   public Optional<PostVO> select(Long id) {
	   return Optional.ofNullable(sqlSession.selectOne("post.select", id)) ;
   }
   
   
   // 게시물 수정
   public void update(PostVO postVO) {
	   sqlSession.update("post.update", postVO);
   }
   
   // 게시물 삭제
   public void delete(Long id) {
	   sqlSession.delete("post.delete", id);
   }
   
}
