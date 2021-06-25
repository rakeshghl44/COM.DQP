package com.dqp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dqp.base.TestBase;

public class CreateMeasurePage extends TestBase{
	
	LoginPage loginpage;
	
	@FindBy(xpath = "//span[@class='h3 font-weight-bold']")
	WebElement dqplogo;
	
	@FindBy(xpath = "//a[contains(text(),'Measures')]")
	WebElement measureTab;
	
	@FindBy(xpath = "//button[@routerlink='../create']//*[@data-icon='plus']")
	WebElement createbutton;
	
	@FindBy(xpath = "//*[@class='card-title mb-0' and contains(text(),'COMPLETENESS')]")
	WebElement selectmeasure;
	
	@FindBy(name = "prName")
	WebElement measurename;
	
	@FindBy(name = "org")
	WebElement organization;

	@FindBy(xpath = "//button[contains(text(),' Next ')]")
	WebElement nextbutton;

	@FindBy(xpath = "//*[contains(text(),'Select Datasource')]//parent::div//following-sibling::span//i//*[@data-icon='down']")
	WebElement datasource;

	@FindBy(xpath = "//li[contains(text(),'DEV-MYSQL')]")
	WebElement selectsource;

	@FindBy(xpath = "//*[contains(text(),'Select Database')]//parent::div//following-sibling::span//i//*[@data-icon='down']")
	WebElement database;

	@FindBy(xpath = "//li[contains(text(),'Spark_Test')]")
	WebElement selectdatabase;

	@FindBy(xpath = "//*[contains(text(),'Table')]//parent::div//following-sibling::span//i//*[@data-icon='down']")
	WebElement tabel;

	@FindBy(xpath = "//li[contains(text(),' lte_msisdn_leakage_daily_part_day')]")
	WebElement selecttable;
	
	@FindBy(xpath = "//button[contains(text(),'Add Rule')]")
	WebElement addRuleButton;
	
	@FindBy(xpath = "//div[@class='ng-select-container']")
	WebElement selectcolumn;
	

	@FindBy(id = "item-6")
	WebElement selectcolumnvalue;
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement sourcenextbutton;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submitbutton;
	
	@FindBy(xpath = "//button[contains(text(),'No')]")
	WebElement successfulPopup;
	
	
	public CreateMeasurePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateDQPLogo() {
		return dqplogo.isDisplayed();
	}	
	public void validateMeasureTab() throws InterruptedException {
		measureTab.click();
		Thread.sleep(10000);
	}	
	
	public void validateCreateMeasure() throws InterruptedException {
		createbutton.click(); 
		Thread.sleep(2000); }
	
	public void validateMesureType() throws InterruptedException {
		selectmeasure.click(); 
		Thread.sleep(2000); }
	
	public void validateMesureName() throws InterruptedException {
		measurename.sendKeys("testing_991"); 
		Thread.sleep(4000); }
	
	public void validateOrganization() throws InterruptedException {
		organization.sendKeys("testing_991");
		Thread.sleep(4000); }
	
	public void validateNextButton() throws InterruptedException {
		nextbutton.click(); 
		Thread.sleep(2000); }
	
	public void validateDatasource() throws InterruptedException {
		datasource.click(); 
		Thread.sleep(2000); }

	public void validateSelectsource() throws InterruptedException {
		selectsource.click(); 
		Thread.sleep(2000); }

	public void validateDatabase() throws InterruptedException {
		database.click(); 
		Thread.sleep(2000); }

	public void validateSelectdatabase() throws InterruptedException {
		selectdatabase.click(); 
		Thread.sleep(2000); }

	public void validateTabel() throws InterruptedException {
		tabel.click(); 
		Thread.sleep(2000); }

	public void validateSelecttable() throws InterruptedException {
		selecttable.click(); 
		Thread.sleep(2000); }

	public void validateaddRuleButton() throws InterruptedException {
		addRuleButton.click(); 
		Thread.sleep(2000); }

	public void validateSelectcolumn() throws InterruptedException {
		selectcolumn.click(); 
		Thread.sleep(2000); }
	
	public void validateSelectcolumnvalue() throws InterruptedException {
		selectcolumnvalue.click(); 
		Thread.sleep(2000); }

	public void validateSourcenextbutton() throws InterruptedException {
		sourcenextbutton.click(); 
		Thread.sleep(2000); }

	public void validateSubmitButton() throws InterruptedException {
		submitbutton.click(); 
		Thread.sleep(2000); }

	public void validateSuccessfulPopup() throws InterruptedException {
		successfulPopup.click(); 
		Thread.sleep(2000); }
	

}
