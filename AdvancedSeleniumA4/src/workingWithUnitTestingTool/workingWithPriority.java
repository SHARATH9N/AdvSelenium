package workingWithUnitTestingTool;


import org.testng.annotations.Test;

public class workingWithPriority {
// @Test
// public void run() {
////	 System.out.println("hello testNG");
//	 //Reporter.log("Hello testNg");	//to write the output in report
//	 Reporter.log("Hello testNg",true);	//to see the output in console.
// }
 
 @Test(priority = -3)
 public void register() {
	 System.out.println("User is able to register");
 }

 @Test(priority = -2)
 public void login() {
	 System.out.println("User is able to login");
 }
 
 @Test(priority = 0)
 public void searchProduct() {
	 System.out.println("User is able to search product");
 }
 
 @Test(priority = 4)
 public void addToCart() {
	 System.out.println("User is able to add to cart");
 }
 
 @Test(priority = 5)
 public void payment() {
	 System.out.println("User is able to payment");
 }
 
 @Test(priority = 6)
 public void closeTheApp() {
	 System.out.println("User is able to close the application");
 }
 
 @Test(alwaysRun = true)//to execute this method, even though other testCases fail to execute.
 public void testcase1() {
	 System.out.println("test case1 executed");
 }
 
 @Test(enabled = false)//to Skip the execution of this method.
 public void testcase2() {
	 System.out.println("test case2 executed");
 }
 
}