package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingJavaScroptPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.className("btn-danger")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = a.getText();
		a.accept();
		System.out.println(text);
		driver.quit();
	
	}

}
