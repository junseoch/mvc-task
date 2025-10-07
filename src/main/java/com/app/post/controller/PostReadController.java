package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.vo.PostVO;

public class PostReadController implements Action {
    @Override
    public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Result result = new Result();
        PostDAO postDAO = new PostDAO();

        Long id = Long.parseLong(req.getParameter("id"));

        PostVO post = postDAO.select(id).orElse(null);
        req.setAttribute("post", post);
        
        result.setPath("/read.jsp");
        return result;
    }
}
