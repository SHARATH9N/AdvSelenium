package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider1 {

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
	public void dataDemo(String[] regData) {
		System.out.println(regData[0]);
		System.out.println(regData[1]);
		System.out.println(regData[2]);
		System.out.println(regData[3]);
		System.out.println(regData[4]);
		System.out.println("---------------");
		
		
	}
}
