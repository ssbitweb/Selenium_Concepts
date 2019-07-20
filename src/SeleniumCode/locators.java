package SeleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Q. what are different types of locators there in selenium?

// 1. id
// 2. name
// 3. className
// 4. linkText
// 5. partialLinkText
// 6. xpath
// 7. cssSelector
// 8. tagName

// use any one which is unique , having only 1 matching element.

public class locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // implicit wait( applied on all element)
		
		
		// by id
		driver.findElement(By.id("g2599-name")).sendKeys("sachin bhagat");
		
		// by name
		driver.findElement(By.name("g2599-email")).sendKeys("myEmail@gmail.com");
		
		// by cssSelector
		driver.findElement(By.cssSelector("#g2599-website")).sendKeys("https://www.myWebsite.com");
		
		// by xpath
		
		// DROP-DOWN ============
		WebElement experienceField = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
		Select sel = new Select(experienceField);
		//sel.selectByVisibleText("3-5");
		//sel.selectByValue("3-5");
		sel.selectByIndex(2); // index starts from 0
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
