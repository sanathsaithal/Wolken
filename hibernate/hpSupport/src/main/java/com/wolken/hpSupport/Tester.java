package com.wolken.hpSupport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.wolken.hpSupport.dto.UserDTO;
import com.wolken.hpSupport.service.RegistrationService;
import com.wolken.hpSupport.service.RegistrationServiceImpl;

public class Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		
		RegistrationService service=new RegistrationServiceImpl();
		
		UserDTO dto=new UserDTO();
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter email id");
		String email=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("enter product id");
		String productId=sc.nextLine();
		System.out.println("enter complaint");
		String complaint=sc.nextLine();
		System.out.println("enter date of complaint registration");
		String complaintRegDate=sc.nextLine();
		Date dob1=new SimpleDateFormat("dd/MM/yyyy").parse(complaintRegDate);
		
		dto.setId(id);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPassword(password);
		dto.setProductId(productId);
		dto.setComplaint(complaint);
		dto.setComplaintRegDate(dob1);
		
		String result=service.validateAndSave(dto);
		System.out.println(result);
	}
	
	
}
