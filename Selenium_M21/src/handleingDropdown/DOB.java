package handleingDropdown;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://x.com/?lang=en");
        driver.findElement(By.xpath("//span[text()='Create account']")).click();

        Thread.sleep(3000);
        WebElement month = driver.findElement(By.xpath("//span[text()='Month']/../../select"));
        Select s=new Select(month);
        Thread.sleep(2000);
        s.selectByIndex(6);
        Thread.sleep(2000);
        s.selectByValue("8");
        Thread.sleep(2000);
        s.selectByVisibleText("December");
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Pass");
       

      

    }
}
