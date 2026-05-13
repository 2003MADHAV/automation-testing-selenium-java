package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
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

public class AssignmentDataDrivenTesting {
	public static void main(String[] args) throws IOException {
		FileInputStream propetryFile =new FileInputStream("./data/commandata.properties");
		Properties p=new Properties();
		p.load(propetryFile);
		String url = p.getProperty("url2");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Logininfo");
		int rowNum = sheet.getLastRowNum();
		for(int i=1;i<=rowNum;i++) {
			Row row = sheet.getRow(i);
			short cellNum = sheet.getRow(0).getLastCellNum();
			String pwd="";
			String user="";
			for(int j=0;j<cellNum;j++) {
				Cell cell = row.getCell(j);
				if(j==0) {
				 user = cell.getStringCellValue();
				}
				else if(j==1) {
					 pwd = cell.getStringCellValue();
				}	
			}
			driver.get(url);
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			boolean status = driver.getCurrentUrl().contains("inventory.html");
			String result;
			if(status==true) {
				result="Pass";
			}else if(driver.findElements(By.cssSelector("h3[data-test='error']")).size() > 0) {
			    result = "Fail";
			}
			else {
				result="Fail";
			}
			row.createCell(2).setCellValue(result);
		}
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		workbook.write(fos);
		driver.quit();
	}
}
