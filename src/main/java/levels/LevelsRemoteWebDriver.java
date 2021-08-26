package levels;

import static org.junit.Assert.assertEquals;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LevelsRemoteWebDriver {

	private static WebDriver driver = null;
	private By startButton = By.id("start_button");
	private By levelTitle = By.cssSelector("h1");
	private By nextButton = By.id("next");
	private By inputButton = By.id("input");
	private WebElement levelTitleElement = null;
	static final String HOST_URL = "http://localhost:4545/wd/hub";
	Alert alert = null;
	

	// INITIALIZE DRIVER
	
	@BeforeClass
	public static void initialize() throws MalformedURLException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		driver=new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"),options);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void comprovarTitol(String titolEsperat) {
		levelTitleElement = driver.findElement(levelTitle);
		assertEquals(levelTitleElement.getText(), titolEsperat);
	}
	
	public void level1() {
		comprovarTitol("Práctica Selenium");
		WebElement startButtonElement = driver.findElement(startButton);
		startButtonElement.click();
	}
	
	public void level2() {
		comprovarTitol("Level 2");
		 boolean a = true;
			while(a) {
			// LEVEL 2
			WebElement textBoxElementL2 = driver.findElement(inputButton);		
			//WebElement textBoxElementL2 = driver.findElement(By.cssSelector("#input"));
			textBoxElementL2.clear();
			textBoxElementL2.sendKeys("selenium");
			WebElement continueButtonL2 = driver.findElement(nextButton);
			//WebElement continueButtonL2 = driver.findElement(By.cssSelector("#next"));
			continueButtonL2.click();
			//driver.navigate().back();
			a = false;
			}
	}
	
	public void level3() {
		comprovarTitol("Level 3");
		
		WebElement labelElementL3 = driver.findElement(By.className("custom_dummy_label"));
		WebElement textBoxElementL3 = driver.findElement(inputButton);
		textBoxElementL3.sendKeys(labelElementL3.getText());
		WebElement continueButtonL3 = driver.findElement(nextButton);
		continueButtonL3.click();
	}

	public void level4() {
		comprovarTitol("Level 4");
		List<WebElement> el = driver.findElements(By.className("btn"));

		for ( WebElement e : el ) {
		   e.click();
		}
	}

	public void level5() {
		comprovarTitol("Level 5");
		
		WebElement list = driver.findElement(By.partialLinkText("Enlace!"));
		list.click();
	}

	public void level6() {
		comprovarTitol("Level 6");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		WebElement hiddenButton = driver.findElement(By.xpath("/html/body/div/div/input[2]"));
		js.executeScript("arguments[0].click();", hiddenButton);
	}

	public void level7() {
		//comprovarTitol("Level 7");
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public void level8() {
		//comprovarTitol("Level 8");
		alert = driver.switchTo().alert();
		alert.sendKeys("9"); //no es veu, i si no estigués seleccionat què passaria...
		alert.accept();
	}
	
	public void level9() throws InterruptedException {
		comprovarTitol("Level 9");
		Thread.sleep(400);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	
		WebElement passL9 = driver.findElement(By.id("pass"));
		String aux = passL9.getText();
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		
		WebElement textBoxElementL9 = driver.findElement(inputButton);
		
	    textBoxElementL9.sendKeys(aux);
	    
	    WebElement nextL9 = driver.findElement(nextButton);
	    nextL9.click();
	}

	public void level10() {
		comprovarTitol("Level 10");
	    
	    WebElement sourceElement = driver.findElement(By.id("source"));
	    WebElement targetElement = driver.findElement(By.id("target"));
	    
	    Actions act = new Actions(driver);
	    act.dragAndDrop(sourceElement,targetElement).build().perform();
	}
	
	public void privateNavigation() {
		WebElement advancedButton = driver.findElement(By.id("details-button"));
		advancedButton.click();
		WebElement proceedLink = driver.findElement(By.id("proceed-link"));
		proceedLink.click();
	}

	@Test
	public void testLevels() throws MalformedURLException, InterruptedException {

		// Open URL
		
		driver.get("https://pruebaselenium.serviciosdetesting.com/");
		privateNavigation();
		level1();
		level2();
		level3();
		level4();
		level5();
		level6();
		level7();
		level8();
		level9();
		level10();
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		driver.quit();
	}

}
