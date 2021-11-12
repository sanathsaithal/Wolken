package com.wolken;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KiaServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
	
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<head>");
	writer.println("<title>kia</title>");
	writer.println("</head>");
	writer.println("<body>");
	writer.println("Hello, from Kia");
	writer.println("Seltos:		 5.11-6.2 lakhs");
	writer.println("Sonnet:		 6.82-8.0 lakhs");
	writer.println("Carnival:		 13.28-17.73 lakhs");
	writer.println("</body>");
	writer.println("</html>");
	writer.close();
}
}
