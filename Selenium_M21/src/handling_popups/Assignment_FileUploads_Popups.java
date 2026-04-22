package handling_popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_FileUploads_Popups {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Popups']")).click();
		driver.findElement(By.xpath("//*[text()='File Uploads']")).click();
		driver.findElement(By.xpath("//*[@id='fullName']")).sendKeys("Madhav Kumar");
		driver.findElement(By.xpath("//*[@id='emailId']")).sendKeys("madhavkr123@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Madhav000");
		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("8936845863");
		WebElement city = driver.findElement(By.xpath("//*[@id='city']"));
		Select selectCity=new Select(city);
		selectCity.selectByVisibleText("Bangalore");
		driver.findElement(By.xpath("//*[@id='resume']"))
		.sendKeys("C:\\Users\\Madhav\\Downloads\\Madhav Resume.pdf");
		WebElement skill = driver.findElement(By.xpath("//*[text()='Enter your skills']/parent::section/descendant::select"));
		Select selectSkill=new Select(skill);
		List<WebElement> SkillOptions = selectSkill.getOptions();
		for(WebElement SkillOption:SkillOptions) {
			selectSkill.selectByVisibleText(SkillOption.getText());
		}
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		driver.findElement(By.xpath("//button[text()='Create Profile']")).click();
		driver.quit();
		System.out.println("Passs");
	
	}

}
