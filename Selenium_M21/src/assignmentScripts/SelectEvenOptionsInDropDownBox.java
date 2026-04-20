package assignmentScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEvenOptionsInDropDownBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		WebElement player = driver.findElement(By.xpath("//select[@id='player']"));
		Select select=new Select(player);
		List<WebElement> players = select.getOptions();
		for(int i=0;i<players.size();i++) {
			if(i%2==0) {
				select.selectByIndex(i);
			}
		}
		
		System.out.println("Even-indexed players selected:");
		for(WebElement selected : select.getAllSelectedOptions()) {
		    System.out.println(selected.getText());
		}
	// Team DropDown --------------------------------------------
	/*
		WebElement team = driver.findElement(By.xpath("//select[@id='team']"));
		Select s=new Select(team);
		List<WebElement> teams = s.getOptions();
		for(int i=0;i<teams.size();i++) {
			if(i%2==0) {
				s.selectByIndex(i);
			}
		}
		System.out.println("Even-indexed Team selected:");
		for(WebElement selected : s.getAllSelectedOptions()) {
		    System.out.println(selected.getText());
		}
		*/
		driver.quit();
		System.out.println("Pass");
	}

}
