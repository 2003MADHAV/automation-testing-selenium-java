package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com");Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.cssSelector("a[class='ico-login']"));
		ele1.click();Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.cssSelector("input[id='Email']"));
		ele2.sendKeys("jaisriram@gmail.com");Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.cssSelector("input[id='Password']"));
		ele3.sendKeys("JaiSriRam");Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.cssSelector("input[id='RememberMe']"));
		ele4.click();Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.cssSelector("a[href='/passwordrecovery']"));
		ele5.click();Thread.sleep(2000);
		
		WebElement ele6 = driver.findElement(By.cssSelector("input[class='email']"));
		ele6.sendKeys("JaiSriRam@gmai.com");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
