package com.dqp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dqp.base.TestBase;

public class EditJobPage extends TestBase{
	
	LoginPage loginpage;
	WebElement webElement;
	
	
	@FindBy(xpath = "//span[@class='h3 font-weight-bold']")
	WebElement dqplogo;
	
	@FindBy(xpath = "//a[contains(text(),'Jobs')]")  //Jobs tab
	WebElement jobsTab;
	
	@FindBy(xpath = "//div[@title='Completeness_2204']//following::span//following-sibling::span//fa-icon//*[@data-icon='edit']")
	WebElement editJob;
	
	@FindBy(name = "cron_expression")   //cron expression drop-down
	WebElement cronexpression;

	@FindBy(xpath = "//option[contains(text(),'Custom Cron Expression')]") //select cron expression
	WebElement selectcronexpression;

	@FindBy(xpath = "//*[@name='cron_expression' and @type='text']")  //select custom expression
	WebElement entercustomcronexp;

	@FindBy(xpath = "//input[@min=\"-Infinity\"]")  //begin value
	WebElement beginvalue;
	
	@FindBy(xpath = "//input[@max=\"Infinity\"]")  //end value
	WebElement endvalue;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")  //submit button
	WebElement submitbutton;
	

	@FindBy(xpath = "//button[contains(text(),'OK')]")  //OK button
	WebElement successfulPopup;
	
	
	public EditJobPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateDQPLogo() {
		return dqplogo.isDisplayed();
	}	
	public void validateJobsTab() throws InterruptedException {
		jobsTab.click();
		Thread.sleep(10000);
	}	
	
	public void validateEditJobs() throws InterruptedException {
		editJob.click(); 
		Thread.sleep(2000); }
	
	public void validateCronExpression() throws InterruptedException {
		cronexpression.click();
		Thread.sleep(4000); }
	
	public void validateSelectCronExpression() throws InterruptedException {
		selectcronexpression.click(); 
		Thread.sleep(2000); }
	
	public void validateEnterCustomCronExp() throws InterruptedException {
		entercustomcronexp.clear();
		Thread.sleep(4000);
		entercustomcronexp.sendKeys("0 */3 * ? * *"); 
		Thread.sleep(2000); 
		entercustomcronexp.sendKeys(Keys.TAB);}

	public void validateBeginValue() throws InterruptedException {
		
		
		Thread.sleep(4000);
		beginvalue.sendKeys(Keys.DELETE);
		Thread.sleep(4000);
		beginvalue.sendKeys("-200"); 
		Thread.sleep(2000); 
		beginvalue.sendKeys(Keys.TAB); }

	public void validateEndValue() throws InterruptedException {
		
		endvalue.sendKeys(Keys.DELETE);
		Thread.sleep(4000);
		endvalue.sendKeys("100");
		Thread.sleep(6000); 
		endvalue.sendKeys(Keys.TAB);}

	public void validateSubmitButton() throws InterruptedException {
		submitbutton.click(); 
		Thread.sleep(2000); }

	public void validateSuccessfulPopUp() throws InterruptedException {
		successfulPopup.click(); 
		Thread.sleep(2000); }	

}
