package com.dqp.testcases;

import org.testng.annotations.Test;
import com.dqp.base.TestBase;
import com.dqp.pages.EditJobPage;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class EditJobsTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	EditJobPage editjobPage; 
	
	public EditJobsTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(15000);
	editjobPage = new EditJobPage();
	
	}  
 
	 @Test(priority = 0) 
	 public void verifyJobData() throws InterruptedException { 
		 
		 editjobPage.validateJobsTab();  Thread.sleep(9000);
	 
		 editjobPage.validateEditJobs();Thread.sleep(7000);
		 
		 
		 editjobPage.validateCronExpression(); Thread.sleep(5000);
		 editjobPage.validateSelectCronExpression(); Thread.sleep(5000);
		 editjobPage.validateEnterCustomCronExp(); Thread.sleep(5000);
		 editjobPage.validateBeginValue(); Thread.sleep(5000);
		 editjobPage.validateEndValue(); Thread.sleep(5000);
		 editjobPage.validateSubmitButton(); Thread.sleep(5000);
		 editjobPage.validateSuccessfulPopUp(); Thread.sleep(5000);						 
	 }	 	 
		
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
