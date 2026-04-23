package handling_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotificationPopup {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notifications"); //It Will disable the notifications
//		option.addArguments("--start-maximized");  //It will launch the browser in maximized mode
		option.addArguments("--incognito"); // It will launch the the browser in incognitio Settings
//		option.addArguments("--headless"); // It will launch the browser in headless mode
		// In headless execution happens internally we can not see the execution
		
		WebDriver driver =new ChromeDriver(option);
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.yatra.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
