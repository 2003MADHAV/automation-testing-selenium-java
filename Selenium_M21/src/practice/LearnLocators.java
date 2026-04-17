package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demowebshop.tricentis.com");
		//driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Madhav");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("madhav23@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("mkchy@#2025");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("mkchy@#2025");
		driver.findElement(By.name("register-button")).click();
		
	//	driver.navigate().to("https://www.w3schools.com/");
		//driver.findElement(By.className("button-text")).click();
		//driver.findElement(By.id("myLearningFromDefault")).click();
		//driver.findElement(By.id("tnb-google-search-input")).sendKeys("HTML");
		//driver.findElement(By.id("tnb-google-search-input")).sendKeys("HTML", Keys.ENTER);
	/*	
		WebElement searchBox = driver.findElement(By.id("tnb-google-search-input"));
		Thread.sleep(2000);
		searchBox.sendKeys("HTML");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
		*/
	/*	
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("I already have an account")).click();
	*/
	}

}
