import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Azhar");
		driver.findElement(By.id("pass")).sendKeys("password");
		
		//driver.findElement(By.id("u_0_8")).click();
		
		driver.findElement(By.xpath("//*[@type='submit'][@value='Log In']")).click();
		
		driver.quit();

		
		

		
	}

}
