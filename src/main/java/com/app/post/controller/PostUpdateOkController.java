package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.vo.PostVO;

public class PostUpdateOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		Result result = new Result();
		
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO();
		Long id = Long.parseLong(req.getParameter("id"));
		
		
		// 사용자가 수정폼에서 입력한 값을 DAO를 통해 update쿼리를 날린다 
		postVO.setId(Long.parseLong(req.getParameter("id")));
		postVO.setPostTitle(req.getParameter("postTitle"));
		postVO.setPostContent(req.getParameter("postContent"));
		
		
		postDAO.update(postVO);
		
		result.setRedirect(true);
		result.setPath("list.post");
		
		return result;
		
	}
}
