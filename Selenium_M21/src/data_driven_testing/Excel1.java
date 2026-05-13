package data_driven_testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		//String file="./data/commandata.properties";
		String file="./data/product_data.xlsx";
		String url = f.readDataFromPropertyFile("url", file);
		String un = f.readDataFromPropertyFile("username", file);
		String pwd = f.readDataFromPropertyFile("pwd", file);
	
		/*	
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		*/
	/*	
		String data1 = f.readDataFromExcel("multipleData", 0, 7, file);
		System.out.println(data1);
		String data2 = f.readDataFromExcel("multipleData", 3, 2, file);
		System.out.println(data2);
		String data3 = f.readDataFromExcel("multipleData", 5, 5, file);
		System.out.println(data3);
		*/
		f.writeDataIntoExcel("multipleData", 0, 7, "Product Avilabilty", file);
		f.writeDataIntoExcel("multipleData", 4, 7, "Sold", file);
	}

}
