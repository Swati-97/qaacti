package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.acti.Base.DriverScript;
import com.acti.Pages.LoginPage;

/*
 * Script: TC-LoginPage
 * Tester: Swati
 * Verified By: Swati
 * Date Created: 4/27/2020
 * Last Modified: 4/27/2020
 */

public class LoginPageTest extends /*DriverScript*/ BaseTest{

	/*LoginPage lp;
	
	public LoginPageTest()
	{
		//Super keyword is used to call the parent class constructor
		super();  // this is inbuilt method in java known as super
		//ctrl move the mouse pointer on super it will take you to the base class in driver script
	}
		
	@BeforeMethod
	public void preTest()
	{
		initApp(); // method we have written in driver script we r calling here by initApp
		lp = new LoginPage();
	}
	@AfterMethod
	public void postTest()
	{
		driver.close();
	}*/
	@Test(priority=1)   // this is actual test case
	public void testVerifyActiLogo()
	{
		//instead of creating global object LoginPAge lp we could have create in hear too
		boolean flag = lp.verifyActiLogo();
		Assert.assertTrue(flag);
		}
	@Test(priority=2)
	public void testLoginPageTitle()
	{
		String title = lp.verifyLoginPageTitle();
		Assert.assertEquals("actiTime - Login", title);
	}
	@Test(priority=3)
	public void testValidateLoginFunction()
	{
		lp.validateLogin("admin", "manager");
	}
	@Test(priority=4)
	public void testValidateLoginFunction1()
	{
		lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
}

