package com.QaLegendProject.Scripts;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.QaLegendProject.Base.TestBasePro;
import com.QaLegendProject.Pages.LoginPage;
import com.QaLegendProject.constants.ConstantsPro;
import com.QaLegendProject.utiliities.ExcelRead;

public class LoginTest extends TestBasePro {
	LoginPage objLogin;
	  @Test(dataProvider="invalidUserValidPassword",priority=1,description="Verifying sign in using invalid user name and valid password",groups= {"smoke"},retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)
	  
	  public void verifySigninInvalidUserValidPassword(String userName,int password1) {
		  
		  
		  objLogin=new LoginPage(driver);
		  objLogin.setUserName(userName);
		  String passStrng =String.valueOf(password1) ;
		  objLogin.setPassword(passStrng);
		  objLogin.clickSignIn();
		  Assert.assertTrue(objLogin.invalidCredentials());
	  }
		  
	  @Test(dataProvider="validUserInvalidPassword",priority=2,description="Verifying sign in using valid user name and invalid password",groups= {"smoke"},retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)                                         
	  public void verifySigninValidUserInvalidPassword(String userName,int password1) {
		  
		  
		  objLogin=new LoginPage(driver);
		  objLogin.clearUsernameField();
		  objLogin.setUserName(userName);
		  String passStrng =String.valueOf(password1) ;
		  objLogin.setPassword(passStrng);
		  objLogin.clickSignIn();
		  Assert.assertTrue(objLogin.invalidCredentials());
	  }
	  @Test(dataProvider="invalidUserInvalidPassword",priority=3,description="Verifying sign in using invalid user name and invalid password",groups= {"smoke"},retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)                                         
	  public void verifySigninInvalidUserInvalidPassword(String userName,int password1) {
		  
		  
		  objLogin=new LoginPage(driver);
		  objLogin.clearUsernameField();
		  objLogin.setUserName(userName);
		  String passStrng =String.valueOf(password1) ;
		  objLogin.setPassword(passStrng);
		  objLogin.clickSignIn();
		  Assert.assertTrue(objLogin.invalidCredentials());
	  }
		  @Test(dataProvider="validUserValidPassword",priority=4,description="Verifying sign in using valid user name and valid password",groups= {"smoke"},retryAnalyzer=com.QaLegendProject.Listeners.RetryAnalyzer.class)                                         
		  public void verifySigninValidUserValidPassword(String userName,int password1) {
			  
			  
			  objLogin=new LoginPage(driver);
			  objLogin.clearUsernameField();
			  objLogin.setUserName(userName);
			  String passStrng =String.valueOf(password1) ;
			  objLogin.setPassword(passStrng);
			  objLogin.clickSignIn();
			  Assert.assertTrue(objLogin.validCredentials());
			  
		  
	  }
	  


	@DataProvider()
	public Object[][] invalidUserValidPassword() {
		  Object[][] data=new Object[1][2];
		  data[0][0]=ExcelRead.getCellStringData(0,0,ConstantsPro.Sheet1); 
		  data[0][1]=ExcelRead.getCellNumericData(0,1,ConstantsPro.Sheet1); 
		  return data;
		  
	}
	@DataProvider
	public Object[][] validUserInvalidPassword() {
		  Object[][] data=new Object[1][2];
		  data[0][0]=ExcelRead.getCellStringData(1,0,ConstantsPro.Sheet1); 
		  data[0][1]=ExcelRead.getCellNumericData(1,1,ConstantsPro.Sheet1); 
		  return data;
		  }
	@DataProvider
	public Object[][] invalidUserInvalidPassword() {
		  Object[][] data=new Object[1][2];
		  data[0][0]=ExcelRead.getCellStringData(2,0,ConstantsPro.Sheet1); 
		  data[0][1]=ExcelRead.getCellNumericData(2,1,ConstantsPro.Sheet1); 
		  return data;
		  }
	@DataProvider
	public Object[][] validUserValidPassword() {
		  Object[][] data=new Object[1][2];
		  data[0][0]=ExcelRead.getCellStringData(3,0,ConstantsPro.Sheet1); 
		  data[0][1]=ExcelRead.getCellNumericData(3,1,ConstantsPro.Sheet1); 
		  return data;
		  }
		  
		  

	}
  

