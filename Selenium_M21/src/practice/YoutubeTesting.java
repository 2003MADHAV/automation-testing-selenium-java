package practice;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class YoutubeTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
	
		driver.findElement(By.cssSelector("input[class='ytSearchboxComponentInput yt-searchbox-input title']")).sendKeys("ram Bhjan");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='ytSearchboxComponentSearchButton']")).click();
		Thread.sleep(2000);
		
		List<WebElement> thumbnails = driver.findElements(By.xpath("//*[@id='thumbnail']"));
		
		Random rand = new Random();
		int randomIndex = rand.nextInt(thumbnails.size());
		thumbnails.get(randomIndex).click();
	
		
	}

}
