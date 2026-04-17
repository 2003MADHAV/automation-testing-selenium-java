package handlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAssignmentPrintAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		for(WebElement suggestion:suggestions)
		{
			System.out.println(suggestion.getText());
		}

		driver.quit();
	}

}
