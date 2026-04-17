package handlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> allSuggs = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		System.out.println("Number of Suggestions"+allSuggs.size());
		System.out.println("List of Suggestion :");
		for(WebElement sugg:allSuggs) {
		System.out.println(sugg.getText());
		}	
	}

}
