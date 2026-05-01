package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2HandleNestedMultipleIframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Frames']")).click();
		driver.findElement(By.xpath("//*[text()='iframes']")).click();
		driver.findElement(By.xpath("//*[text()='Nested with Multiple iframe']")).click();
		Thread.sleep(2000);
		//frame1
		driver.switchTo().frame(0);
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		String pwd = driver.findElement(By.xpath("//p[text()='Admin@1234']")).getText();
		//frame2
		driver.switchTo().frame(0);
		//frame3  3-->1
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		driver.switchTo().parentFrame();
		//frame4  3--> 2
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
		driver.switchTo().parentFrame();
		//frame5  3-->3
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys(pwd);
		
		driver.switchTo().parentFrame();
		//frame6  3-->4
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();
		
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
