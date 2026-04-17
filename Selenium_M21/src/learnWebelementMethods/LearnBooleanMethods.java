package learnWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement wishlist = driver.findElement(By.xpath("//div[text()='Wishlist']"));
		// isDisplayed() is used to check to Whether element is displayed or not , if ele is displayed 
		// it will return true else it will return false
		boolean result = wishlist.isDisplayed();
		if(result==true) {
			System.out.println("Element is Displayed ");
		}else {
			System.out.println("Element is Not Displayed");
		}
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("name"));
		//isEnabled() is used to check whether element is enabled or disabled ,
		// When we able to to perform action it will return true else it will return false
		boolean result2 = name.isEnabled();
		if(result2) {
			System.out.println("Element is Enabled");
		}else {
			System.out.println("Element id Dissabled ");
		}
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(2000);
		WebElement emailCheckBox = driver.findElement(By.xpath("//span[text()='Email']/../input"));
		emailCheckBox.click();
		Thread.sleep(2000);
		boolean result3 = emailCheckBox.isSelected();
		if(!result3) {
			System.out.println("Check Box is not Selected ");
		}
		else {
			System.out.println("Check Box is Selected ");
		}
		driver.quit();

	}

}
