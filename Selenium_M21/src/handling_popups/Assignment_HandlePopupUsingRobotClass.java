package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_HandlePopupUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_P);Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		//robot.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_1);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_MINUS);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_2);Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
		 
		driver.quit();
		System.out.println("Passs");
		
	}

}
