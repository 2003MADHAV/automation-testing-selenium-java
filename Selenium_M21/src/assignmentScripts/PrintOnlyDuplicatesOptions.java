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

public class PrintOnlyDuplicatesOptions {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		List<WebElement> players = driver.findElements(By.xpath("//select[@id='player']/option"));
		List<String> playerLiist=new ArrayList<String>();
		for(WebElement player:players) {
			String text = player.getText();
			playerLiist.add(text);
		}
		Set<String> playerSet=new HashSet<String>();
		Set<String> duplicatPlayer=new HashSet<String>();
		for(String player:playerLiist) {
			if(!playerSet.add(player)) {
				duplicatPlayer.add(player);
			}
		}
		System.out.println("Duplicateas Player are :   ");
		for(String player:duplicatPlayer) {
			System.out.println(player);
		}
		driver.quit();
		System.out.println("Pass");

	}

}
