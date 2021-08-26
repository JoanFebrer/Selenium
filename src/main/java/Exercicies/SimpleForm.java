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

public class SimpleForm {

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
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		try {Thread.sleep(2000);}
		catch (Exception e) {}
		
		WebElement ad = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/a"));
		ad.click();
		
		try {Thread.sleep(400);}
		catch (Exception e) {}
		
		WebElement inputText = driver.findElement(By.id("get-input"));
		WebElement input = inputText.findElement(By.tagName("input"));
		input.sendKeys("Aquí va algo de texto");
		WebElement displayInput = inputText.findElement(By.tagName("button"));
		displayInput.click();
		
		WebElement aValue = driver.findElement(By.id("sum1"));
		WebElement bValue = driver.findElement(By.id("sum2"));
		aValue.sendKeys("9");
		bValue.sendKeys("8");
		
		WebElement formGroupSum = driver.findElement(By.id("gettotal"));
		WebElement sumValueButton = formGroupSum.findElement(By.tagName("button"));
		
		sumValueButton.click();
	    
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
