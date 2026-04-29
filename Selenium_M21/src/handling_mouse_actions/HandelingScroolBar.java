package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingScroolBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.scrollByAmount(0, 5000).perform();
		Thread.sleep(2000);
		a.scrollByAmount(0, -1000).perform();
		Thread.sleep(2000);
		WebElement convenience = driver.findElement(By.xpath("//strong[contains(text(),'CONVENIENCE')]"));
		a.scrollToElement(convenience).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
