package com.wolken.bank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	
	Logger logger=LoggerFactory.getLogger(BalanceController.class);
	
	@GetMapping("getBalance")
	String getBalance()
	{
		logger.info("balance check");
		return "balance is Rs. 100000";
	}
	
	@GetMapping("getAccNo")
	String getAccNo()
	{
		logger.info("Account No check: Account no is: 09876543211234567");
		return "Account no is: 09876543211234567";
	}
	
	@GetMapping("getAccountHolderName")
	String getAccountHolderName()
	{
		logger.info("Account belongs to Sanath");
		return "Account belongs to : Sanath";
	}
	
	@GetMapping("getIFSC")
	String getIFSC()
	{
		logger.info("IFSC code is: UNIB2134");
		return "IFSC code is: UNIB2134";
	}
}
