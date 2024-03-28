package workingWithTestingProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_Demo_007{
	
	@Test
	public void verifyRegistrationDetails() throws InterruptedException, IOException {
	
		
		File f = new File("./testData/DemoWebShopRegister.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		
		SoftAssert sf = new SoftAssert();
		
		String expectedFname = p.getProperty("fname");
		String expectedLname = p.getProperty("lname");
		String expectedEmail = p.getProperty("emailid");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(p.getProperty("fname"));
		driver.findElement(By.id("LastName")).sendKeys(p.getProperty("lname"));
		driver.findElement(By.id("Email")).sendKeys(p.getProperty("emailid"));
		driver.findElement(By.id("Password")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(p.getProperty("password"));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		driver.findElement(By.linkText(p.getProperty("emailid"))).click();
		
		String actualFname = driver.findElement(By.xpath("//input[@id='FirstName']")).getAttribute("value");
		System.out.println(actualFname);
		sf.assertEquals(actualFname, expectedFname);
		
		String actualLname = driver.findElement(By.xpath("//input[@id='LastName']")).getAttribute("value");
		System.out.println(actualLname);
		sf.assertEquals(actualLname, expectedLname);
		
		String actualEmail = driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value");
		System.out.println(actualEmail);
		sf.assertEquals(actualEmail, expectedEmail);
		
		
		
		Thread.sleep(6000);
	
		driver.findElement(By.linkText("Log out")).click();
		
		driver.quit();
		
		sf.assertAll();
	
	}
	
}
