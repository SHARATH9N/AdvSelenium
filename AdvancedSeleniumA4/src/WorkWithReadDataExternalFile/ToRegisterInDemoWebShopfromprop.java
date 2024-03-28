package WorkWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterInDemoWebShopfromprop {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		File f = new File("./testData/DemoWebShopRegister.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(p.getProperty("fname"));
		driver.findElement(By.id("LastName")).sendKeys(p.getProperty("lname"));
		driver.findElement(By.id("Email")).sendKeys(p.getProperty("emailid"));
		driver.findElement(By.id("Password")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(p.getProperty("password"));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		
		
		Thread.sleep(6000);
	
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
		
	}
}
