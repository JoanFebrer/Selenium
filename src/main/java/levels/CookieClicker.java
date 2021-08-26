package levels;

import static org.junit.Assert.assertEquals;



import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import org.apache.http.impl.client.SystemDefaultCredentialsProvider;
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

public class CookieClicker {

	private static WebDriver driver = null;
	private By clickableCookie = By.id("bigCookie");
	

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
		driver.get("https://orteil.dashnet.org/cookieclicker/");
		try {Thread.sleep(400);}
		catch(Exception e) {System.out.println(e.toString());}
		
		WebElement banner = driver.findElement(By.xpath("/html/body/div[1]/div/a[1]"));
		banner.click();
		WebElement cookieElement = driver.findElement(clickableCookie);
		boolean a = true;
		while (a) {
			cookieElement.click();
			WebElement sectionRight = driver.findElement(By.id("sectionRight"));
			List<WebElement> upgrades = sectionRight.findElements(By.className("enabled"));
			
			for (WebElement u : upgrades) {
				//System.out.print(u.getText());
				//System.out.print(u.getText() + "\n");
				System.out.print(u.getAttribute("class") + "\n");
				if (u.getAttribute("class").equals("crate upgrade enabled") || u.getAttribute("class").equals("product unlocked enabled")) {
					u.click();
					}
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
