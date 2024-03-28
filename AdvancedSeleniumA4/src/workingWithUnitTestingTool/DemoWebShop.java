package workingWithUnitTestingTool;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerDemo.class)
public class DemoWebShop {
	public static WebDriver driver;
	String  expectedURL = "https://demowebshop.tricentis.com/";
	
	
	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String actualURL = driver.getCurrentUrl();
		assertEquals(actualURL, expectedURL);
		
		driver.quit();
		
		
		
	}
}
