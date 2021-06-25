package com.dqp.testcases;

import org.testng.annotations.Test;

import com.dqp.base.TestBase;
import com.dqp.pages.CreateMeasurePage;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;

public class CreateMeasureTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CreateMeasurePage createmeasurepage; 
	
	public CreateMeasureTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	 Thread.sleep(20000);
	createmeasurepage = new CreateMeasurePage();
	
	}
  
  		 
	 @Test(priority = 0) 
	 public void verifyMesureData() throws InterruptedException { 		
		 
		 createmeasurepage.validateMeasureTab();  Thread.sleep(7000);
	 
		 createmeasurepage.validateCreateMeasure();  Thread.sleep(5000);
		 		 		 
		 createmeasurepage.validateMesureType();Thread.sleep(8000);
		 
		 createmeasurepage.validateMesureName(); Thread.sleep(5000);
		 createmeasurepage.validateOrganization(); Thread.sleep(5000);
		 createmeasurepage.validateNextButton(); Thread.sleep(9000);
		 createmeasurepage.validateDatasource(); Thread.sleep(5000);
		 createmeasurepage.validateSelectsource(); Thread.sleep(5000);
		 createmeasurepage.validateDatabase(); Thread.sleep(5000);
		 createmeasurepage.validateSelectdatabase(); Thread.sleep(5000);
		 createmeasurepage.validateTabel(); Thread.sleep(5000);
		 createmeasurepage.validateSelecttable(); Thread.sleep(7000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1600)", "");

		 createmeasurepage.validateaddRuleButton(); Thread.sleep(5000);
		 createmeasurepage.validateSelectcolumn(); Thread.sleep(5000);
		 createmeasurepage.validateSelectcolumnvalue(); Thread.sleep(5000);
		 createmeasurepage.validateSourcenextbutton(); Thread.sleep(5000);
		 createmeasurepage.validateSubmitButton(); Thread.sleep(9000);
		 createmeasurepage.validateSuccessfulPopup(); Thread.sleep(5000);
		 		 
	 }
	 	 
		
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
