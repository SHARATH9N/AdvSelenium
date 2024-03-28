package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunTagHeuer {
	@Test(groups = "watch")
	public void p1() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tagheuer.com/in/en/");
			Thread.sleep(3000);
			driver.quit();
		}
}
