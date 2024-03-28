package genericLib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLoginForMultipleUsers 
{

	@Test(dataProvider = "data")
	public void Login(String email,String pwd) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		UtilityMethods um = new UtilityMethods();
		driver.get(um.readingDataFromPropertyFile("./testData/data.properties", "url"));
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log out")).click();
		
		driver.quit();
	}
	
	@DataProvider(name="data")
	public String[][] dataSupply() throws EncryptedDocumentException, IOException
	{
		return	UtilityMethods.readMultipleData("./testData/testData.xlsx", "Sheet1");
	}
	
	
}
