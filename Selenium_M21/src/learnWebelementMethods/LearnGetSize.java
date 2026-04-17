package learnWebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetSize {
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Navigate to the target application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		// Wait for 3 seconds to ensure the page is fully loaded
		Thread.sleep(3000);
		// Locate the Name input field using its ID
		WebElement name = driver.findElement(By.id("name"));
		// Get the size (height and width) of the element
		Dimension nameSize = name.getSize();
		
		// Get the location (X and Y coordinates) of the element
		Point nameLoc = name.getLocation();
		
		// Get complete rectangle info (size + position)
		Rectangle nameRect = name.getRect();
		
		// Print element details for better understanding
		System.out.println("=== Element Details: Name Input Field ===");
		System.out.println("Size (Height, Width): " + nameSize);
		System.out.println("Location (X, Y Coordinates): " + nameLoc);
		System.out.println("Complete Rectangle Info: " + nameRect);
		
		// Extract height and width individually
		int nameHeight = nameSize.getHeight();
		int nameWidth = nameSize.getWidth();
		
		System.out.println("\n--- Extracted Size Values ---");
		System.out.println("Height of the element: " + nameHeight);
		System.out.println("Width of the element: " + nameWidth);
		
		// Extract X and Y coordinates individually
		int nameXAxis = nameLoc.getX();
		int nameYAxis = nameLoc.getY();
		
		System.out.println("\n--- Extracted Location Values ---");
		System.out.println("X-axis position: " + nameXAxis);
		System.out.println("Y-axis position: " + nameYAxis);
		
		// Get complete rectangle details of the element
		Rectangle nameRectangle = name.getRect();

		// Extract width and height from rectangle
		int elementWidth = nameRectangle.getWidth();
		int elementHeight = nameRectangle.getHeight();

		// Extract X and Y coordinates from rectangle
		int elementXPosition = nameRectangle.getX();
		int elementYPosition = nameRectangle.getY();

		// Print values with clear understanding
		System.out.println("=== Rectangle Details of Name Field ===");
		System.out.println("Width of element: " + elementWidth);
		System.out.println("Height of element: " + elementHeight);
		System.out.println("X position of element: " + elementXPosition);
		System.out.println("Y position of element: " + elementYPosition);
		
		// Close the browser (good practice)
		driver.quit();
	}
}
