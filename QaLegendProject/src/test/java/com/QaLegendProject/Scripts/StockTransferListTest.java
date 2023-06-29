package com.QaLegendProject.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.QaLegendProject.Base.TestBasePro;
import com.QaLegendProject.Pages.StockTransfersListPage;

import com.QaLegendProject.constants.ConstantsPro;
import com.QaLegendProject.utiliities.TableUtilities;



public class StockTransferListTest extends TestBasePro {
	StockTransfersListPage objStockTra;
  @Test(priority=6)
  public void clickStockTransferList() 
  {
	  objStockTra=new StockTransfersListPage(driver);
	  objStockTra.clickListStockTransferSubMenu();
  }
  @Test(priority=7,description="Validating show entries dropdown button",retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)
  public void checkingShowEntriesDropdownText() 
  {
	  objStockTra=new StockTransfersListPage(driver);
	  objStockTra.selectFromShowEntriesDropDown(ConstantsPro.SHOWENTRIESDROPDOWNINDEX);
	  Assert.assertEquals(objStockTra.gettingTextOfDropdown(), ConstantsPro.SHOWENTRIESDROPDOWNTEXT);
	  
	  
  }
  @Test(priority=11,description="Validating copy functionality under Action menu",retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)
  public void checkingCopyFunctionality() 
  {
	  objStockTra.clickListStockTransferSubMenu();
	  objStockTra=new StockTransfersListPage(driver);
	  objStockTra.clickCopy();
	  Assert.assertTrue(objStockTra.checkingPopup()); 
	 
  }
  @Test(priority=8,description="Verifying functionality of view deatails button",retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)
  public void viewDeatailsFunctionality() 
  {
	  objStockTra=new StockTransfersListPage(driver);
	  objStockTra.clickViewDetails();
	  Assert.assertTrue(objStockTra.checkProductDeatailsDisplayed());
  }
  @Test(priority=9,description="Verifying number of columns in web table listing all stock transfers",retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)
  public void verifyNoOfColumns() 
  {
	  objStockTra=new StockTransfersListPage(driver);
	  Assert.assertEquals(objStockTra.noOfColumns(), ConstantsPro.COLUMNNOS);
  }
  @Test(priority=10,description="Verifying Webtable element",retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)
  public void checkingWebtableElementPresent()
  {
	  objStockTra=new StockTransfersListPage(driver);
  	Assert.assertTrue(objStockTra.checkingWebtableElement());
  			
  	
  	
  }
  
}
