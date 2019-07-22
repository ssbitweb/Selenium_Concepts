package seleniumCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Q. What is Difference between findElement and findElements?
// Q. What is its return type?


// FindElement
// -- findElement return first most element if there are multiple element found with same locator
// -- findElement throws NoSuchElementException if there are no element found with given locator
// -- findElement finds only one element
// -- return type -- WebElement

// FindElements
// -- findElements return list of elements
// -- findElements return empty list if there are no element found with given locators
// -- findElements finds list of elements
// -- return type -- List <WebElement>




public class FindElement_Vs_FindElements {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// findElement
		WebElement expertiseField = driver.findElement(By.xpath("//label[@class='grunion-checkbox-multiple-label checkbox-multiple']"));
		expertiseField.click();
		
		// findElements
		List <WebElement> educationField = driver.findElements(By.xpath("//label[@class='grunion-radio-label radio']"));
		System.out.println(educationField.size()); //3
		for( WebElement radio: educationField) {
			if(!radio.isSelected())
				radio.findElement(By.xpath("//input[@value='Graduate']")).click();
		}
		
		

	}

}
