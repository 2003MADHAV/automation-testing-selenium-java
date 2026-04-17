package learnWebelementMethods;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCopyPaste {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/login");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("admin@email.com" +Keys.CONTROL+"AC");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.CONTROL+"V" , Keys.ENTER);
	Set<String> ids = driver.getWindowHandles();
	List<String> idsList=new ArrayList<String>(ids);
	System.out.println("Current Opened Number Window : "+idsList.size());
	driver.switchTo().window(idsList.get(1));
	Thread.sleep(3000);
	WebElement alert = driver.findElement(By.xpath("//div[@class='js-flash-alert']"));
	System.out.println("Error messge:  "+alert.getText());
	String backClour = alert.getCssValue("background-color");
	System.out.println("Back Ground Clour : "+backClour);
	

	}

}
