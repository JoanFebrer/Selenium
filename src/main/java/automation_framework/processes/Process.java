package automation_framework.processes;

import org.openqa.selenium.WebDriver;

public class Process {
	
	private WebDriver driver;
	
	public Process(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
