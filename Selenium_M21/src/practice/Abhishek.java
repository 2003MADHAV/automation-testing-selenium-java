package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhishek {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://127.0.0.1:5500/Page1.html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("email")).sendKeys("sdnhksjlfs");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("username")).sendKeys("abhisheck12334");
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		driver.switchTo().frame("fame_2");
		driver.findElement(By.id("password1")).sendKeys("masnkdl");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("phNo")).sendKeys("783493905739");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("password")).sendKeys("madjasdjk@");
		driver.switchTo().frame(frame1);
		driver.switchTo().frame("fame_2");
		driver.findElement(By.id("password2")).sendKeys("dklfz@dfklf");
		
	}

}
