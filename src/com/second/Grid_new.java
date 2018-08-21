package com.second;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_new {

	WebDriver driver;
	public void beforeTest() throws MalformedURLException
	{
		
		DesiredCapabilities capabalities =new DesiredCapabilities();
		
		capabalities.setBrowserName("internet explorer");
		
		driver=new RemoteWebDriver(new URL("http://192.168.0.3:5454/wd/hub"), capabalities);
		
		
		//System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		//driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void T()
	{
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("Azhar");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("password");
		
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
		}
	
	public void afterTest()
	{
		driver.quit();
	}
	public static void main(String[] args) throws MalformedURLException {
		
		
		Grid_new ref=new Grid_new();
		
		ref.beforeTest();
		ref.T();
		ref.afterTest();
	
	
		

	}

}
