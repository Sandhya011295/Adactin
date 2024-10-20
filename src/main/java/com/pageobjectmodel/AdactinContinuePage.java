package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelement.AdactinApplicationElements;

public class AdactinContinuePage extends Base_Class implements AdactinApplicationElements {
	@FindBy(id = radioButton)
	private WebElement radio_button;

	@FindBy(id = continueButton)
	private WebElement continue_button;
	
	public AdactinContinuePage(WebDriver driver) { // Change to Constructor
		PageFactory.initElements(driver, this); // POM class methods initialized
	}

	public void validUserNameAndValidPassword() throws Throwable {
		elementClick(radio_button);		//object creation and baseclass
		elementClick(continue_button);
	}
}
