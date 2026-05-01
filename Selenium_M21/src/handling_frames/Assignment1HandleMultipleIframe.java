package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1HandleMultipleIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Frames']")).click();
		driver.findElement(By.xpath("//*[text()='iframes']")).click();
		driver.findElement(By.xpath("//*[text()='Multiple iframe']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//button[@id='submitButton']")).submit();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.xpath("//button[@id='submitButton']")).submit();
		
		driver.quit();
	}

}
