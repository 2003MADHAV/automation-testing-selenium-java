package assignmentScripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsInAlphabeticalOrder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		WebElement player = driver.findElement(By.xpath("//select[@id='player']"));
		Select select=new Select(player);
		List<WebElement> players = select.getOptions();
		List<String> playerList=new ArrayList<String>();
		for(WebElement playerOpt:players) {
			String text = playerOpt.getText();
			playerList.add(text);
		}
		Collections.sort(playerList);
		System.out.println("----Players is in Alphabatic Order----------------------- ");
		for(String playerOpt:playerList) {
			System.out.println(playerOpt);
		}

		List<WebElement> teams = driver.findElements(By.xpath("//select[@id='team']/option"));
		List<String> teamList=new ArrayList<String>();
		for(WebElement team:teams) {
			teamList.add(team.getText());
		}
		Collections.sort(teamList);
		System.out.println("----Teams is in Alphabatic Order----------------------- ");
		for(String team:teamList) {
			System.out.println(team);
		}
		
		driver.quit();
		System.out.println();
		System.out.println("Pass");
	}

}
