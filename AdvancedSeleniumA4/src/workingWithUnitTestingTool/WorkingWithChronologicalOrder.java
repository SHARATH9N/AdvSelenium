package workingWithUnitTestingTool;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithChronologicalOrder {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am Before Suite");
		System.out.println("DataBAse connection start");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am After Suite");
		System.out.println("DataBAse connection Stop");
	}
	
	@Test		//TestCase
	public void test() {
		System.out.println("I am @test");
	}
	
	@Test		//TestCase
	public void run() {
		System.out.println("I am run");
	}
	
	@BeforeTest
	public void  beforeTest() {
		System.out.println("I am Before Test");
	}
	
	@AfterTest
	public void  afterTest() {
		System.out.println("I am After Test");
	}
	
	@BeforeClass
	public void  beforeClass() {
		System.out.println("I am before Class");
	}
	
	@AfterClass
	public void  afterClass() {
		System.out.println("I am after Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I am before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I am after Method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
