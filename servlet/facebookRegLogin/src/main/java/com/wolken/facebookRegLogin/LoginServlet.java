package com.wolken.facebookRegLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.facebookRegLogin.dto.FacebookLoginDTO;
import com.wolken.facebookRegLogin.service.RegisterService;
import com.wolken.facebookRegLogin.service.RegisterServiceImpl;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RegisterService service=new RegisterServiceImpl();
		FacebookLoginDTO dto=new FacebookLoginDTO();
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		dto.setEmail(email);
		dto.setPassword(password);
		
		String login=service.validateAndLogin(dto);
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("result"+login);
		writer.println("</body>");
		writer.println("</html>");
	}
}
