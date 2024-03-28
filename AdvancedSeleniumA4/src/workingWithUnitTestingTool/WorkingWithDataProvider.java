package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	
	@DataProvider(name="testData")
	public String[][] getData(){
		
		String[][] data = new String[2][5];
		data[0][0] = "Goku";
		data[0][1] = "Mysuru";
		data[0][2] = "goku009@gmail.com";
		data[0][3] = "Goku009!";
		data[0][4] = "Goku009!";
		
		data[1][0] = "Gohan";
		data[1][1] = "USA";
		data[1][2] = "gohan009@gmail.com";
		data[1][3] = "Gohan009!";
		data[1][4] = "GohanS009!";
		
		return data;
	}
	
	
	@Test(dataProvider = "testData")
	public void dataDemo(String fname,String lname,String email,String password,String confirmpwd) {
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(password);
		System.out.println(confirmpwd);
		System.out.println("---------------");
		
	}
	
	
	
}
