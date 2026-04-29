package handling_popups;

import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindowOfShopersStack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='iphone']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("compare")).click();
		Set<String> ids = driver.getWindowHandles();
		for(String id:ids) {
	
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Online Shopping Site for Mobiles")) {
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
