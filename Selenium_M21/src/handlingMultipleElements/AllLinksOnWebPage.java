package handlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOnWebPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> allEle = driver.findElements(By.tagName("a"));
		int count = allEle.size();
		System.out.println("Number of Links are : "+count);
		for(int i=0;i<count;i++) {
			WebElement ele = allEle.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		driver.quit();

	}

}
