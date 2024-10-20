package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelement.AdactinApplicationElements;
import com.property.FileReaderManager;

public class AdactinSearchHotelPage extends Base_Class implements AdactinApplicationElements {
	
	@FindBy(id = location_id)
	private WebElement location;

	@FindBy(id = hotels_id)
	private WebElement hotels;

	@FindBy(id = roomtype_id)
	private WebElement room_type;

	@FindBy(id = numberofrooms_id)
	private WebElement room_nos;

	@FindBy(id = checkindate_id)
	private WebElement datepick_in;

	@FindBy(id = checkoutdate_id)
	private WebElement datepick_out;

	@FindBy(id = adultsperroom_id)
	private WebElement adult_room;

	@FindBy(id = childrensroom_id)
	private WebElement child_room;

	@FindBy(xpath = Search_xpath)
	private WebElement search;

	
	public AdactinSearchHotelPage(WebDriver driver) { // Change to Constructor
		PageFactory.initElements(driver, this); // POM class methods initialized
	}
	
	public void validUserNameAndValidPassword() throws Throwable {
		FileReaderManager data = new FileReaderManager();
		
		dropDownObject(location).selectByVisibleText(data.getDataProperty("location"));
		dropDownObject(hotels).selectByVisibleText(data.getDataProperty("hotels"));
		dropDownObject(room_type).selectByVisibleText(data.getDataProperty("room_type"));
		dropDownObject(room_nos).selectByVisibleText(data.getDataProperty("room_nos"));
		datepick_in.clear();
		passInput(datepick_in, FileReaderManager.getDataProperty("datepick_in"));
		datepick_out.clear();
		passInput(datepick_out, FileReaderManager.getDataProperty("datepick_out"));
		dropDownObject(adult_room).selectByVisibleText(data.getDataProperty("adult_room"));
		dropDownObject(child_room).selectByVisibleText(data.getDataProperty("child_room"));
		elementClick(search);

	}

}
