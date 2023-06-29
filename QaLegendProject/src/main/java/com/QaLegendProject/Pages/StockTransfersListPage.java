package com.QaLegendProject.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.QaLegendProject.constants.ConstantsPro;
import com.QaLegendProject.utiliities.PageUtilitiesPro;
import com.QaLegendProject.utiliities.TableUtilities;
import com.QaLegendProject.utiliities.WaitUtilitiesPro;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
public class StockTransfersListPage {
	public WebDriver driver;
	@FindBy(xpath="//span[text()='Stock Transfers']")
	WebElement stockTransferMenu;
	@FindBy(xpath="//a[@href='https://qalegend.com/billing/public/stock-transfers']")
	WebElement listStockTransferSubMenu;
	@FindBy(xpath="//select[@name='stock_transfer_table_length']")
	WebElement showEntriesDropdown;
	@FindBy(xpath="//option[@value='50']")
	WebElement showEntriesDropdown50;
	@FindBy(xpath="//button[text()='End tour']")
	WebElement endTour;
	@FindBy(xpath="//a[@class=\'btn buttons-collection btn-info\']")
	WebElement actionsButton;
	@FindBy(xpath="//i[@class='fa fa-files-o']")
	WebElement copy;
	@FindBy(xpath="//div[@id='datatables_buttons_info']")
	WebElement popUp;
	@FindBy(xpath="//*[@id=\"463\"]/td[8]/button")
	WebElement viewDetails;
	@FindBy(xpath="	//table//tbody//tr[2]//th[1][text()='Product']")
	WebElement productName;
	@FindBy(xpath="//table//thead//th")
	List<WebElement>columnElements;
	@FindBy(xpath="//table//tbody//tr[@role='row']")
	List<WebElement>rowElements;
	@FindBy(tagName="td")
	List<WebElement>particRow;
	@FindBy(id="ref_no")
	WebElement referenceNo;
	@FindBy(id="select2-location_id-container")
	WebElement locationDropdown;
	
	

	

	
	
	
	public StockTransfersListPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickListStockTransferSubMenu() 
	{
		
		stockTransferMenu.click();
		listStockTransferSubMenu.click();
	}
	public void selectFromShowEntriesDropDown(int showEntriesIndex)
	{
		PageUtilitiesPro.selectClassDropdown( showEntriesDropdown).selectByIndex(showEntriesIndex);
	}
	public String gettingTextOfDropdown()
	{
		return showEntriesDropdown50.getText();
	}
	public void clickEndTour()
	
	{
		endTour.click();
	}
    public void waitClickEndTour()
	
	{
	    WaitUtilitiesPro.waitForElementToBeVisible(driver, endTour);
	}
   
    public void clickCopy()
    {   actionsButton.click();
        WaitUtilitiesPro.waitForElementToBeVisible(driver, copy);
    	copy.click();
    }
    public boolean checkingPopup() 
    {
    	WaitUtilitiesPro.waitForElementToBeVisible(driver, popUp);
    	return popUp.isDisplayed();
    }
    public void clickViewDetails()
    {
    	WaitUtilitiesPro.waitForElementToBeVisible(driver, viewDetails);
    	viewDetails.click();
    }
    public boolean checkProductDeatailsDisplayed()
    {
    	WaitUtilitiesPro.waitForElementToBeVisible(driver, productName);
    	return productName.isDisplayed();
    }
    public int noOfColumns()
    {
    	return columnElements.size();
    }
    public boolean checkingWebtableElement()
    {
    	return TableUtilities.checkTableElement(rowElements, columnElements,ConstantsPro.CHECKTABLEELEMENT,ConstantsPro.TAGNAME);
    			
    	
    	
    }
   

}
