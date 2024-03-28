package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunRolex {
	@Test(groups = "watch")
	public void p1() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rolex.com/watches?gclid=EAIaIQobChMIj5zG3eTmhAMVv18PAh0dOAuaEAAYASAAEgK4wfD_BwE&ef_id=EAIaIQobChMIj5zG3eTmhAMVv18PAh0dOAuaEAAYASAAEgK4wfD_BwE:G:s&s_kwcid=AL!141!3!682973060328!e!!g!!rolex!8671766870!85335561725&gad_source=1");
			Thread.sleep(3000);
			driver.quit();
		}
}
