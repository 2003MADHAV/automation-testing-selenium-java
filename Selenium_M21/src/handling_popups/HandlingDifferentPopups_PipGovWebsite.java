package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDifferentPopups_PipGovWebsite {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions notifi=new ChromeOptions();
		notifi.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(notifi);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pib.gov.in/");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement languageEle = driver.findElement(By.xpath("//select[@id='Bar1_ddlLang']"));
		Select select=new Select(languageEle);
		select.selectByVisibleText("English");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Ministry of Finance']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		for(String id:ids) {
			driver.switchTo().window(id);
		}
		System.out.println(driver.getTitle());
		
		
	}

}
