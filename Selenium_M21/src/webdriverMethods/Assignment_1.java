package webdriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		
		// assignment
		// write a script to open browser trigger Instagram application and verify the page title and url
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		
		String title = driver.getTitle();
	
		String url = driver.getCurrentUrl();
		
		String excpectedTitle="Instagram";
		String expectedUrl="https://www.instagram.com/";
		
		
		if(excpectedTitle.equalsIgnoreCase(title) && expectedUrl.equalsIgnoreCase(url)) {
			
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Fail");
		}
		
		driver.close();
		
		
	}
}
