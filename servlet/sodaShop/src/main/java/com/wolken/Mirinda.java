package com.wolken;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mirinda extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String word = req.getParameter("mirinda");
	resp.setContentType("text/html");   
	if(!word.isEmpty()) {
		RequestDispatcher rs = req.getRequestDispatcher("mirinda.html");
	rs.include(req,resp);
	}
}
}
