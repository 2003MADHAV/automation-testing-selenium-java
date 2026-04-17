package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/index.html");
		
		//Thread.sleep(2000);
		// uses of tagName()
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
		
		//Thread.sleep(2000);
		driver.navigate().back();
		
		//Thread.sleep(2000);
		// uses of id()
		WebElement ele1 = driver.findElement(By.id("Link_2"));
		ele1.click();
		
		//Thread.sleep(2000);
		driver.navigate().back();
		
		//Thread.sleep(2000);
		// uses of name()
		WebElement ele2 = driver.findElement(By.name("Qspiders"));
		ele2.click();
		
		//Thread.sleep(2000);
		driver.navigate().back();
		WebElement ele3 = driver.findElement(By.className("google_link"));
		ele3.click();
		
		driver.quit();
	}

}
