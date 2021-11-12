package com.wolken;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Frooti extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String word = req.getParameter("frooti");
		resp.setContentType("text/html");   
		if(!word.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("frooti.html");
		rs.include(req,resp);
		}
	}

}
