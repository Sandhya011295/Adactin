package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base_Class { // non runnable method

	public static WebDriver driver;

	protected static WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING BROWSER LAUNCH");
		}
		driver.manage().window().maximize();
		return driver;

	}

	protected static WebDriver launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING LAUNCH URL");
		}
		return driver;
	}

	protected static String getText(WebElement driver) {
		try {
			return driver.getText();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING LAUNCH URL");
		}
		return null;
	}

	protected static String getTitle() {
		try {
			return driver.getTitle();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING LAUNCH URL");
		}
		return null;
	}

	protected static String getCurrentUrl() {
		try {
			return driver.getCurrentUrl();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING LAUNCH URL");
		}
		return null;
	}

	protected static void navigatePage(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING NAVIGATE PAGE");
		}
	}

	protected static void navigateBackPage() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING NAVIGATE BACK PAGE");
		}
	}

	protected static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING NAVIGATE REFRESH");
		}
	}

	protected static void emailInput(WebElement element1, String input) {
		try {
			element1.sendKeys(input);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING EMAIL INPUT");
		}
	}

	protected static void passwordInput(WebElement element2, String input) {
		try {
			element2.sendKeys(input);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING PASSWORD INPUT");
		}
	}

	protected static void elementClick(WebElement element3) {
		try {
			element3.click();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING ELEMENT CLICK");
		}
	}

	protected static void passInput(WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING PASSING INPUT");
		}
	}

	protected static Select dropDownObject(WebElement element) {
		Select select = new Select(element);
		return select;
	}

	protected static void selectByVisibleText(WebElement element4, String text) {
		try {
			dropDownObject(element4).selectByVisibleText(text);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING SELECT BY VISIBLE TEXT");
		}
	}

	protected static void selectByIndex(WebElement element5, int num) {
		try {
			dropDownObject(element5).selectByIndex(num);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING SELECT BY INDEX");
		}
	}

	protected static void windowsHandles(int num) {
		try {
			List<String> allWindow = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allWindow.get(num));
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING WINDOWS HANDLES");
		}
	}

	protected static void scrollDown(int x, int y) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(" + x + ", " + y + ")");
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING WINDOWS HANDLES");
		}
	}

	protected static void takeScreenshot(String fileName) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File Source = screenshot.getScreenshotAs(OutputType.FILE);

		File Destination = new File("C:\\Users\\Jana\\eclipse-workspace\\MavenProject\\Screenshot\\ " + fileName + ".png");

		try {
			FileHandler.copy(Source, Destination);
		} catch (IOException e) {
			Assert.fail("ERROR : OCCURED DURING TAKESCREENSHOT");

		}
	}

	protected static String getAttribute(WebElement element, String input) {
		try {
			return element.getAttribute(input);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING WINDOWS HANDLES");
			return null;
		}
	}

	protected static void threadSleep(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING IMPLICIT WAIT");
		}
	}

	protected static void implicitlyWait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING IMPLICIT WAIT");
		}
	}

	protected WebElement explicitlyWait(int second, String locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING EXPLICIT WAIT");
		}
		return null;
	}

	protected static void clearElement(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED ELEMENT CLEARED");
		}
	}

	protected static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING BROWSER CLOSE");
		}
	}

	protected static void terminateBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING BROWSER LAUNCH TERMINATED");
		}
	}

}
