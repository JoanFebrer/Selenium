package levels;

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

public class GoDaddy {

	private static WebDriver driver = null;
	//private static By
	

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
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		try {Thread.sleep(100);}
		catch (Exception e) {}
		
		WebElement cookieChoice = driver.findElement(By.id("cookieChoiceDismiss"));
		cookieChoice.click();
		
		WebElement FirstName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div/div/div[3]/input"));
		FirstName.sendKeys("Yoni");
		try {Thread.sleep(100);}
		catch (Exception e) {}
		WebElement LastName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div/div/div[6]/input"));
		LastName.sendKeys("Macarroni");
		try {Thread.sleep(100);}
		catch (Exception e) {}
		WebElement gender = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div/div/div[10]"));
		List<WebElement> genderList = gender.findElements(By.name("sex"));
		for (WebElement e : genderList) {
				if (e.getAttribute("value").equals("Male")) e.click();
		}
		WebElement years = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div/div/div[15]"));
		List<WebElement> yearsList = years.findElements(By.name("exp"));
		for (WebElement y : yearsList) {
			if (y.getAttribute("value").equals("3")) y.click();
		}
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("27/07/21");
		
		try {Thread.sleep(100);}
		catch (Exception e) {}
		
		WebElement profession = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div/div/div[21]"));
		List<WebElement> professionList = profession.findElements(By.name("profession"));
		for(WebElement p : professionList) {
			if (p.getAttribute("value").equals("Automation Tester")) p.click();
		}
		
		try {Thread.sleep(100);}
		catch (Exception e) {}
		
		WebElement tools = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div/div/div[23]"));
		List<WebElement> toolsList = tools.findElements(By.name("tool"));
		for (WebElement t : toolsList) {
			if (t.getAttribute("value").equals("Selenium Webdriver")) t.click();
		}
		
		WebElement continents = driver.findElement(By.id("continents"));
		Select continentsSelection = new Select(continents);
		continentsSelection.selectByVisibleText("Europe");
		
		WebElement commands = driver.findElement(By.id("selenium_commands"));
		Select commandsSelection = new Select(commands);
		commandsSelection.selectByVisibleText("Switch Commands");
		
		WebElement photo = driver.findElement(By.id("photo"));
		photo.sendKeys("C:\\Users\\jfebrern\\Documents");
		
		WebElement downloadLink = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div/div/div[29]/div[2]/div/a"));
		downloadLink.click();
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
