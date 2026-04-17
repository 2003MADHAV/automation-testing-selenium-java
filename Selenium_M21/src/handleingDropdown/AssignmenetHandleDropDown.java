package handleingDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmenetHandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement countryCode = driver.findElement(By.xpath("//label[text()='Country Code']/..//select"));
		Select s1=new Select(countryCode);
		s1.selectByValue("+91");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8936845863");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		WebElement country = driver.findElement(By.xpath("//label[text()='Country']/..//select"));
		Select s2=new Select(country);
		s2.selectByVisibleText("India");
		List<WebElement> options1=s2.getOptions();
		for(WebElement option:options1) {
			if(option.isSelected()) {
				System.out.println(option.getText());
			}
			
		}

		WebElement state = driver.findElement(By.xpath("//label[text()='State']/..//select"));
		Select s3=new Select(state);
		s3.selectByValue("Bihar");
		List<WebElement> options2 = s3.getOptions();
		for(WebElement option:options2) {
			if(option.isSelected()) {
				System.out.println(option.getText());
			}
		}	
		
		WebElement city = driver.findElement(By.xpath("//label[text()='City']/..//select"));
		Select s4=new Select(city);
		s4.selectByVisibleText("Samastipur");
		List<WebElement> options3 = s4.getOptions();
		for(WebElement option:options3) {
			if(option.isSelected()) {
				System.out.println(option.getText());
			}
		}
		WebElement quantity = driver.findElement(By.xpath("//section[text()='Quantity']/../..//select"));
		Select s5=new Select(quantity);
		s5.selectByIndex(4);
		List<WebElement> options4 = s5.getOptions();
		for(WebElement option:options4) {
			if(option.isSelected()) {
				System.out.println(option.getText());
			}
		}
		driver.findElement(By.xpath("//button[text()='Continue']")).submit();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		WebElement productList = driver.findElement(By.xpath("//h2[contains(text(),'Multi Select')]/..//select"));
		Select s6=new Select(productList);
		if(s6.isMultiple()) {
			System.out.println("This is Multi DropDown Box we can profrom ");
		}
		s6.selectByIndex(0);
		s6.selectByIndex(3);
		s6.selectByIndex(5);
		s6.selectByIndex(7);

		List<WebElement> options5 = s6.getOptions();
		for(WebElement option:options5) {
			if(option.isSelected()) {
				System.out.println(option.getText());
			}
		}
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		//-----------------------------------------------------------------------------------------
		System.out.println("Hidden Option Dropdown");
		driver.findElement(By.xpath("//a[text()='Search With Select']")).click();
		driver.findElement(By.xpath("//div[text()='+91']/../..")).click();
		Thread.sleep(5000);
		List<WebElement> options6 = driver.findElements(By.xpath("//div[@role='listbox']/div"));
		System.out.println("size:  "+options6.size());
		driver.findElement(By.xpath("//div[text()='+93']")).click();
		
		driver.findElement(By.xpath("//input[@id='selectPhone']")).sendKeys("8936845863");
		
		driver.findElement(By.xpath("//div[text()='Select Gender']/../..")).click();
		Thread.sleep(5000);
		List<WebElement> genederops = driver.findElements(By.xpath("//div[@role='listbox']/div"));
		System.out.println("Gender option size : "+genederops.size());
		driver.findElement(By.xpath("//div[text()='male']")).click();
		
		driver.findElement(By.xpath("//label[text()='Country']/../div/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='India']")).click();
		
		driver.findElement(By.xpath("//label[text()='State']/../div/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Bihar']")).click();
		
		driver.findElement(By.xpath("//label[text()='City']/../div/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Patna']")).click();
		
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		WebElement clickGen = driver.findElement(By.xpath("//input[@id='male']"));
		if(clickGen.isEnabled()) {
			clickGen.click();
		}
		else {
			System.out.println("Dissabled");
		}
		
		List<WebElement> eles = driver.findElements(By.xpath("//label[text()='Country']/../../..//select"));
		for(WebElement ele:eles) {
			if(ele.isEnabled()) {
				ele.click();
			}
			else {
				System.out.println(ele.getText()+" Is Dissabled");
			}
		}
		driver.quit();
		System.out.println("Pass");
	}

}

