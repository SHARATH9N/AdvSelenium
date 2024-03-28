package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class basics {

	public static void main(String[] args) {
		System.out.println("From main method");
	}
	
	@Test
	public void test() {
		System.out.println("from test of @test");
	}
}
