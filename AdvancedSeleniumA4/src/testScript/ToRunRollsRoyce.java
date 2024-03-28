package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunRollsRoyce {
	
		@Test(groups = "car")
		public void p1() throws InterruptedException
			{
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
				Thread.sleep(3000);
				driver.quit();
			}
}
