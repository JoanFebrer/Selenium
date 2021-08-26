package automation_framework.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screen {
	
	private WebDriver driver;
	
	public Screen (WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement waitForElementVisibility(By element) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement foundElement=wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		if (foundElement!=null) {
			return foundElement;
		}
		else {
			throw new Exception("Element "+element.toString()+"is not found");
		}
	}
	
	public WebElement waitForElementClickable(By element) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement foundElement=wait.until(ExpectedConditions.elementToBeClickable(element));
		if (foundElement!=null) {
			return foundElement;
		}
		else {
			throw new Exception("Element "+element.toString()+"is not found");
		}
	}

}
