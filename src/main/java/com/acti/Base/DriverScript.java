package com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {

	public static WebDriver driver; // define a webdriver globally
	public static Properties prop;
	
	//constructor - to load the property file and the property file has info for which url and which browser to choose from
	public DriverScript() 
	{
		try
		{
			File src = new File("./actiConfiguration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
		catch (Exception e)
		{
			System.out.println("Unable to load property file "+e.getMessage());;
		}
		
	}
	// created init method , init method to read property file and get the value of the browser
	// which works for key and value pair, supply the value of key and base upon the value it will pick the value from the property file
	
	//just do the unit test to check the code is correct in driver script
	
	//@Test ---- after you check the code is correct or not immediately you 
	//delete this @test method and related testng import statement fort he top
	
	public static void initApp()
	{
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./actiBrowsers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"));
		{
			System.setProperty("webdriver.gecko.driver", "./actiBrowsers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url = prop.getProperty("qaurl");
		driver.get(url);
		
	}
	
}
