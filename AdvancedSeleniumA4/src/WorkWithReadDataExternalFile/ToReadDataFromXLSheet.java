package WorkWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromXLSheet {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Create obj File
		File f = new File("./testData/testData.xlsx");
		
		//fis
		FileInputStream fis = new FileInputStream(f);
		
		//Create obj for xlfile
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//to retrieve sheet name
		String sheet = workbook.getSheetName(0);
		
		String url = workbook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();
		
		String un = workbook.getSheet(sheet).getRow(1).getCell(1).getStringCellValue();
		
		String pwd = workbook.getSheet(sheet).getRow(1).getCell(2).getStringCellValue();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
