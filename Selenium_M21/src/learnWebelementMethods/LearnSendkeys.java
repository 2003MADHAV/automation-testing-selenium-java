package learnWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Virat@18");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL+"C");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Virat@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//button[text()='Register']")).click();
		driver.findElement(By.xpath("//button[text()='Register']")).submit();
		Thread.sleep(2000);
		// here submit() is not work because it's type is not sbmit
		driver.findElement(By.xpath("//section[text()='Check Box']")).submit();
		

	}

}
