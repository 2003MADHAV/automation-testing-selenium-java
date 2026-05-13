package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/*
	 * It is generic method for Reading  the data Properties file
	 * @param key  @param filePath
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key, String filePath) throws IOException {
		FileInputStream fis=new FileInputStream(filePath);
		Properties property=new Properties();
		property.load(fis);
		String data = property.getProperty(key);
		fis.close();
		return data;
	}
	/*
	 * It is generic method for Reading  the data mentioned cell
	 * @param sheetName @param rowIndex @param CellIndex @param value @param filePath
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String  readDataFromExcel(String sheetName,int rowIndex,int cellIndex,String filePath ) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(filePath);
		 Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		wb.close();
		fis.close();
		return data;
	}
	/*
	 * It is generic method for writing the data mentioned cell
	 * @param sheetName @param rowIndex @param CellIndex @param value @param filePath
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataIntoExcel(String sheetName,int rowIndex,int cellIndex,String value,String filePath ) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowIndex).createCell(cellIndex).setCellValue(value);
		FileOutputStream fos=new FileOutputStream(filePath);
		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();
	}
	
}
