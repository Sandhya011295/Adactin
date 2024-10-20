package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelement.AdactinApplicationElements;
import com.property.FileReaderManager;

public class AdactinBookingPage extends Base_Class implements AdactinApplicationElements {
	
	@FindBy(id = firstname_id)
	private WebElement first_name;

	@FindBy(id = lastname_id)
	private WebElement last_name;

	@FindBy(id = billingaddress_id)
	private WebElement address;

	@FindBy(id = cardno_id)
	private WebElement cc_num;

	@FindBy(id = cardtype_id)
	private WebElement cc_type;

	@FindBy(id = cardmonth_id)
	private WebElement cc_month;

	@FindBy(id = cardyear_id)
	private WebElement cc_year;

	@FindBy(id = cardcvv_id)
	private WebElement cc_cvv;
	
	@FindBy(xpath = Booknow_xpath)
	private WebElement booknow;
	
	@FindBy(id = Logout_id)
	private WebElement logout;

	public AdactinBookingPage(WebDriver driver) { // Change to Constructor
		PageFactory.initElements(driver, this); // POM class methods initialized
	}

	
	public void validUserNameAndValidPassword() throws Throwable {
		
		FileReaderManager data = new FileReaderManager();
		passInput(first_name, FileReaderManager.getDataProperty("first_name"));
		passInput(last_name, FileReaderManager.getDataProperty("last_name"));
		passInput(address, FileReaderManager.getDataProperty("billing_address"));
		passInput(cc_num, FileReaderManager.getDataProperty("cc_num"));
		dropDownObject(cc_type).selectByVisibleText(data.getDataProperty("cc_type"));
		dropDownObject(cc_month).selectByVisibleText(data.getDataProperty("cc_exp_month"));
		dropDownObject(cc_year).selectByVisibleText(data.getDataProperty("cc_exp_year"));
		passInput(cc_cvv, FileReaderManager.getDataProperty("cc_cvv"));
		booknow.click();
		scrollDown(0,1000);
		implicitlyWait(10);
		scrollDown(0, 1000);
		Thread.sleep(4000);
		takeScreenshot("book");
		logout.click();
		Thread.sleep(4000);
		takeScreenshot("logout");
	}

}
