package learnTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import data_driven_testing.FileLib;

public class Wishlist {

	WebDriver driver;
	@Test(priority = 1)
	public void setup() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileLib f=new FileLib();
		String url = f.readDataFromPropertyFile("url", "./data/commandata.properties");
		driver.get(url);
	}
	
	@Test(priority = 2,dependsOnMethods = "setup")
	public void testWishlist() {
		driver.findElement(By.xpath("//span[normalize-space()='Wishlist']")).click();
		
	}
	@Test(priority = 3)
	public void closeBrow() {
		driver.quit();
	}
}
