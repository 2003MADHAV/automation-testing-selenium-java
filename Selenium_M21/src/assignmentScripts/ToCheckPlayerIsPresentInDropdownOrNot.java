package assignmentScripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCheckPlayerIsPresentInDropdownOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1:5500/dropdown.html");
		WebElement playerAdd = driver.findElement(By.xpath("//select[@id='player']"));
		Select select=new Select(playerAdd);
		List<WebElement> players = select.getOptions();
		List<String> playerList=new ArrayList<String>();
		for(WebElement player:players) {
			playerList.add(player.getText());
		}
		System.out.println("Enter Player Name :  ");
		String userPlayer=sc.nextLine();
		if(playerList.contains(userPlayer)) {
			System.out.println(userPlayer+" is Present In Options");
		}
		else {
			System.out.println(userPlayer+" is Not Present In Options");
		}
		
		driver.quit();
		System.out.println();
		System.out.println("Pass");
	}

}
