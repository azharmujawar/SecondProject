package com.second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class SimpleClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		/*driver.get("https://www.facebook.com/login");
		
		driver.findElement(By.id("email")).sendKeys("Azhar");
		
		driver.findElement(By.id("pass")).sendKeys("password");
		
		driver.findElement(By.id("loginbutton")).click();*/
		
		
		driver.get("https://www.facebook.com/");
		
		
		// id locator
		/*driver.findElement(By.id("email")).sendKeys("Azhar");
		
		driver.findElement(By.id("pass")).sendKeys("password");
		
		//driver.findElement(By.id("u_0_2")).click();  //  id is not reliable
		// xpath locator and u can use name locator too
		 
		 
		driver.findElement(By.xpath("//*[@type='submit'][@value='Log In']")).click();*/
		
		
		
		driver.findElement(By.xpath("//*[@name='email'][@data-testid='royal_email']")).sendKeys("samirmulla33@gmail.com");
		//driver.findElement(By.xpath("//*[@name='pass'][@data-testid='royal_pass']")).sendKeys("password@");
		
		driver.findElement(By.xpath("//input[@name='pass'][@data-testid='royal_pass']")).sendKeys("password@");
		
		
		
	//	driver.findElement(By.xpath("//*[@type='submit'][@value='Log In']")).click();  //   "//*[@id='value'][@id2='value']"
		
		driver.findElement(By.cssSelector("input[type='submit'][value='Log In']")).click();
		
		//linktext locator
		// driver.findElement(By.linkText("Forgotten account?")).click();
		
		//partiallinktext locator
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		Thread.sleep(50000);
		
		
		
		driver.quit();
		

	}

}
