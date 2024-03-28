package workingWithUnitTestingTool;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import com.google.common.io.Files;   //Used for  Files from com.google.common.io.Files package

public class ListenerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Test Case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Test Case success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Test Case failed");
		
		TakesScreenshot t = (TakesScreenshot) DemoWebShop.driver;
		
		LocalDateTime systemTime = LocalDateTime.now();
		System.out.println(systemTime);
		String screenshotName = systemTime.toString().replace(":", "-");
		//String title = DemoWebShop.driver.getTitle();
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/"+screenshotName+".png");
		
		try {
			//Files.copy(src, dest);
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
}
