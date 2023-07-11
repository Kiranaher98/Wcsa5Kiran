package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelPath, String sheetName, int rowC,int cellC ) throws EncryptedDocumentException, IOException 
	{

		FileInputStream fis = new FileInputStream(excelPath);



		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowC);
		Cell cell = row.getCell(cellC);
		String data = cell.getStringCellValue();
		return data;
	}
	public int lastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rowNum = sheet.getLastRowNum();
		return rowNum;
	}
	public void WriteDataInExcel(String excelPath, String sheetName, int rowNum, int celNum, String WriteCellValue) throws  IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row =sheet.createRow(rowNum);
		Cell cell=row.createCell(celNum);
		cell.setCellValue(WriteCellValue);
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
	}
}
