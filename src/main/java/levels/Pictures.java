package levels;

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
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

public class Pictures {

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
	public void testLevels() throws IOException, MalformedURLException {

		// Open URL
		driver.get("https://pixabay.com/es/");
		
		
		try {Thread.sleep(200);}
		catch (Exception e) {}
		
		WebElement textBox = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[4]/form/div/span/input"));
		textBox.sendKeys("rayo");
		WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[4]/form/div/input"));
		submit.click();
		
		try {Thread.sleep(400);}
		catch (Exception e) {}
		
		WebElement trendsSection = driver.findElement(By.id("app"));
		List<WebElement> trendsList = trendsSection.findElements(By.className("container--3NC_b"));
		int i = 0;
		for (WebElement t : trendsList) {
			WebElement imgFather = t.findElement(By.className("link--h3bPW"));
			WebElement imgElement = imgFather.findElement(By.tagName("img"));
			WebElement keywordsFather = t.findElement(By.className("overlay--2UjTN"));
			WebElement keywordsElement = keywordsFather.findElement(By.className("keywordsContainer--yceZ_"));	
			List<WebElement> keywordsList = keywordsElement.findElements(By.cssSelector("*"));
			Boolean tag = false;
			for (WebElement k : keywordsList) {
				if (k.getAttribute("href").contains("rayo")) tag = true;
			}
			if (imgElement.getAttribute("src") != null && tag == true) {
			String img = imgElement.getAttribute("src");
			URL imageURL = new URL(img);
			try {BufferedImage saveImage = ImageIO.read(imageURL);
			ImageIO.write(saveImage,"png", new File(i + ".png"));
			++i;}
			catch (Exception e) { 
				System.out.println(img);
				System.out.println("no funciona per " + e);}
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
