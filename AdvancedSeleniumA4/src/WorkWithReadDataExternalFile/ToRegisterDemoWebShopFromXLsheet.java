package WorkWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterDemoWebShopFromXLsheet {
public static void main(String[] args) throws IOException, InterruptedException {
		
		//Create obj File
		File f = new File("./testData/testData.xlsx");
		
		//fis
		FileInputStream fis = new FileInputStream(f);
		
		//Create obj for xlfile
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//to retrieve sheet name
		String sheet = workbook.getSheetName(1);
		
		
		String url = workbook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();
		
		
		String fname = workbook.getSheet(sheet).getRow(1).getCell(1).getStringCellValue();
		
		String lname = workbook.getSheet(sheet).getRow(1).getCell(2).getStringCellValue();
		
		String email = workbook.getSheet(sheet).getRow(1).getCell(3).getStringCellValue();
		
		String pwd = workbook.getSheet(sheet).getRow(1).getCell(4).getStringCellValue();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fname);
		driver.findElement(By.id("LastName")).sendKeys(lname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(pwd);
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		Thread.sleep(6000);
		
		driver.quit();
	}
}
