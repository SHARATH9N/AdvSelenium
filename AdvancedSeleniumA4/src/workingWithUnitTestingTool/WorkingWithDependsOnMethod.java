package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithDependsOnMethod {

	@Test
	public void register() {
		System.out.println("Register");
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Search");
	}
	
	@Test(dependsOnMethods = "search")
	public void cart() {
		System.out.println("cart");
	}
	
	@Test(dependsOnMethods = "cart")
	public void payment() {
		System.out.println("payment");
	}
}
