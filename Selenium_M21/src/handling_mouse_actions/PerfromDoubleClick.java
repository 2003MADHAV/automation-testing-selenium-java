package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerfromDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 WebElement doubleClickEle = driver.findElement(By.xpath("//*[contains(text(),'Double')]"));
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.doubleClick(doubleClickEle).perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.quit();
		System.out.println("Pass");

	}

}
