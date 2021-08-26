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

public class BootstrapDatePicker {

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
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		String month = "May 2020";
		String day = "13";
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div/div/span")).click();
		
		while (true) {

			   String textString = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();

			   if (textString.equals(month)) {
			    break;
			   } else {
			    driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
			   }
			  }
			  driver.findElement(By.xpath("//table/tbody/tr/td[contains(text()," + day + ")]")).click();
			  
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div/div/input[1]")).click();
		month = "April 2019";
		day = "24";
		while (true) {

			   String textString = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();

			   if (textString.equals(month)) {
			    break;
			   } else {
			    driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
			   }
			  }
			  driver.findElement(By.xpath("//table/tbody/tr/td[contains(text()," + day + ")]")).click();
			  
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/div/div/input[2]")).click();
		month = "May 2020";
		day = "23";
		while (true) {

			   String textString = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).getText();

			   if (textString.equals(month)) {
			    break;
			   } else {
			    driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")).click();
			   }
			  }
			  driver.findElement(By.xpath("//table/tbody/tr/td[contains(text()," + day + ")]")).click();
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
