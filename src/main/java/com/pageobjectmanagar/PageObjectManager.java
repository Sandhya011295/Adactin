package com.pageobjectmanagar;

import com.base.Base_Class;
import com.pageobjectmodel.AdactinBookingPage;
import com.pageobjectmodel.AdactinContinuePage;
import com.pageobjectmodel.AdactinLoingPage;
import com.pageobjectmodel.AdactinSearchHotelPage;
import com.property.FileReaderManager;

public class PageObjectManager extends Base_Class {
	private AdactinLoingPage loginPage;
	private AdactinSearchHotelPage searchHotel;
	private AdactinContinuePage continueHotel; 
	private AdactinBookingPage bookingHotel; ;
	private FileReaderManager fileReader;

	public AdactinLoingPage getLoginPage() {

		if (loginPage == null) {
			loginPage = new AdactinLoingPage(driver);
		}
		return loginPage;
	}
	
	public AdactinSearchHotelPage getSearchHotel() {

		if (searchHotel == null) {
			searchHotel = new AdactinSearchHotelPage(driver);
		}
		return searchHotel;
	}
	
	public AdactinContinuePage getContinueHotel() {

		if (continueHotel == null) {
			continueHotel = new AdactinContinuePage(driver);
		}
		return continueHotel;
	}
	
	public AdactinBookingPage getBookingHotel() {

		if (bookingHotel == null) {
			bookingHotel = new AdactinBookingPage(driver);
		}
		return bookingHotel;
	}
	

	public FileReaderManager getFileReader() { // FileReaderManager
		if (fileReader == null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;

	}

}
