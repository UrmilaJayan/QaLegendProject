package com.QaLegendProject.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.QaLegendProject.Base.TestBasePro;
import com.QaLegendProject.Pages.AddPurchasePage;
import com.QaLegendProject.constants.ConstantsPro;

public class AddPurchaseTest extends  TestBasePro
{
	AddPurchasePage objAddPurch;
  @Test(priority=5,description="Verifying File Upload",retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class,groups= {"smoke"})
  public void checkinkFileUploadFunctionality() 
  {
	  objAddPurch=new AddPurchasePage(driver);
	  objAddPurch.clickEndTour();
	  objAddPurch.clickAddPuchase();
	  objAddPurch.uploadFile(ConstantsPro.FILEUPLOADLOCATION);
	  Assert.assertTrue(objAddPurch.checkingRemoveButtonVisibility());
	  
  }
}
