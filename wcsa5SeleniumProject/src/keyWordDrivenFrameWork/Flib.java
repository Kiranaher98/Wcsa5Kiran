package keyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	
	public String readExcelData(String excelPath,String sheetName,int rowCount, int cellCount) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet(sheetName);
	 Row row = sheet.getRow(rowCount);
	 Cell cell = row.getCell(cellCount);
	 String data = cell.getStringCellValue();
	 return data;
	}
	
	  public int lastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
		  
       FileInputStream fis = new FileInputStream(excelPath);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet(sheetName);
         int rc = sheet.getLastRowNum();
         return rc;
         
	  }
	  
	  public void writeDtaInExcel (String excelPath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath);
	  Workbook wb = WorkbookFactory.create(fis);
	  Sheet sheet = wb.getSheet(sheetName);
    	Row row = sheet.getRow(rowCount);
	   Cell cell = row.createCell(cellCount);

	  cell.setCellValue(data);
    FileOutputStream fos = new FileOutputStream(excelPath);
	  wb.write(fos);
	  }
	  
	 // It is used to read data from property file
	  public String readPropertyDta(String propPath, String key, String data) throws IOException
	  {
	
		FileInputStream fis = new FileInputStream(propPath);
		//create object of property class
          Properties prop = new Properties();
          // make file ready to read
          prop.load(fis);
          //read particular key from file
          prop.getProperty(key);
          return data;
	  }
     
}
