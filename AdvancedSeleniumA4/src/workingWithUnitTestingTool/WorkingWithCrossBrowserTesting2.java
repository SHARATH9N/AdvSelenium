package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingWithCrossBrowserTesting2 {
	public WebDriver driver;
	
	@Parameters({"browserName","url"})	//when you're passing 2 values you need pass in Array format.
	@Test
	public void browser(@Optional("edge") String browserName, @Optional("https://www.lamborghini.com/en-en") String url) throws InterruptedException {
		//@optional is used to specify the option of browser and url so we can run this @Test script itself and not xml file.												
															
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("fireFox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid Broowser Name");
		}
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
}
