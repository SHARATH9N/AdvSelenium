package workingWithTestingProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	String emailid = "goku007@gmail.com";
	String password = "Goku007!";
	String actualURL = "https://demowebshop.tricentis.com/";
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am Before Suite");
		Reporter.log("DataBAse connection start",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am After Suite");
		Reporter.log("DataBAse connection Stop",true);
	}
	
	//BeforeTest
	@BeforeClass
	public void browserSetUp() throws InterruptedException, IOException {
		
		File f = new File("./testData/DemoWebshopLogin.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		
		p.load(fis);
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("User able to open empty browser",true);
		driver.get(p.getProperty("url"));
		Reporter.log("User able to open DemoWebShop browser",true);
		String url = driver.getCurrentUrl();
		if (url.equals(actualURL)) {
			Reporter.log("User is able to land on the DemoWeb shop Home Page",true);
		} else {
			Reporter.log("USer is not able to open DemoWeb shop",true);
		}
		
		Thread.sleep(6000);
		
	}
	
	@AfterClass
	public void ToQuitBrowser() {
		driver.quit();
		Reporter.log("User is able to close the demoWebShop",true);
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(emailid);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("USer is able to login",true);
		Thread.sleep(6000);
		
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("User is able to logOUT",true);
		Thread.sleep(6000);
	}
	
	
	
	
	
	
}
