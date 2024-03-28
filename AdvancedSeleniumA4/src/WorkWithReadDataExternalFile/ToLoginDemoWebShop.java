package WorkWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginDemoWebShop {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("./testData/DemoWebshopLogin.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		
		p.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(p.getProperty("emailid"));
		
		driver.findElement(By.id("Password")).sendKeys(p.getProperty("password"));
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.linkText("goku007@gmail.com")).click();
		
//	String fname = driver.findElement(By.xpath("//input[@id='FirstName']")).getAttribute("value");
//		System.out.println(fname);
//		
//		String lname = driver.findElement(By.xpath("//input[@id='LastName']")).getAttribute("value");
//		System.out.println(lname);
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
	}
}
