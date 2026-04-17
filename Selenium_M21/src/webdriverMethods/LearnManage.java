package webdriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnManage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		// maximize() is used to Maximize the browser Windows 
		driver.manage().window().maximize();
		
		// trigger the url in browser
		driver.get("https://www.facebook.com");
		
		// fullscreen() is used to make the WebPage to display in FullScrren
		driver.manage().window().fullscreen();
		
		// deleteAllCookies() is used to delete all the user data
		driver.manage().deleteAllCookies();
		
		//getSize() is used to get the size of browser window
		Dimension size = driver.manage().window().getSize();
		
		// getPosition() is used to get the point of the browser window 
		Point location = driver.manage().window().getPosition();

		System.out.println("Size of the Browser Window  "+size);
		System.out.println("Location of the browser   "+location);
		
		// dimension object is created 
		Dimension d1=new Dimension(500, 500);
		// setSize(Dimension) is used to change the browser size
		driver.manage().window().setSize(d1);
		
		// setPosition(Point) is used to change the browser position 
		driver.manage().window().setPosition(new Point(20,50));
		
	//	minimize() is used to minimize the browser window
		driver.manage().window().minimize();
		
		driver.quit();
		
		
	}

}
