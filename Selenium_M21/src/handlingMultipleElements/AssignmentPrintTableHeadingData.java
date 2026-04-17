package handlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPrintTableHeadingData {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(2000);
		List<WebElement> tabeHeadings = driver.findElements(By.xpath("//th"));
		List<WebElement> tableDatas = driver.findElements(By.xpath("//td"));
		System.out.println("count Table Heading : "+tabeHeadings.size());
		System.out.println("List of Table Heading ");
		for(WebElement tabeHeading:tabeHeadings) {
			System.out.println(tabeHeading.getText());
		}
		
		System.out.println("count Table Data : "+tableDatas.size());
		System.out.println("List of Table Data ");
		for(WebElement tableData:tableDatas) {
			System.out.println(tableData.getText());
		}
	}

}
