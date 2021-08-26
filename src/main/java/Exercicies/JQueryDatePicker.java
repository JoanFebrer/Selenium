package Exercicies;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JQueryDatePicker {

	private static WebDriver driver = null;
	

	// INITIALIZE DRIVER
	@BeforeClass
	public static void initialize() {
		ArrayList<String> optionsList = new ArrayList<String>();
		ChromeOptions chromeOptions = new ChromeOptions();
		optionsList.add("--start-maximized");
		optionsList.add("--incognito");
		chromeOptions.addArguments(optionsList);
		driver = new ChromeDriver(chromeOptions);
	}

	@Test
	public void testLevels() {

		// Open URL
		driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		driver.findElement(By.id("from")).click();
		String month = "Feb";
		WebElement monthPicker = driver.findElement(By.xpath("/html/body/div[3]/div/div/select"));
		Select monthPick = new Select(monthPicker);
		monthPick.selectByValue("1");
		String day = "7";
		WebElement table = driver.findElement(By.xpath("/html/body/div[3]/table/tbody"));
		List<WebElement> weeks = table.findElements(By.xpath(".//*"));
		a: 
		for (WebElement w : weeks) {
			List<WebElement> dayz = w.findElements(By.xpath(".//*"));
			for (WebElement d : dayz) {
				try {d.findElement(By.partialLinkText(day)).click();
				break a;}
				catch (Exception e) {}
			}
		}
		
		driver.findElement(By.id("to")).click();
		monthPicker = driver.findElement(By.xpath("/html/body/div[3]/div/div/select"));
		monthPick = new Select(monthPicker);
		monthPick.selectByValue("5");
		day = "10";
		table = driver.findElement(By.xpath("/html/body/div[3]/table/tbody"));
		weeks = table.findElements(By.xpath(".//*"));
		b:
		for (WebElement w : weeks) {
			List<WebElement> dayz = w.findElements(By.xpath(".//*"));
			for (WebElement d : dayz) {
				try {d.findElement(By.partialLinkText(day)).click();
				break b;}
				catch (Exception e) {}
			}
		}
	    
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
