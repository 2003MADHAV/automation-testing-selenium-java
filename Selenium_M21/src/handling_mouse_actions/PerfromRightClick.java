package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerfromRightClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Button']")).click();
		driver.findElement(By.xpath("//*[text()='Right Click']")).click();
		WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click']"));
		Actions action=new Actions(driver);
		action.contextClick(rightClick).perform();
		driver.findElement(By.xpath("//*[text()='Yes']")).click();
		WebElement text = driver.findElement(By
		.xpath("//button[text()='Right Click']/following-sibling::span"));

		System.out.println(text.getText());
		driver.quit();
	}

}
