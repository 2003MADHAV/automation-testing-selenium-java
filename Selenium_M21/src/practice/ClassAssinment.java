package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassAssinment {

	public static void main(String[] args) throws InterruptedException  {
		
		executeTestCase(new ChromeDriver());
		executeTestCase(new EdgeDriver());
		executeTestCase(new FirefoxDriver());
	}
	public static void executeTestCase(WebDriver driver) throws InterruptedException {
		
		driver.manage().window().maximize(); Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/"); Thread.sleep(2000);
		driver.navigate().to("https://www.zomato.com/"); Thread.sleep(2000);
		driver.navigate().back(); Thread.sleep(2000);
		driver.navigate().forward(); Thread.sleep(2000);
		driver.navigate().refresh(); Thread.sleep(2000);
		
		
		String url = driver.getCurrentUrl(); Thread.sleep(2000);
		String title = driver.getTitle(); Thread.sleep(2000);
		
		String expTtile="zomato";
		String expurl="https://www.zomato.com/";
		
		if(title.equalsIgnoreCase(expTtile)) {
			System.out.println("Pass");
			
			if(expurl.equalsIgnoreCase(url)) {
				System.out.println("Pass");
			}
			else
				System.out.println("fail");
		}
		else
			System.out.println("fail");
		
		System.out.println(driver.getPageSource().length()); Thread.sleep(2000);
		driver.manage().deleteAllCookies(); Thread.sleep(2000);
		driver.manage().window().fullscreen(); Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(555,123)); 
		driver.manage().window().setPosition(new Point(50,50)); Thread.sleep(2000);
		driver.manage().window().minimize();  Thread.sleep(2000);
		driver.quit();
	}

}
