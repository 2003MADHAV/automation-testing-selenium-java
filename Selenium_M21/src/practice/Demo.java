package practice;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobile",Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='✕']")).click();
		List<WebElement> items = driver.findElements(By
	.xpath("//div[@class='css-g5y9jx r-18u37iz']/descendant::a"));
		for(WebElement item:items) {
			
			//String link = item.getAttribute("href");
		    //((JavascriptExecutor)driver).executeScript("window.open(arguments[0])", link);
			
			item.click();
			Thread.sleep(2000);
		 driver.findElements(By.xpath("//div[@class='css-g5y9jx r-18u37iz']/descendant::a"));
		}
	}
}
