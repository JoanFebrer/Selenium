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

public class RadioButtons {

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
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		
		WebElement panelBody = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]"));
		List<WebElement> radioInline = panelBody.findElements(By.className("radio-inline"));
		for (WebElement r : radioInline) {
			WebElement r2 = r.findElement(By.tagName("input"));
			if (r2.getAttribute("value").equals("Male")) r2.click();
		}
		
		WebElement panelBody2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]"));
		List<WebElement> divisions = panelBody2.findElements(By.tagName("div"));
		
		for (WebElement d : divisions) {
			List<WebElement> d2 = d.findElements(By.tagName("label"));
			for (WebElement d3 : d2) {
				WebElement d4 = d3.findElement(By.tagName("input"));
				System.out.println(d4.getAttribute("value"));
				if (d4.getAttribute("value").equals("Male") || d4.getAttribute("value").equals("15 - 50")) d4.click();
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
