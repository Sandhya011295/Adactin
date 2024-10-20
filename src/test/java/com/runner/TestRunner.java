package com.runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;
import com.utility.ReadExcelData;

public class TestRunner extends Base_Class {

	public static void main(String[] args) throws IOException {

		launchBrowser("chrome");
		launchUrl("https://www.google.com/");
		WebElement element = driver.findElement(By.name("q"));
		passInput(element, "rose");
		navigatePage("https://www.facebook.com/");
		navigateRefresh();
		WebElement element1 = driver.findElement(By.name("email"));
		passInput(element1, "sivaranjanishiny16@gmail.com");
		WebElement element2 = driver.findElement(By.name("pass"));
		passInput(element2, "sivaranjani");
		WebElement element3 = driver.findElement(By.xpath("//button[@name='login']"));
		elementClick(element3);
		implicitlyWait(50);
		navigateBackPage();
		launchUrl("https://www.oracle.com/in/corporate/contact/");
		WebElement element4 = driver.findElement(By.id("product-grouping"));
		elementClick(element4);
		selectByVisibleText(element4, "Cloud Infrastructure");
		WebElement element5 = driver.findElement(By.id("product-selection"));
		elementClick(element5);
		selectByIndex(element5, 4);
		scrollDown(0, 800);
		launchUrl("https://www.amazon.in/");
		WebElement element8 = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		System.out.println("GetText: " + getText(element8));
		System.out.println("Current URL: " + getCurrentUrl());
		System.out.println("Get Title: " + getTitle());
		//explicitlyWait(50, null);
		takeScreenshot("amazon");
	}

}
