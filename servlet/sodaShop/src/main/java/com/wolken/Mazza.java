package com.wolken;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mazza extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String word = req.getParameter("mazza");
		resp.setContentType("text/html");   
		if(!word.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("mazza.html");
		rs.include(req,resp);
		}
	
	}

}
