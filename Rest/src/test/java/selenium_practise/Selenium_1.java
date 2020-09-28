package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Selenium_1 {
	
	@Test
	public void Textbox() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "‪‪G:\\Project\\Rest\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "G:\\Project\\Rest\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.className("text")).click();
		driver.findElement(By.id("userName")).sendKeys("Pratik");
		driver.findElement(By.id("userEmail")).sendKeys("demo@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		driver.findElement(By.id("permanentAddress")).sendKeys("Pune");
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).click();
		Reporter.log("Transaction complted successfully");
		driver.close();
		
	}
	

}
