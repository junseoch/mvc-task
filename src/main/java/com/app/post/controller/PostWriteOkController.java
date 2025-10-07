package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.vo.PostVO;

public class PostWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();

		
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO();
		
		postVO.setPostContent(req.getParameter("id")); 
		postVO.setPostTitle(req.getParameter("postTitle"));
		postVO.setPostTitle(req.getParameter("postTitle"));
		
		postDAO.insert(postVO);
		
		result.setPath("/mvc_task/read.jsp");
		result.setRedirect(true);
		return result;
	}
	

}
