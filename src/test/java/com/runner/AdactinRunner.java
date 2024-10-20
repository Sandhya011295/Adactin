package com.runner;

import com.base.Base_Class;
import com.pageobjectmanagar.PageObjectManager;

public class AdactinRunner extends Base_Class {

	public static void main(String[] args) throws Throwable {
		PageObjectManager pageObjectManager = new PageObjectManager();
		launchBrowser(pageObjectManager.getFileReader().getDataProperty("browser"));
		launchUrl(pageObjectManager.getFileReader().getDataProperty("url"));
		pageObjectManager.getLoginPage().validUserNameAndValidPassword();
		pageObjectManager.getSearchHotel().validUserNameAndValidPassword();
		pageObjectManager.getContinueHotel().validUserNameAndValidPassword();
		pageObjectManager.getBookingHotel().validUserNameAndValidPassword();
	}

}
