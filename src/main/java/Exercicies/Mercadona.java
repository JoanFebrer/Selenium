package Exercicies;

import static org.junit.Assert.assertEquals;


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
import org.openqa.selenium.support.ui.Select;

public class Mercadona {

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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testLevels() {

		// Open URL
		driver.get("https://www.mercadona.es/");

		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/form/div/input")).sendKeys("08173");
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/form/input")).click();
		
		driver.get(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/ul/li[1]/h2/a")).click();
		
		driver.get(driver.getCurrentUrl());
		//driver.switchTo().activeElement();
		
		driver.findElement(By.id("Nom")).sendKeys("Xavi");
		driver.findElement(By.id("Cognom1")).sendKeys("Pastanaga");
		driver.findElement(By.id("Cognom2")).sendKeys("Mafia");
		driver.findElement(By.id("Identificacio")).sendKeys("43193910P");
		driver.findElement(By.id("Email1")).sendKeys("JaviTrigo@gmail.com");
		driver.findElement(By.id("ConfirmaEmail")).sendKeys("JaviTrigo@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("XaviSan13");
		driver.findElement(By.id("ConfirmaPassword")).sendKeys("XaviSan13");
		
		driver.findElement(By.xpath("/html/body/form[1]/div/div[3]/div[1]/div[2]/div[2]/a[1]")).click();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		WebElement tipoDeVia = driver.findElement(By.id("idtv"));
		Select via = new Select(tipoDeVia);
		via.selectByValue("1");
		
		driver.findElement(By.id("NombreVia")).sendKeys("Lluis Vermell");
		driver.findElement(By.id("NumKm")).sendKeys("6");
		driver.findElement(By.id("Piso")).sendKeys("3");
		driver.findElement(By.id("Puerta")).sendKeys("B");
		driver.findElement(By.id("UrbPol")).sendKeys("Urbanización");
		driver.findElement(By.id("Observaciones")).sendKeys("Se entra por la puerta azul");
		driver.findElement(By.id("nomLocalidad")).sendKeys("Barcelona");
		driver.findElement(By.id("NDCP")).sendKeys("08173");
		driver.findElement(By.id("idcheck")).click();		
		driver.findElement(By.xpath("/html/body/form[1]/div/div[2]/div[3]/div/a[1]")).click();
		
		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.xpath("/html/body/form[1]/div/div[3]/div[2]/div[2]/div[2]/a[1]")).click();
		
		ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		
		driver.findElement(By.id("NTelefono")).sendKeys("999333222");
		driver.findElement(By.id("idcheck")).click();
		driver.findElement(By.xpath("/html/body/form[1]/div/div[2]/div[3]/div/a[1]")).click();
		
		driver.switchTo().window(tabs.get(0));
		
		WebElement checkboxServei = driver.findElement(By.id("idfaltaserv"));
		Select serv = new Select(checkboxServei);
		
		serv.selectByValue("1");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/p/a[2]")).click();
		
		driver.findElement(By.id("Acuerdo")).click();
		
	    
	}

	// CLOSE DRIVER INSTANCE
	@AfterClass
	public static void closeTestSuite() {
		// Close browser
		// driver.close();
	}

}
