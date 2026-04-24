package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerfromOperationOnSpecificWindowsPopups {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Popups']")).click();
		driver.findElement(By.xpath("//*[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String id:ids) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Mobile"));
			break;
		}
		
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		
		driver.quit();

	}

}
