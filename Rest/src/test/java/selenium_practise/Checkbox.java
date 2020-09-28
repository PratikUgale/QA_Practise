package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Checkbox {
	
	@Test
	public void check_checkbox()
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Project\\Rest\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.id("item-1")).click();
		driver.findElement(By.className("rct-checkbox")).click();
		Reporter.log("Click on checkbox \n", true);
		driver.findElement(By.xpath("//*[@title='Expand all']")).click();
		Reporter.log("succssfully expanded \n ",true);
		driver.findElement(By.xpath("//*[@title='Collapse all']")).click();
		Reporter.log("successfully collapse \n",true);
		
		//Radio button
		driver.findElement(By.id("item-2")).click();
		Reporter.log("radio button oppened \n", true);
		driver.findElement(By.xpath("//*[@for='impressiveRadio']")).click();
		Reporter.log("imoressive selected \n",true);
		driver.close();
	}

}
