package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Beauty']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Electronics']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Electronics']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Home']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Appliances']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Toys, baby..']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Food & Health']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Auto Accessories']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='2 Wheelers']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sports & Fitness']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Books & Media']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Furniture']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='For You']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'/flights-travel')]")).click();Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/']")).click();Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Laptops",Keys.ENTER);
	}

}
