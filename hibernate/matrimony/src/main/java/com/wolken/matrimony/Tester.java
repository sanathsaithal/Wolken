package com.wolken.matrimony;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.wolken.matrimony.dto.UserDTO;
import com.wolken.matrimony.service.RegistrationService;
import com.wolken.matrimony.service.RegistrationServiceImpl;

public class Tester {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException
	{
		RegistrationService service=new RegistrationServiceImpl();
		
		UserDTO dto=new UserDTO();
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter email");
		String email=sc.nextLine();
		System.out.println("enter gender");
		String gender=sc.nextLine();
		System.out.println("enter father name");
		String fatherName=sc.nextLine();
		System.out.println("enter mother name");
		String motherName=sc.nextLine();
		System.out.println("enter date of birth");
		String dob=sc.nextLine();
		Date dob1=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		System.out.println("enter contact no");
		long contact=sc.nextLong();
		System.out.println("enter height");
		int height=sc.nextInt();
		
		dto.setId(id);
		dto.setName(name);
		dto.setEmail(email);
		dto.setGender(gender);
		dto.setFatherName(fatherName);
		dto.setMotherName(motherName);
		dto.setDob(dob1);
		dto.setContact(contact);
		dto.setHeight(height);
		
		String result=service.validateAndSave(dto);
		System.out.println(result);
	}
}
