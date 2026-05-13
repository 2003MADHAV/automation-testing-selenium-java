package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
You need to automate the following:
Open the application in a browser
Wait until the login page is fully loaded
Enter valid username and password
Click on the Login button
After login, wait for the dashboard page to load
Verify that:
The dashboard heading (like “Dashboard”) is displayed
OR a profile/user icon is visible
Print “Login Successful” if validation passes, otherwise “Login Failed”
Close the browser
*/
public class JaiSriRam {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		wait.until(ExpectedConditions.urlContains("dashboard"));
		boolean statusDashboard = driver.findElement(By
		.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
		boolean statusProfile = driver.findElement(By
		.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed();
		if(statusDashboard==true && statusDashboard==true) {
			System.out.println("Lofin Successful");
		}
		else {
			System.out.println("Login Failed");
		}
		driver.quit();
	}
}
