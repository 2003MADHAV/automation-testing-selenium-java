package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3HandleingFrame_rediff_apln {

	public static void main(String[] args) {
		ChromeOptions notification=new ChromeOptions();
		notification.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(notification);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		String nsePrice = driver.findElement(By.xpath("//span[@id='nseindex']")).getText();
		System.out.println("NSE Price is :  "+nsePrice);
		driver.findElement(By.xpath("//span[text()='NSE']")).click();
		//span[text()='NSE']/following-sibling::span
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.quit();
	}

}
