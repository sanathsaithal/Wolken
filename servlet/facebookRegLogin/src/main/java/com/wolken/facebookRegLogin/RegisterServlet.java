package com.wolken.facebookRegLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.facebookRegLogin.dto.FacebookRegisterDTO;
import com.wolken.facebookRegLogin.service.RegisterService;
import com.wolken.facebookRegLogin.service.RegisterServiceImpl;

public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String contact=req.getParameter("contact");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String relationship=req.getParameter("relationship");
		String city=req.getParameter("city");
		String nation=req.getParameter("nation");
		String password=req.getParameter("password");
		String conPassword=req.getParameter("conPassword");
		
		RegisterService service=new RegisterServiceImpl();
		FacebookRegisterDTO dto=new FacebookRegisterDTO();
		
		dto.setName(name);
		dto.setEmail(email);
		dto.setContact(contact);
		dto.setDob(dob);
		dto.setGender(gender);
		dto.setRelationship(relationship);
		dto.setCity(city);
		dto.setNationality(nation);
		dto.setPassword(password);
		if(password.equals(conPassword)) {
			String result=service.validateAndSave(dto);
			resp.setContentType("text/html");
			PrintWriter writer=resp.getWriter();
			writer.println("<html>");
			writer.println("<body>");
			writer.println("result"+result);
			writer.println("</body>");
			writer.println("</html>");
		}
		else {
			
		}
		
	}

}
