package handlingMultipleElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Niraj {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[text()='Instagram Lite']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Download APK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Get it on Google Play']")).click();
		Thread.sleep(3000);
		Set<String> tbas = driver.getWindowHandles();
		
		List<String> tabList=new ArrayList<String>(tbas);
		
		System.out.println(tabList.size());
		
		driver.switchTo().window(tabList.get(1));
		
		
		driver.findElement(By.xpath("//span[text()='Install']")).click();
	}

}
