package com.acti.Testcase;

import org.testng.annotations.Test;

public class TestCreateCustomer extends /*DriverScript - ctrl+shift+O to remove unnecessary imports*/ BaseTest{

	/*LoginPage lp;
	EnterTimePage etp;
	TaskPage tp;
    public TestCreateCustomer()
    {	
       super();
     }
@BeforeMethod
    public void preTest()
    {
    	initApp();
    	lp = new LoginPage();
    	etp = new EnterTimePage();
    	tp = new TaskPage();
     }*/
    @Test
    public void testCreateCustomer()
    {
    	lp.validateLogin("admin", "manager");
    	String userLogged = etp.getUserLoggedInText();
    	System.out.println(userLogged);
    	etp.clickTaskMenu();
    	tp.enterCustomerName("TestCustomer12");
    	tp.enterCustomerDescription("Creating Dummy Customer for Test");
    	tp.clickcreateCustomerButton();
    	etp.clickLogoutLink();
    	
    }
    
}