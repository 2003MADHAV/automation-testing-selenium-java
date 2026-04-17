package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AssignmentXPath {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.findElement(By.xpath("//a[@href='/login']")).click();
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jai@gmail.com");
		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jai@#123");
		 driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		 driver.findElement(By.xpath("//a[@href='/passwordrecovery']")).click();
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jai@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@name='send-email']")).click();
		 Thread.sleep(2000);
		 driver.quit();
		 
	}

}
