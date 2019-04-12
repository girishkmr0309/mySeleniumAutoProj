package com.qa.autoProj.www;


import org.testng.annotations.Test;



public class VerifyTitlePage extends base
{
	 
	@Test
	public void getTitle()
	{
		if(dr.getTitle().equalsIgnoreCase("home page"))
		{
			System.out.println(dr.getTitle());
		}
	}
}
