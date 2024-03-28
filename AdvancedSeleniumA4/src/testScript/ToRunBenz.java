package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunBenz {
	@Test(groups = "car")
	public void p1() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.mercedes-benz.co.in/passengercars.html?group=all&subgroup=see-all&view=BODYTYPE&gagcmid=GA_20685282646_153411963263_677718176048&gad_source=1&gclid=EAIaIQobChMI26bPvebmhAMVoaJmAh2qTQKyEAAYASAAEgKpufD_BwE&gclsrc=aw.ds");
			Thread.sleep(3000);
			driver.quit();
		}
}
