package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXPath {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("iphone 17pro MAx",Keys.ENTER);
		
		WebElement priceElem = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 17 Pro Max (Silver, 256 GB)')]/../..//div[@class='hZ3P6w DeU9vF']"));
		
		String price = priceElem.getText();
		System.out.println(price);
		
		//   //div[contains(text(),'Apple iPhone 17 Pro Max (Silver, 256 GB)')]/../..//div[4]//div[2]
	}

}
