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

public class DropDown {

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
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement selectListSingle = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]"));
		WebElement panelBody = selectListSingle.findElement(By.className("panel-body"));
		WebElement select = panelBody.findElement(By.tagName("select"));
		Select days = new Select(select);
		days.selectByValue("Wednesday");
		
		
		WebElement selectListMultiple = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]"));
		WebElement selectCountry = selectListMultiple.findElement(By.tagName("select"));
		Select country = new Select(selectCountry);
		country.selectByValue("California");
		country.selectByValue("New York");
		country.selectByValue("Ohio");
		country.selectByValue("Texas");	
		WebElement allButton = selectListMultiple.findElement(By.id("printAll"));
		allButton.click(); 
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
