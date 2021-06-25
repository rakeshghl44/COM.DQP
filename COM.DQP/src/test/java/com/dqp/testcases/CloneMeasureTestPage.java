package com.dqp.testcases;

import org.testng.annotations.Test;
import com.dqp.base.TestBase;
import com.dqp.pages.CloneMeasurePage;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;

public class CloneMeasureTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CloneMeasurePage clonemeasurePage; 
	
	public CloneMeasureTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	 Thread.sleep(20000);
	 clonemeasurePage = new CloneMeasurePage();
	
	}  
  	 
	 @Test(priority = 0) 
	 public void verifyMesureData() throws InterruptedException { 		
		 
		 clonemeasurePage.validateMeasureTab();  Thread.sleep(9000);		 
		 clonemeasurePage.validateCloneMeasure(); Thread.sleep(7000);
		 clonemeasurePage.validateMesureName(); Thread.sleep(5000);
		 clonemeasurePage.validateOrganization(); Thread.sleep(5000);
		 clonemeasurePage.validateNextButton(); Thread.sleep(9000);
		 clonemeasurePage.validateDatasource(); Thread.sleep(5000);
		 clonemeasurePage.validateSelectsource(); Thread.sleep(5000);
		 clonemeasurePage.validateDatabase(); Thread.sleep(5000);
		 clonemeasurePage.validateSelectdatabase(); Thread.sleep(5000);
		 clonemeasurePage.validateTabel(); Thread.sleep(5000);
		 clonemeasurePage.validateSelecttable(); Thread.sleep(5000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)", "");

		clonemeasurePage.validateaddRuleButton(); Thread.sleep(5000);
		clonemeasurePage.validateSelectcolumn(); Thread.sleep(5000);
		clonemeasurePage.validateSelectcolumnvalue(); Thread.sleep(5000);
		clonemeasurePage.validateSourcenextbutton(); Thread.sleep(5000);
		clonemeasurePage.validateSubmitButton(); Thread.sleep(9000);
		clonemeasurePage.validateSuccessfulPopup(); Thread.sleep(5000);
		 		 
	 }
	 	 
		
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
