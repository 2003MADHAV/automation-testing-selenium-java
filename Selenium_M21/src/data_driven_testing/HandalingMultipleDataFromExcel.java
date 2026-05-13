package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandalingMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowNum = sheet.getLastRowNum();
		short cellNum = sheet.getRow(1).getLastCellNum();
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	
		System.out.println(rowNum);
		System.out.println(cellNum);
		for(int r=0;r<=rowNum;r++) {
			Row row = sheet.getRow(r);
			for(int c=0;c<=cellNum;c++) {
				String value = row.getCell(c).getStringCellValue();
				System.out.println(value);
			}
		}
	}

}
