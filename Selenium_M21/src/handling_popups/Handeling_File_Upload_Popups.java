package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handeling_File_Upload_Popups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/FileUpload.htm");
		Thread.sleep(2000);
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Madhav\\Downloads\\M adhav Certificate.pdf");
		System.out.println("pass");
	}

}
