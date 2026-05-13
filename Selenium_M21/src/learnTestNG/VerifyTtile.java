package learnTestNG;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTtile {

	@Test
	public void verifyTitle() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://google.com/");
		String actualTitle = driver.getTitle();
		String expectedTtile="Googley";
//		Assert.assertEquals(actualTitle, expectedTtile);
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectedTtile);
//		if(actualTitle.equals(expectedTtile)) {
//			System.out.println("Pass");
//		}else {
//			System.out.println("Fail");
//		}
		driver.quit();
		s.assertAll();
	}
}
