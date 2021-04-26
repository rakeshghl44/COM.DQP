package com.dqp.testcases;

import org.testng.annotations.Test;
import com.dqp.base.TestBase;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTestPage() {
		super();
	}
	
	@BeforeMethod
	  public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));  Thread.sleep(15000);
	  }
	
		/*
		 * @Test(priority = 0,enabled = false) public void sfdcLogoTest() { boolean flag
		 * = loginpage.validateSfdcLogo(); Assert.assertTrue(flag); }
		 */
  
  @Test(priority = 1,enabled = false)
  public void loginTest() throws InterruptedException {
	  homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
  }
  
  @Test(priority = 2,enabled = false)
  public void profileLink() throws InterruptedException {
	  loginTest();
	  
	  loginpage.validateProfileLink();
	  Thread.sleep(4000);
  }
  
  @Test(priority = 3,enabled = false)
  public void logOut() throws InterruptedException {
	  profileLink();	  
	  loginpage.validateLogOut();
	  Thread.sleep(5000);
  }
  
  @Test(priority = 0,enabled = true)
  public void LoginTest() throws InterruptedException {
	  
	 
	  
	  loginpage.validateProfileLink();
	  Thread.sleep(5000);
	  loginpage.validateLogOut();
	  Thread.sleep(5000);
	  
  }  

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }
//Thread.sleep(3000);
}
