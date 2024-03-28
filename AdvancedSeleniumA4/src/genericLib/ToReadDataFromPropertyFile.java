package genericLib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromPropertyFile {
	
	@Test
	public void ToOpenDemoWebShop() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		UtilityMethods um = new UtilityMethods();
		driver.get(um.readingDataFromPropertyFile("./testData/data.properties", "url"));
		
		}
}
