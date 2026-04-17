package assignmentScripts;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllOptionsWithoutDuplicates {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		
		List<WebElement> players = driver.findElements(By.xpath("//select[@id='player']/option"));
		Set<String> playerSet=new HashSet<String>();
		for(WebElement player:players) {
			String text = player.getText();
			playerSet.add(text);
		}
		System.out.println("Unique Player Name in Dropdown Options:");
		for(String player:playerSet) {
			System.out.println(player);
		}
		
		List<WebElement> teams=driver.findElements(By.xpath("//select[@id='team']/option"));
		Set<String> teamSet=new HashSet<String>();
		for(WebElement team:teams) {
			String text = team.getText();
			teamSet.add(text);
		}
		System.out.println("Unique Team Name in DropDown Options :");
		for(String team:teamSet) {
			System.out.println(team);
		}
		
		driver.quit();
		System.out.println();
		System.out.println("Pass");

	}

}
