package com.runner;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class DataDrivenTestRunner {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		String name = ReadExcelData.readParticularCell(1, 1);
		driver.findElement(By.id("username")).sendKeys("name");
		String pass = ReadExcelData.readParticularCell(1, 2);
		driver.findElement(By.id("password")).sendKeys("pass");
	}
}
