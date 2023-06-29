package com.QaLegendProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QaLegendProject.constants.ConstantsPro;
import com.QaLegendProject.utiliities.WaitUtilitiesPro;

public class AddPurchasePage {
	public WebDriver driver;
	@FindBy(id="tour_step6_menu")
	WebElement puchaseMenu;
	@FindBy(xpath="//a[text()=' Add Purchase']")
	WebElement addPurchaseSubmenu;
	@FindBy(id="upload_document")
	WebElement browseFile;
	@FindBy(xpath="//span[text()='Remove']")
	WebElement removeFileButton;
	@FindBy(xpath="//button[text()='End tour']")
	WebElement endTour;
	
	public AddPurchasePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAddPuchase()
	{
		puchaseMenu.click();
		WaitUtilitiesPro.waitForElementToBeVisible(driver, addPurchaseSubmenu);
		addPurchaseSubmenu.click();
	}
	public void uploadFile(String location)
	{
		browseFile.sendKeys(location);
		
	}
	public boolean checkingRemoveButtonVisibility()
	{
		WaitUtilitiesPro.waitForElementToBeVisible(driver, removeFileButton);
		return removeFileButton.isDisplayed();
	}
    public void clickEndTour()
	
	{
	    WaitUtilitiesPro.waitForElementToBeVisible(driver, endTour);
		endTour.click();
	}
	
	

}
