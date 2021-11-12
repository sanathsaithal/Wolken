package com.wolken;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MahindraServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
	
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<head>");
	writer.println("<title>mahindra</title>");
	writer.println("</head>");
	writer.println("<body>");
	writer.println("Hello, from Mahindra");
	writer.println("Thar:		 12.11-16.2 lakhs");
	writer.println("XUV 300:		 6.82-8.0 lakhs");
	writer.println("XUV 700:		 13.28-17.73 lakhs");
	writer.println("XUV 500:		 14.24-17.17 lakhs");
	writer.println("Bolero:		 7.24-88.17 lakhs");
	writer.println("</body>");
	writer.println("</html>");
	writer.close();
}
}
