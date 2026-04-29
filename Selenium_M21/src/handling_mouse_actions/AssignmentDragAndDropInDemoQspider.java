package handling_mouse_actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDragAndDropInDemoQspider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//*[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//*[text()='Drag Position']")).click();
		Thread.sleep(2000);
/*		
		WebElement mobileCharger = driver.findElement(By.xpath("//*[text()='Mobile Charger']"));
		WebElement mobileCover = driver.findElement(By.xpath("//*[text()='Mobile Cover']"));
		WebElement laptioCharger = driver.findElement(By.xpath("//*[text()='Laptop Charger']"));
		WebElement laptopCover = driver.findElement(By.xpath("//*[text()='Laptop Cover']"));	
*/
		WebElement mobileDroplaeArea = driver.findElement(By.xpath("//*[text()='Mobile Accessories']"));
		WebElement laptopDropableArea = driver.findElement(By.xpath("//*[text()='Laptop Accessories']"));
		Actions action=new Actions(driver);
/*	
		//Approach ---> 1
		action.dragAndDrop(mobileCharger, mobileDroplaeArea).perform();
		Thread.sleep(2000);
		action.dragAndDrop(mobileCover, mobileDroplaeArea).perform();
		Thread.sleep(2000);
		action.dragAndDrop(laptioCharger, laptopDropableArea).perform();
		Thread.sleep(2000);
		action.dragAndDrop(laptopCover, laptopDropableArea).perform();
*/	
		//Approach ---> 1
		List<WebElement> dropableEleList = driver.findElements(By.xpath("//*[text()='Mobile Charger']/parent::div/child::div"));
		for(int i=0;i<dropableEleList.size();i++) {
			 String itemText = dropableEleList.get(i).getText();
			if(itemText.contains("Mobile")) {
				action.dragAndDrop(dropableEleList.get(i), mobileDroplaeArea).perform();
			}
			else {
				action.dragAndDrop(dropableEleList.get(i), laptopDropableArea).perform();
			}	
		}	

	}
}	