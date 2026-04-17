package assignmentScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectAllOptionsDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		WebElement player = driver.findElement(By.xpath("//select[@id='player']"));
		Select select=new Select(player);
		List<WebElement> players = select.getOptions();
		for(int i=0;i<players.size();i++) {
			select.selectByIndex(i);
		}
		Thread.sleep(5000);
		for(int i=players.size()-1;i>=0;i--) {
			select.deselectByIndex(i);
		}
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Pass");
		
	}

}
