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

public class TableSortSearch {

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
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		WebElement entries = driver.findElement(By.id("example_length")).findElement(By.xpath(".//label/select"));
		Select entriesSel = new Select(entries);
		entriesSel.selectByValue("100");
		
		driver.findElement(By.id("example_filter")).findElement(By.xpath(".//label/input")).sendKeys("Accountant");
		List<WebElement> listFilter = driver.findElement(By.id("example")).findElement(By.xpath(".//thead/tr")).findElements(By.xpath(".//*"));
		for (WebElement l: listFilter) {
			l.click();
			try {Thread.sleep(400);}
			catch (Exception e) {}
		}
		
	    
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
