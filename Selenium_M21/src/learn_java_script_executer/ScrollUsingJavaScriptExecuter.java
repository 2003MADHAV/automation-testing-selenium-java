package learn_java_script_executer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollUsingJavaScriptExecuter {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications"); 
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
		Point location = driver.findElement(By.xpath("//strong[text()='HISTORY OF MYNTRA']")).getLocation();
		System.out.println(location);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo"+location);

	}

}
