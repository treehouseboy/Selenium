package com.qa.quickstart.Selenium;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebTest {

	WebDriver driver;
	WebElement checkElement;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDev\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void mthodTest() {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk/");
		driver.navigate().to("https://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("pink socks");
		driver.findElement(By.name("btnK")).click();	
	}

	@After
	public void teardown() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
