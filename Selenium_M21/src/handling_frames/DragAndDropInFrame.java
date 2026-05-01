package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropInFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(draggable, droppable).perform();
	}

}
