package learnWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClickClear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");Thread.sleep(2000);
		
		// Click on "UI Testing Concepts" option using XPath and click() method
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000); // Wait for 2 seconds to allow page to load

		// Locate the Name input field using XPath
		WebElement nameField = driver.findElement(By.xpath("//input[@id='name']"));

		// Enter text into the input field using sendKeys() method
		nameField.sendKeys("Admin1234");
		Thread.sleep(2000); // Pause to observe entered value

		// Clear the text from input field using clear() method
		nameField.clear();
		Thread.sleep(2000); // Pause to observe field cleared

		// Re-locate the element (good practice if DOM refreshes)
		nameField = driver.findElement(By.xpath("//input[@id='name']"));

		// Enter new value into the input field
		nameField.sendKeys("Admin123");
		Thread.sleep(2000); // Pause to observe new value

		// Close the browser using quit() method
		driver.quit();

	}

}
