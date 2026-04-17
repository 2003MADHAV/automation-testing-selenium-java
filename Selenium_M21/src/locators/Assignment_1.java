package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("madhav23@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("mkchy@#2025");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot password?")).click();
		
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		/*------------------------------------------------------------- */
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("madhav3@gmail.com");
		
		driver.quit();
	}

}
