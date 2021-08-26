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

public class InputFormSubmit {

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
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		
		WebElement fieldset = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/form/fieldset"));
		List<WebElement> form = fieldset.findElements(By.className("form-group"));
		int i = 0;
		for (WebElement f : form) {
			WebElement input = null;
			WebElement sel = null;
			WebElement tex = null;
			WebElement host = null;
			WebElement button = null;
			++i;
			try {input = f.findElement(By.xpath(".//div/div/input"));}
			catch (Exception e)  { try {sel = f.findElement(By.xpath(".//div/div/select"));}
			catch (Exception e2) { try {tex = f.findElement(By.xpath(".//div/div/textArea"));}
			catch (Exception e3) { try { host = f.findElement(By.xpath(".//div/div/label/input"));}
			catch (Exception e4) { try { button = f.findElement(By.xpath(".//div/button"));}
			catch (Exception e5) { System.out.println("error: " + e2);} } } } }
			switch(i) { 
			case 1:
				input.sendKeys("Yoni");
				break;
			case 2:
				input.sendKeys("Macarroni");
				break;
			case 3:
				input.sendKeys("yonimacarroni@spaguetti.com");
				break;
			case 4:
				//input.sendKeys("251625339901");
				input.sendKeys("(845)555-1255");
				try {Thread.sleep(400);}
				catch (Exception e) {}
				if (f.findElement(By.xpath(".//div/small[2]")).isDisplayed()) System.out.println("Número de telèfon incorrecte");
				break;
			case 5:
				input.sendKeys("Macarroni Yoni 3A");
				break;
			case 6:
				input.sendKeys("Yonilandia");
				break;
			case 7:
				Select sel2 = new Select(sel);
				sel2.selectByIndex(1);
				//sel2.selectByValue("Alabama");
				break;
			case 8:
				input.sendKeys("00000");
				break;
			case 9:
				input.sendKeys("Yonimacarroni.com");
				break;
			case 10:
				host.click();
				break;
			case 11:
				tex.sendKeys("YoniYoniMacarroniYoniMacarroni");
				break;
			case 12:
				button.click();
			default:
				break;
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
