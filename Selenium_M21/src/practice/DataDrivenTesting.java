package practice;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataDrivenTesting {
	
public static void main(String[] args) throws IOException {
		// Load properties file
		FileInputStream propetryFile =new FileInputStream("./data/commandata.properties");
		// Create Properties class object
		Properties p=new Properties();
		// Load properties file data into Properties object
		p.load(propetryFile);
		// Fetch URL value from properties file
		String url = p.getProperty("url2");
		// Launch Chrome browser
		WebDriver driver =new ChromeDriver();
		// Maximize browser window
		driver.manage().window().maximize();
		// Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Open Excel file
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		// Create workbook object
		Workbook workbook = WorkbookFactory.create(fis);
		// Get sheet named "Logininfo"
		Sheet sheet = workbook.getSheet("Logininfo");
		// Get last row index from sheet
		int rowNum = sheet.getLastRowNum();
		// Read data row by row from Excel
		for(int i=1;i<=rowNum;i++) {
			// Get current row
			Row row = sheet.getRow(i);
			// Get total number of cells from first row
			short cellNum = sheet.getRow(0).getLastCellNum();
			// Store password value
			String pwd="";
			// Store username value
			String user="";
			// Read cell values one by one
			for(int j=0;j<cellNum;j++) {
				// Get current cell
				Cell cell = row.getCell(j);
				// Read username from first column
				if(j==0) {
				 user = cell.getStringCellValue();
				}
				// Read password from second column
				else if(j==1) {
					 pwd = cell.getStringCellValue();
				}	
			}
			// Open application URL inside first loop 
			driver.get(url);
			// Enter username inside first loop
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
			// Enter password inside first loop
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			// Click on Login button inside first loop
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			// Verify login success by checking URL
			boolean status = driver.getCurrentUrl().contains("inventory.html");
			// Store test result
			String result;
			// If login successful
			if(status==true) {
				result="Pass";
			}
			// Default fail condition
			else {
				result="Fail";
			}
			// Write result into 3rd column in Excel
			row.createCell(2).setCellValue(result);
		}
		// Create output stream to write data back into Excel
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		// Write updated workbook data
		workbook.write(fos);
		driver.quit();
	}
}
