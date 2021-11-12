package com.wolken.hackerrank;

import java.util.Scanner;

import com.wolken.hackerrank.dao.RegistrationDAO;
import com.wolken.hackerrank.dao.RegistrationDAOImpl;
import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.service.RegistrationService;
import com.wolken.hackerrank.service.RegistrationServiceImpl;

public class Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] arg)
	{
		RegistrationService service=new RegistrationServiceImpl();
		
		String ans;
		do {
			System.out.println("enter choice");
			System.out.println("1. register");
			System.out.println("2. login");
			System.out.println("3. forgot password");
			int choice=sc.nextInt();
			if(choice==1) {
				UserDTO dto=new UserDTO();
				System.out.println("enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("enter email");
				String email=sc.nextLine();
				System.out.println("enter password");
				String password=sc.nextLine();
				System.out.println("confirm password");
				String conPassword=sc.nextLine();
				System.out.println("enter contact");
				long contact=sc.nextLong();
				
				dto.setId(id);
				dto.setName(name);
				dto.setEmail(email);
				dto.setPassword(password);
				dto.setConPassword(conPassword);
				dto.setContact(contact);
				
				String result=service.validateAndSave(dto);
				System.out.println(result);
			}
			
			else if(choice==2)
			{
				LoginDTO ldto=new LoginDTO();
				sc.nextLine();
				System.out.println("enter email id");
				String email=sc.nextLine();
				System.out.println("enter password");
				String password=sc.nextLine();
				
				ldto.setEmail(email);
				ldto.setPassword(password);
				
				String result1=service.validateAndLogin(ldto);
				System.out.println(result1);
			}
			
			else if(choice==3)
			{
				LoginDTO ldto=new LoginDTO();
				sc.nextLine();
				System.out.println("enter email id");
				String email=sc.nextLine();
				
				ldto.setEmail(email);
				String result3=service.validateAndUpdatePassword(email);
				System.out.println(result3);
			}
			
			sc.nextLine();
			System.out.println("do u want to continue");
			ans=sc.nextLine();
			}while(ans.equals("yes"));
			
	}
	
}

