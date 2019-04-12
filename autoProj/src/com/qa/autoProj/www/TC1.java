package com.qa.autoProj.www;

import org.testng.annotations.Test;

public class TC1 extends base
{
	VerifyTitlePage titlepage = new VerifyTitlePage(); 
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testCase1()
	{
		String currentPage = "home page";
		if(titlepage.equals(currentPage))
		{
			System.out.println("Paassss");
		}
	}
}
