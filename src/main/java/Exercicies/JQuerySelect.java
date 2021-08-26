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

public class JQuerySelect {

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
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		
		WebElement country = driver.findElement(By.id("country"));
		Select con = new Select(country);
		con.selectByValue("United States of America");
		
		WebElement state = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/select"));
		Select stateSel = new Select(state);
		stateSel.selectByValue("AL");
	    
		
		WebElement outlying = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/select"));
		Select outSel = new Select(outlying);
		outSel.selectByValue("PR");
		
		WebElement category = driver.findElement(By.id("files"));
		Select catSel = new Select(category);
		catSel.selectByVisibleText("Java");
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
