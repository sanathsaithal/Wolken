package com.wolken;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FordServlet extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<head>");
	writer.println("<title>ford</title>");
	writer.println("</head>");
	writer.println("<body>");
	writer.println("Hello, from Ford India");
	writer.println("Figo:		 5.11-6.2 lakhs");
	writer.println("Freestyle:		 5.82-7.0 lakhs");
	writer.println("Aspire:		 7.28-8.73 lakhs");
	writer.println("Ecosport:		 11.24-14.17 lakhs");
	writer.println("Endeavour:		 34.24-38.17 lakhs");
	writer.println("</body>");
	writer.println("</html>");
	writer.close();
}
}
