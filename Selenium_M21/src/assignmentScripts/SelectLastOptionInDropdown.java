package assignmentScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastOptionInDropdown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");

		WebElement team = driver.findElement(By.xpath("//select[@id='team']"));
		Select select1=new Select(team);
		List<WebElement> teams = select1.getOptions();
		System.out.println(teams.get(teams.size()-1).getText());
		
		WebElement player = driver.findElement(By.xpath("//select[@id='player']"));
		Select select2=new Select(player);
		List<WebElement> players = select2.getOptions();
		System.out.println(players.get(players.size()-1).getText());

		driver.quit();
		System.out.println("Pass");
	}

}
