package automation_framework.utils;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Configuration {
	
	private WebDriver driver;
	
	public WebDriver initializeTestingEnvironment() {
		ArrayList<String> optionsList = new ArrayList<String>();
		ChromeOptions chromeOptions = new ChromeOptions();
		optionsList.add("--start-maximized");
		optionsList.add("--incognito");
		chromeOptions.addArguments(optionsList);
		driver = new ChromeDriver(chromeOptions);
		return driver;
	}
	

	public void closeTestingEnvironment() {
		driver.close();
	}
	
	

}
