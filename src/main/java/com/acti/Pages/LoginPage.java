package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.Base.DriverScript;
import com.acti.Utils.Common;

/*
 * Script: LoginPage
 * Tester: Swati
 * Verified By: Swati
 * Date Created: 4/27/2020
 * Last Modified: 4/27/2020
 */

//in loginpage.jave script this r just supporting class. all the validation will be in test cases
public class LoginPage extends DriverScript{

	
	//in this page class first identify the elements
//*************************************** page elements*************************************

  @FindBy(id="logoContainer") WebElement actiLogo;// you can use any locators out of 8
  @FindBy(id="username") WebElement usernameTb; //or you can use tbUsername, give some meaningful name
  @FindBy(name="pwd") WebElement passwordTb;
  @FindBy(id="loginButton") WebElement loginBtn;
    
//*************************************** page Initialization*************************************
// now write down constructor. using the constructor we have to initialize the element
//PageFactory is the class in POM which is to initialize the page elements of the class (the top 4 lines under page element actilogo, username, passwordtb,loginbtn)
  public LoginPage()
  {
	PageFactory.initElements(driver, LoginPage.class);
	//PageFactory.initElements(driver, this);
	//what is the keyword to represent the current class global variables?"This" instead of LoginPage.class we can use This.
	// create class LoginPAge for pagefactory  
  }
   
//*************************************** page Actions/Methods*************************************

  public boolean verifyActiLogo()
  {
	  return actiLogo.isDisplayed();
  }
  
  public void validateLogin(String username, String password)
  {
	  Common.highLightelement(usernameTb);
	  usernameTb.sendKeys(username);
	  Common.highLightelement(passwordTb);
	  passwordTb.sendKeys(password);
	  Common.highLightelement(loginBtn);
	  loginBtn.click();
  }
  
  public String verifyLoginPageTitle()
  {
	  return driver.getTitle();
  }
    
}
