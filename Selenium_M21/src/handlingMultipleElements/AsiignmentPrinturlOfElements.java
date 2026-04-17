package handlingMultipleElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsiignmentPrinturlOfElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int count = elements.size();
		System.out.println("Total Number Links are :" + count);
		
		for(WebElement element:elements) {
			  System.out.println(element.getAttribute("href"));
			  }
			 
/*		
		for (int i = 0; i < count; i++) {
			WebElement element = elements.get(i);
			String src = element.getAttribute("href");
			System.out.println(src);
		}
	*/	
		driver.quit();
	}

}
