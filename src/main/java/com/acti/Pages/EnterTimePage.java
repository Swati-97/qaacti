package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class EnterTimePage extends DriverScript
{
	@FindBy(id="logoutLink") WebElement logoutLink;
	@FindBy(id="container_tasks") WebElement taskMenu;
	@FindBy(xpath="//a[@class='userProfileLink username']") WebElement userLoggedName;

	public EnterTimePage()
	{
       PageFactory.initElements(driver, this);
}
	public void clickLogoutLink()
	{
		logoutLink.click();
	}
	
	public void clickTaskMenu()
	{
		taskMenu.click();
	}
	public String getUserLoggedInText()
	{
		return userLoggedName.getText();
	}
	
}

