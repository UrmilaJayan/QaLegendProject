package com.QaLegendProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QaLegendProject.utiliities.WaitUtilitiesPro;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='username']")
	WebElement user;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//strong[text()='These credentials do not match our records.']")
	WebElement wrongCredential;
	@FindBy(xpath="//button[text()='End tour']")
	WebElement loginSuccess;
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String userNamex)
	{
		user.sendKeys(userNamex);
		
	}
	public void setPassword(String password1x)
	{
		password.sendKeys(password1x);
	}
	public void clickSignIn()
	{
		submit.click();
	}
	public void clearUsernameField()
	{
		user.clear();
		
	}
	public boolean invalidCredentials()
	{
		WaitUtilitiesPro.waitForElementToBeVisible(driver, wrongCredential);
		return wrongCredential.isDisplayed();
	}
	public boolean validCredentials()
	{
		WaitUtilitiesPro.waitForElementToBeVisible(driver, loginSuccess);
		return loginSuccess.isDisplayed();
	}
	
	

}
