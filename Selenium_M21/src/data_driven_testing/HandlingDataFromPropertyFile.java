package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDataFromPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file=new FileInputStream("./data/commandata.properties");
		Properties pro=new Properties();
		pro.load(file);
		String url = pro.getProperty("url");
		String username = pro.getProperty("username");
		String pwd = pro.getProperty("pwd");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
