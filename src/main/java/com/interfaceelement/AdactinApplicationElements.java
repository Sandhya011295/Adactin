package com.interfaceelement;

public interface AdactinApplicationElements {

	// Login Page Elements  //Scenario 1
	String username_id = "username";

	String password_id = "password";

	String Login_xpath = "//input[@type='Submit']";

	// Search Page Elements  //Scenario 2

	String location_id = "location";

	String hotels_id = "hotels";
	
	String roomtype_id = "room_type";
	
	String numberofrooms_id = "room_nos";
	
	String checkindate_id = "datepick_in";
	
	String checkoutdate_id = "datepick_out";
	
	String adultsperroom_id = "adult_room";
	
	String childrensroom_id = "child_room";
	
	String Search_xpath = "//input[@class='reg_button']";
	
	//Select Hotel  //Scenario 3
	
	String radioButton = "radiobutton_0";
	
	String continueButton = "continue";
	
	//Book A Hotel //Scenario 4
	
	String firstname_id = "first_name";
	
	String lastname_id = "last_name";
	
	String billingaddress_id = "address";
	
	String cardno_id = "cc_num";
	
	String cardtype_id = "cc_type";
	
	String cardmonth_id = "cc_exp_month";
	
	String cardyear_id = "cc_exp_year";
	
	String cardcvv_id = "cc_cvv";
	
	String Booknow_xpath = "//input[@class='reg_button']";
	
	String Logout_id = "logout";


}
