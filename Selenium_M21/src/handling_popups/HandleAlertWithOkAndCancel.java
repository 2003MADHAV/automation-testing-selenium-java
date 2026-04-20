package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertWithOkAndCancel {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.className("btn-primary")).click();
		driver.switchTo().alert().dismiss();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		driver.quit();
	}

}
