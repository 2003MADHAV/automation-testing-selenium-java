package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentHoldCursorOnEyeIconIn_sbi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'icon-cancel')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("madhav2026");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("madhav@#2026");
		Thread.sleep(3000);
		WebElement eyeBtn = driver.findElement(By.xpath("//button[@tabindex='0']"));
		Actions action=new Actions(driver);
		action.clickAndHold(eyeBtn).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
