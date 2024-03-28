package genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Sharath N
 */
public class UtilityMethods {
	
	/**
	 * 
	 * @param path - pass the path of the property file
	 * @param key	- pass the key of the URL from property file
	 * @return	-	String URL
	 * @throws IOException
	 */
	
	
	public String readingDataFromPropertyFile(String path,String key) throws IOException {
		
		File f = new File(path);
		FileInputStream fis  = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty(key);
		return URL;
	}
	
	
	
	
	/**
	 * 
	 * @param path- Path of the excel sheet 
	 * @param sheetName-name of the sheet to read data
	 * @param rowNum-row number
	 * @param cellNum- column number
	 * @return data in the respective cell i.e userName and password
	 * @throws IOException
	 */
	
	public String readingDataFromExcelSinleValue(String path,String sheetName,int rowNum, int cellNum) throws IOException 
	{
		File f = new File(path);
		FileInputStream fis  = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String[][] readMultipleData(String path,String sheetName) throws EncryptedDocumentException, IOException
	{
		File f = new File(path);
		FileInputStream fis  = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);
		
		
		
		int numOfRows = workbook.getSheet(sheetName).getPhysicalNumberOfRows();
		
		int numOfClms = workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
		
		String[][] data = new String[numOfRows][numOfClms];
		for(int i=0;i<numOfRows;i++)
		{
			for(int j=0;j<numOfClms;j++)
			{
				data[i][j] = workbook.getSheet(sheetName).getRow(i).getCell(j).toString();
			}
		}
		return data;
		
		
	}
	
	
	
	
	
	
	
	
}
