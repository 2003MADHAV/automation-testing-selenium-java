package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandelingDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement intractions = driver.findElement(By.linkText("Interactions"));
		Actions a=new Actions(driver);	
		a.moveToElement(intractions).perform();
		WebElement dragDrop = driver.findElement(By.linkText("Drag and Drop"));
		a.moveToElement(dragDrop).perform();
		WebElement staticLink = driver.findElement(By.linkText("Static"));
		a.click(staticLink).perform();
		WebElement angular = driver.findElement(By.id("angular"));
		WebElement droparea = driver.findElement(By.id("droparea"));
		WebElement node = driver.findElement(By.id("node"));
		a.dragAndDrop(angular, droparea).perform();
		a.clickAndHold(node).moveToElement(droparea).release().build().perform();
	}

}
