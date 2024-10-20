package com.pageobjectmodel;

import java.io.IOException;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base_Class;
import com.interfaceelement.AdactinApplicationElements;
import com.property.FileReaderManager;

public class AdactinLoingPage extends Base_Class implements AdactinApplicationElements { // Class extends interface

	@FindBy(id = username_id)
	private WebElement username;

	@FindBy(id = password_id)
	private WebElement password;

	@FindBy(xpath = Login_xpath)
	private WebElement login;


	public AdactinLoingPage(WebDriver driver) { // Change to Constructor
		PageFactory.initElements(driver, this); // POM class methods initialized
	}

	public void validUserNameAndValidPassword() throws Throwable {
		// Scenario 1
		FileReaderManager data = new FileReaderManager();
		passInput(username, data.getDataProperty("loginusername"));
		passInput(password, data.getDataProperty("longinpassword"));
		elementClick(login);

	//WebElement screenshot = driver.findElement(By.xpath("//textarea[@class='txtarea']"));

		
	}

}
