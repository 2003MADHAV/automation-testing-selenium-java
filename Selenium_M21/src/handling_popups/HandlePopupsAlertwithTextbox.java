package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopupsAlertwithTextbox {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.className("btn-info")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("RamJiavan Choudary");
		a.accept();
		String text = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(text);
		driver.quit();
		

	}

}
