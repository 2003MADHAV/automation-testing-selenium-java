package webdriverMethods;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		
// It is used to launch a browser , address of the browser wil we stored in 
// driver variable    
		WebDriver driver=new ChromeDriver();
		
// get(String url) is used to trigger the main url of an application 
// URL Should contains protocol ,application name, domain name
		driver.get("https://facebook.com");
		

//getTilte() is used to fetch the current title of the webpage	
		String title = driver.getTitle();
		System.out.println(title);
		
//getCurrentUrl() is used to fetch the current URL of the WebPage		
		String url = driver.getCurrentUrl();
		System.out.println(url);

// close() is used to close the current window
		driver.close();
		
	}

}
