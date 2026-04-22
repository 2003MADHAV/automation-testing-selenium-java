package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownlaod_Popups {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/download");
		driver.findElement(By.id("writeArea")).sendKeys("Welomce To Software Testing , I Like to Writing Script in Selenium With Java");
		driver.findElement(By.xpath("//button[text()='Download']")).click();
	}

}
