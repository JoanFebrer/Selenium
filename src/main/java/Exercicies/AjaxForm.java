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

public class AjaxForm {

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
	public void AjaxFormTest() {

		// Open URL
		driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
		WebElement name = driver.findElement(By.id("title"));
		WebElement comment = driver.findElement(By.id("description"));
		WebElement button = driver.findElement(By.id("btn-submit"));
		
		name.sendKeys("Yoni");
		comment.sendKeys("Lorem ipsum");
		button.click();
		
		
	    
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
