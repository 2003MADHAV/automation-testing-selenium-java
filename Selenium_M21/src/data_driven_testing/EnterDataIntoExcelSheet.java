package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//Excel file--->WorkBook--->Sheets--->Rows--->cell
public class EnterDataIntoExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fileRead=new FileInputStream("./data/testscript.xlsx");
		Workbook workbook = WorkbookFactory.create(fileRead);
	//	workbook.getSheet("Sheet1").getRow(0).createCell(5).setCellValue("Feedback");
	//	workbook.getSheet("Sheet1").getRow(1).getCell(3).setCellValue("Cosmic Orange");
	//	workbook.getSheet("Sheet1").getRow(1).createCell(4).setCellValue("4.8 Star");
		workbook.getSheet("Sheet1").getRow(2).createCell(4).setCellValue("4.9 Star");
		workbook.getSheet("Sheet1").getRow(2).createCell(5).setCellValue("batery backup bad");
		FileOutputStream fileWrite=new FileOutputStream("./data/testscript.xlsx");
		workbook.write(fileWrite);
		workbook.close();
		fileRead.close();
		fileWrite.close();
	}
}
