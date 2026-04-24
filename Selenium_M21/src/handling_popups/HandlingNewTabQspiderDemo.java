package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewTabQspiderDemo {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	driver.findElement(By.xpath("//*[text()='Watches']/following-sibling::button")).click();
	Set<String> allWind = driver.getWindowHandles();
	Iterator<String> i = allWind.iterator();
	String pwid = i.next();
	String cwid = i.next();
//	String cwid2 = i.next();      //NoSuchElementException  //java.util.NoSuchElementException
	
	driver.switchTo().window(cwid);
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	driver.switchTo().window(pwid).close();
	System.out.println("Pass");
	
	}

}
