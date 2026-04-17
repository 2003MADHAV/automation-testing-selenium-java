package assignmentScripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicatesOptions {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		WebElement player = driver.findElement(By.xpath("//select[@id='player']"));
    Select s=new Select(player);
    List<WebElement> players = s.getOptions();
     Set<String> playerSet=new HashSet<String>();
    for(WebElement player1:players) {
      String text = player1.getText();
      playerSet.add(text);
    }
    System.out.println("Unquie Player Name in Dropdown Options:");
    for(String player1:playerSet) {
      System.out.println(player1);
    }
    
     WebElement team1 = driver.findElement(By.xpath("//select[@id='team']"));
    Select s1 = new Select(team1);
     List<WebElement> teams = s1.getOptions();
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
		System.out.println("Pass");

	}

}
