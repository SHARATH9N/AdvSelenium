package WorkWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenDemoWebShop {
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("./testData/DemoWebshop.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		
		p.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(p.getProperty("url"));
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
