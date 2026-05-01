package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingNestedFrames {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Madhav/Qspider/learnigHTML/Page1.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("madhav");
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("madhav23@gmail.com");
		driver.switchTo().frame("fame_2");
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("madhav2026");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='phNo']")).sendKeys("8936845863");
		//driver.switchTo().frame("fame_2");
		WebElement frameAdress = driver.findElement(By.xpath("//iframe[@id='fame_2']"));
		driver.switchTo().frame(frameAdress);
		driver.findElement(By.xpath("//input[@id='password2']")).sendKeys("madhav2026");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("madhav2026");
		driver.quit();
	}

}
