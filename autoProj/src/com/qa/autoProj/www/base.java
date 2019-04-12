package com.qa.autoProj.www;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.qa.autoProj.Utilities.ReadConfig;

public class base 
{
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public static WebDriver dr;
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			options.addArguments("disable-notification");
			File f = new File(".\\Drivers\\extension_4_0_0_0.crx");
			options.addExtensions(f);
			dr=new ChromeDriver(options);
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			dr = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			dr = new InternetExplorerDriver();
		}
		
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.get(baseURL);
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		dr.quit();
//	}
	
}
