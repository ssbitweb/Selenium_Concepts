package seleniumCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



// Q. How do you find element is displayed on screen?

// --using
// 1. isDisplayed()
// 2. isSelected()
// 3. isEnabled()

// return type of all --> boolean

public class VisibilityOfElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	
		List< WebElement> educationField = driver.findElements(By.xpath("//label[@class='grunion-radio-label radio']"));
		for( WebElement radio : educationField) {
			
			System.out.println(radio.isDisplayed()); // true
			System.out.println(radio.isSelected());  // false
			System.out.println(radio.isEnabled());   // true
			
			
			
		}
		
		
		
		
		

	}

}
