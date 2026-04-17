package handleingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		WebElement player = driver.findElement(By.id("player"));
		Select select=new Select(player);
		
		select.selectByIndex(0);
		select.selectByValue("B");
		select.selectByVisibleText("Rahul");
//		select.selectByContainsVisibleText("Dh");
//		
//		select.deselectByIndex(3);
//		select.deselectByValue("C");
//		select.deselectByVisibleText("Rohitsharma");
//		select.deSelectByContainsVisibleText("Virat");
		
//		select.deselectAll();
		
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println("First Selected Option  : "+firstOption.getText());
		System.out.println("----------------Selected Options -----------------------");
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for(int i=0;i<allSelectedOptions.size();i++) {
		WebElement ele=allSelectedOptions.get(i);
		String text=ele.getText();
		System.out.println(text);
		}
		//WAS to print all options in the dropDown
		System.out.println("-----------All Option of In DropDown Box------------------");
		List<WebElement> allOptions = select.getOptions();
		for(WebElement allOption:allOptions) {
			System.out.println(allOption.getText());
		}
		
		boolean res = select.isMultiple();
		System.out.println("----Check Which type of select dropDown-------- ");
		if(res) {
			System.out.println("It is a multi select dropDown");
		}
		else {
			System.out.println("It is a single select dropdown ");
		}
		driver.quit();
		

	}

}
