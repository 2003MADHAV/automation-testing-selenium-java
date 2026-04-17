package handleingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSingleDropdownHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://x.com/");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Select month = new Select(driver.findElement(By.xpath("//span[text()='Month']/../../select")));
		month.selectByValue("3");
		Select day=new Select(driver.findElement(By.xpath("//span[text()='Day']/../../select")));
		day.selectByValue("3");
		Select year=new Select(driver.findElement(By.xpath("//span[text()='Year']/../../select")));
		year.selectByValue("2003");
		
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Madhav Kumar");
		driver.findElement(By.name("email")).sendKeys("mkchy3039@gmail.com");

		List<WebElement> months = month.getOptions();
		List<WebElement> days = day.getOptions();
		List<WebElement> years = year.getOptions();
	}

}
