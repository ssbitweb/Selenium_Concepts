package seleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// Q. How to get Attribute value of an element?

//  -- using getAttribute method.



public class H_AttributeValue {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement nameField = driver.findElement(By.name("g2599-name"));
		WebElement emailField = driver.findElement(By.id("g2599-email"));
		
		// getting Attribute Value of element
		System.out.println(nameField.getAttribute("name")); //g2599-name
		System.out.println(emailField.getAttribute("id")); //g2599-email
		
		
		
	}

}
