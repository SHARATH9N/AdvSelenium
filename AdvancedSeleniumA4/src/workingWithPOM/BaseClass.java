package workingWithPOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

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
	
	
	
}
