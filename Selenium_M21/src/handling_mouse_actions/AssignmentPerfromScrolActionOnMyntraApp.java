package handling_mouse_actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssignmentPerfromScrolActionOnMyntraApp {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions notfi=new ChromeOptions();
		notfi.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(notfi);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[@data-reactid='21' and text()='Men']"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		Thread.sleep(3000);
		 WebElement sneakers=driver.findElement(By.xpath("//a[text()='Sneakers']"));
		 action.click(sneakers).perform();
		WebElement rightPointer = driver.findElement(By.xpath("//*[@id='rootRailThumbRight']"));
		action.clickAndHold(rightPointer).moveByOffset(-90, 0).build().perform();
		action.release(rightPointer).perform();
		Thread.sleep(2000);
		WebElement lastProduct = driver.findElement(
				By.xpath("(//h3[@class='product-brand']/ancestor::a)[last()]"));
		action.scrollToElement(lastProduct ).perform();
		 Thread.sleep(2000);
		 action.click(lastProduct).perform();
		 action.release(lastProduct).perform();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
		}
		driver.findElement(By.xpath("//input[@class='pincode-code']")).sendKeys("848132");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'pincode-check')]")).click();
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("(//h4[@class='pincode-serviceabilityTitle'])[1]"));
		System.out.println(text.getText());
		driver.quit();
	}
}
