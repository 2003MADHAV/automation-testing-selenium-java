package learnWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.id("name"));
		WebElement pwd = driver.findElement(By.id("password"));
		 Rectangle nameSize = name.getRect();
		 Rectangle pwdSize = pwd.getRect();
		
		int nameHeight = nameSize.getHeight();
		int nameWidth = nameSize.getWidth();
		
		int pwdHeight = pwdSize.getHeight();
		int pwdWidth = pwdSize.getWidth();
	
		int nameXAxix=nameSize.getX();
		//int nameYAxix=nameSize.getY();
		
		int pwdXAxis=pwdSize.getX();
		//int pwdYAxis=pwdSize.getY();
		
		
		if(nameHeight==pwdHeight && nameWidth==pwdWidth && nameXAxix==pwdXAxis )  {
			System.out.println("Pass");
			
		}else {
			System.out.println("Fail");
		}
		driver.quit();
	}
}
