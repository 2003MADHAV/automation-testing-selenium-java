package learnWebelementMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Post a job')]"));
		//getTagName() is used to get the tagName of an element
		String tagName = link.getTagName();
		//getText() is used to get tagText/visible text of an element
		//if there is no text in an element it will return empty space
		String tagText = link.getText();
		// getAttribute(String attributesName) is used to fetch attributes value of an element
		// Since an element will have multiple attributes we need to mention attributes name
		String tagAttributes = link.getAttribute("href");
		//getCssValue(String propertyName) is used to fetch css property value of an element 
		//Since an element will have multiple css properties we need to mention attributes property Name 
		String fontSize = link.getCssValue("font-size");
		
		System.out.println("TageName of the Link  : "+tagName);
		System.out.println("TagText of the Link : "+tagText);
		System.out.println("TagAttributes of the Link : "+tagAttributes);
		System.out.println("Tag Font Size of the Link : "+fontSize);
		
		driver.quit();
		
		

	}

}
