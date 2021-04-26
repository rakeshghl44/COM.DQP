package com.dqp.testcases;

import org.testng.annotations.Test;

import com.dqp.base.TestBase;
import com.dqp.pages.CreateMeasurePage;
import com.dqp.pages.EditMeasurePage;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;

public class EditMeasureTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CreateMeasurePage createmeasurepage; 
	EditMeasurePage editMeasurePage;
	
	public EditMeasureTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	 Thread.sleep(30000);
	  editMeasurePage = new EditMeasurePage();
	createmeasurepage = new CreateMeasurePage();
	
	}
  
  @Test (priority = 0 , enabled = false)
  public void verifyMeasureTab() throws InterruptedException {
	  
	  
	  Thread.sleep(10000);
	  createmeasurepage.validateMeasureTab();
	  	Thread.sleep(10000);
  }
  
  @Test(priority = 1, enabled = true)  // demo execution
	 public void verifyEditMeasure() throws InterruptedException { 
	  
	  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		 
	  editMeasurePage.validateMeasureTab();
	  	Thread.sleep(6000);
	  
		 editMeasurePage.validateEditMeasure();Thread.sleep(4000);
			 
		 editMeasurePage.validateOrganization();Thread.sleep(4000);
		 //editMeasurePage.validateMesureDescription();Thread.sleep(5000);		 
		 
		 editMeasurePage.validateNextButton(); Thread.sleep(5000);
		 editMeasurePage.validateDatasource(); Thread.sleep(5000);
		 editMeasurePage.validateSelectsource(); Thread.sleep(5000);
		 editMeasurePage.validateDatabase(); Thread.sleep(5000);
		 editMeasurePage.validateSelectdatabase(); Thread.sleep(5000);
		 editMeasurePage.validateTabel(); Thread.sleep(5000);
		 editMeasurePage.validateSelecttable(); Thread.sleep(5000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)", "");

		editMeasurePage.validateaddRuleButton(); Thread.sleep(5000);
		editMeasurePage.validateSelectcolumn(); Thread.sleep(5000);
		editMeasurePage.validateSelectcolumnvalue(); Thread.sleep(5000);
		editMeasurePage.validateSourcenextbutton(); Thread.sleep(5000);
		editMeasurePage.validateSubmitButton(); Thread.sleep(9000);
		editMeasurePage.validateSuccessfulPopup(); Thread.sleep(5000);
	 }
  
	 @Test(priority = 1, enabled = false) 
	 public void verifyCreateMeasure() throws InterruptedException { 
		 
		 Thread.sleep(6000);
		 verifyMeasureTab();
		 
		 Thread.sleep(7000);
	 
		 createmeasurepage.validateCreateMeasure(); 
		 
		 Thread.sleep(8000);
		 
	 }
	 @Test(priority = 2, enabled = false) 
	 public void verifyMesureType() throws InterruptedException { 
		 
		 verifyMeasureTab();
	 
		 verifyCreateMeasure(); 
		 
		 Thread.sleep(2000);
		 
		 createmeasurepage.validateMesureType();
		 
	 }
	 
	 @Test(priority = 0,enabled = false) 
	 public void verifyMesureData() throws InterruptedException { 
		 
		 
		
		 
		 createmeasurepage.validateMeasureTab();  Thread.sleep(7000);
	 
		 editMeasurePage.validateEditMeasure();  Thread.sleep(5000);
		 
		 Thread.sleep(4000);
		 driver.close();		 
		 createmeasurepage.validateMesureType();
		 Thread.sleep(6000);
		 createmeasurepage.validateMesureName(); Thread.sleep(5000);
		 createmeasurepage.validateOrganization(); Thread.sleep(5000);
		 createmeasurepage.validateNextButton(); Thread.sleep(5000);
		 createmeasurepage.validateDatasource(); Thread.sleep(5000);
		 createmeasurepage.validateSelectsource(); Thread.sleep(5000);
		 createmeasurepage.validateDatabase(); Thread.sleep(5000);
		 createmeasurepage.validateSelectdatabase(); Thread.sleep(5000);
		 createmeasurepage.validateTabel(); Thread.sleep(5000);
		 createmeasurepage.validateSelecttable(); Thread.sleep(5000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)", "");

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
