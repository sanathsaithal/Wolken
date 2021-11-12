package com.wolken;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HondaServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<head>");
	writer.println("<title>honda</title>");
	writer.println("</head>");
	writer.println("<body>");
	writer.println("Hello, from Honda");
	writer.println("City:		 5.11-6.2 lakhs");
	writer.println("Accord:		 6.82-8.0 lakhs");
	writer.println("CRV:		 13.28-17.73 lakhs");
	writer.println("Jazz:		 14.24-17.17 lakhs");
	writer.println("</body>");
	writer.println("</html>");
	writer.close();
}
}
