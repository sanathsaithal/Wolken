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

public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RegisterService service=new RegisterServiceImpl();
		FacebookLoginDTO dto=new FacebookLoginDTO();
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String cnfpassword=req.getParameter("cnfpassword");
		dto.setEmail(email);
		dto.setPassword(password);
		if(password.equals(cnfpassword)) {
			String update=service.validateAndUpdate(dto);
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.println("<html>");
			writer.println("<body>");
			writer.println("result"+update);
			writer.println("</body>");
			writer.println("</html>");
		}
		
		
		
	}
}
