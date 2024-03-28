package workingWithUnitTestingTool;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workingWithInnvocationCount {
	
	@Test(invocationCount=3, threadPoolSize=4)			//innvocationCount for the multiple execution of the same method. 
														//threadPoolSize for parallel execution.
	
	public void run() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercedes-benz.co.in/passengercars.html?group=all&subgroup=see-all&view=BODYTYPE&gagcmid=GA_20685282646_153411963263_677718176048&gad_source=1&gclid=EAIaIQobChMIhMyPgu_hhAMVtVsPAh3WNgKwEAAYASAAEgLjavD_BwE&gclsrc=aw.ds");
		Thread.sleep(2000);
		driver.quit();

	}
}
