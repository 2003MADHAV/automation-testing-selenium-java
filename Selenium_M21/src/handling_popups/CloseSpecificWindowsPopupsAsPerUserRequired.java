package handling_popups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindowsPopupsAsPerUserRequired {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter closing Windows Title");
		String text=sc.nextLine();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Popups']")).click();
		driver.findElement(By.xpath("//*[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple Tabs']")).click();
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		Set<String> ids = driver.getWindowHandles();
		
		for(String id:ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if(!title.contains(text)) {
				driver.close();
			}
		}

	}

}
