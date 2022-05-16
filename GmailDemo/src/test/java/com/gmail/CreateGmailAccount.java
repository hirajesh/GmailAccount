package com.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateGmailAccount {

	String URL = "https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	WebDriver driver;

	@Test
	public void createAccount() {
		
		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverPath+"//chromedriver");

		driver = new ChromeDriver();
		driver.get(URL);
	//	driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[text()='Create account']")).click();

		driver.findElement(By.xpath("//*[text()='For myself']")).click();

		driver.findElement(By.id("firstName")).sendKeys("NameNAme");

		driver.findElement(By.id("lastName")).sendKeys("Namename");

		driver.findElement(By.id("username")).sendKeys("name1212mam");

		driver.findElement(By.xpath("//*[@id='passwd']/div[1]/div/div[1]/input")).sendKeys("Name123");

		driver.findElement(By.xpath("//*[@id='confirm-passwd']/div[1]/div/div[1]/input")).sendKeys("Name123");

		driver.findElement(By.xpath("//*[@id='selectioni1']")).click();

		driver.findElement(By.xpath("//*[@id='accountDetailsNext']/div/button/span")).click();

		System.out.println("Test Completed");

	}

}
