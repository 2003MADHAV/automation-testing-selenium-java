package assignmentScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectLastOptionInDropdown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		List<WebElement> teams = driver.findElements(By.xpath("//select[@id='team']/option"));
		System.out.print("Last option in Team is :");
		System.out.println(teams.get(teams.size()-1).getText());
		List<WebElement> players = driver.findElements(By.xpath("//select[@id='player']/option"));
		System.out.print("Last option in player is :");
		System.out.println(players.get(players.size()-1).getText());
		
		//----------------------------------------------------------------------------//
	/*	
		System.out.println("Team Count in Options : "+teams.size());
		for(WebElement team:teams) {
			System.out.println(team.getText());
		}
		System.out.println("Player Count in Options :"+players.size());
		for(WebElement player:players) {
			System.out.println(player.getText());
		}
	*/	
		driver.quit();
		System.out.println("Pass");
	}

}
