package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	WebDriver driver;
	
	public void launchSite() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://staging3-akes.nexquare.io");
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtuser\"]"));
		username.sendKeys("S0075");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtpassword\"]"));
		password.sendKeys("Abc!@1");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"log-btn\"]"));
		
		login.click();
		
		
		WebElement staffprofile = driver.findElement(By.xpath("//*[@id=\"Staff Profile Management\"]"));
		staffprofile.click();
		
	}

}
