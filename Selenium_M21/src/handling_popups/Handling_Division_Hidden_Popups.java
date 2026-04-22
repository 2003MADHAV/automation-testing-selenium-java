package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Division_Hidden_Popups {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//*[text()='Hidden division']")).click();
		driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
		//driver.findElement(By.xpath("//*[text()='X']")).click();
		driver.findElement(By.xpath("//*[@id='customerName']")).sendKeys("Madhav");
		driver.findElement(By.xpath("//*[@id='customerEmail']")).sendKeys("madhavkr12@gmail.com");
		WebElement opt = driver.findElement(By.xpath("//*[@id='prod']"));
		Select s=new Select(opt);
		s.selectByValue("Mobile");
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("Welocme");
		driver.findElement(By.xpath("//*[text()='Submit']")).submit();
		System.out.println("Pass");
		driver.quit();

	}

}
