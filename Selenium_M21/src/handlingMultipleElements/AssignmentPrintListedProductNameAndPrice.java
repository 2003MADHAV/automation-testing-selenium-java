package handlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPrintListedProductNameAndPrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//span[text()='✕']")).isDisplayed()){
			
			driver.findElement(By.xpath("//span[text()='✕']")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("iPhone 14 pro max",Keys.ENTER);
		List<WebElement> productLists = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		System.out.println("Number of Product : "+productLists.size());
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]/div"));
		System.out.println("Number of Product Price : "+prices.size());
		if(productLists.size()==prices.size()) {
			for(int i=0;i<productLists.size();i++) {
				 String product = productLists.get(i).getText();
				 String price = prices.get(i).getText();
				 System.out.println(product+"  ------> "+price);
			}
		}else {
			System.out.println("Count of Product and Price Result Not Matching ");
		}	
	}

}
