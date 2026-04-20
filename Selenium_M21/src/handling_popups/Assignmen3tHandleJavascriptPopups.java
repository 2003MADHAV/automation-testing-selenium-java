package handling_popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmen3tHandleJavascriptPopups {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkBox:checkBoxes) {
			checkBox.click();
		}
		driver.findElement(By.id("deleteButton")).click();
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.xpath("//table/child::tr")).getText();
		System.out.println(text);
		driver.quit();
	}

}
