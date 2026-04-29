package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintEnteredValueInsearchBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.switchTo().activeElement();
		searchbox.sendKeys("Qspiders");
		System.out.println(searchbox.getAttribute("value"));
		
	
		WebElement text = driver.findElement(By.xpath("//textarea[@name='q']"));
		System.out.println(text.getAttribute("value"));
		driver.quit();

	}

}
