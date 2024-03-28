package genericLib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromExcelSingleData 
{

	@Test
	public void ToOpenDemoWebShop() throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		UtilityMethods um = new UtilityMethods();
		driver.get(um.readingDataFromPropertyFile("./testData/data.properties", "url"));
		
		
		driver.findElement(By.linkText("Log in")).click();
		
		String email = um.readingDataFromExcelSinleValue("./testData/testData.xlsx", "data", 1, 1);
		driver.findElement(By.id("Email")).sendKeys(email);
		
		String pwd = um.readingDataFromExcelSinleValue("./testData/testData.xlsx", "data", 1, 2);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log out")).click();
		
		driver.quit();
		
	}
}
