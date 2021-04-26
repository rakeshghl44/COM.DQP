package com.dqp.testcases;

import org.testng.annotations.Test;

import com.dqp.base.TestBase;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HomeTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
		
	public HomeTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(15000);
	
	}
  
  @Test (priority = 0,enabled = false)
  public void verifyMeasureTab() throws InterruptedException {
	  
	  Thread.sleep(10000);
	  	homepage.validateMeasureTab();
	  	
	  	Thread.sleep(6000);
  }
  
	 @Test(priority = 1,enabled = false) 
	 public void verifyCreateMeasure() throws InterruptedException { 
		 
		 Thread.sleep(6000);
		 verifyMeasureTab();
	 
		 homepage.validateCreateMeasure(); 
		 
		 Thread.sleep(6000);
		 
	 }
	 @Test(priority = 2,enabled = false) 
	 public void verifyMesureType() throws InterruptedException { 
		 
		 Thread.sleep(6000);
		 verifyMeasureTab();
	 
		 verifyCreateMeasure();  Thread.sleep(2000);
		 
		 Thread.sleep(6000);
		 
		 homepage.validateMesureType();
		 
	 }
	 
	 @Test(priority = 0) 
	 public void homePageTest() throws InterruptedException { 
		 
		 verifyMeasureTab(); Thread.sleep(6000);
	 
		 verifyCreateMeasure();  Thread.sleep(2000);
		 
		 homepage.validateMesureType(); Thread.sleep(6000);
	 }	 
		
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
