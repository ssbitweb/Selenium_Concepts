package seleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




// Q. what are different types of wait? 
// Q. write syntax ? 
// Q. explain where u use it?
//==============================================


// there are 3(2 actually) Types of wait -- when to use
// 1. Implicit wait  -- when element is not available immediately
// 2. Explicit wait -- when it takes too time to load page element
// 3. Fluent wait -- when sometime it takes few seconds and sometimes it takes minutes( varying)

// 1. Implicit wait
//====================
// --in selenium Implicit wait tells WebDriver that we want to wait for some time
//   before its throw an exception such as "NoSuchElementexception".
// --it is applicable on whole driver instance.s
// --default setting is 0.

// 2. Explicit wait
//=====================
// --This is custom one, Explicit wait tells WebDriver that we want to wait
//   until some condition is met, some ExpectedCondition is met 
//   before throwing an exception such as ElementNotVisibleException
// --This is applicable to particular element or instance.
// --Some ExpectedCondition are
//
//   elementToBeClickable()
//   elementToBeSelected()
//   visibilityOfElementLocated()
//   visibilityOfAllElementsLocatedBy()
//   textToBePresentInElement()
//   textToBePresentInElementLocated()
//   alertIsPresent()
//   invisibilityOfTheElementLocated()

// 3. Fluent wait( skeep this)
//=======================
// -- It contain Three parameter such as
// a) maximum time to wait for condition.
// b) frequency with which to check condition.
// c) ignoring specific type of exception.
// -- it will try to find out element again and again until final timer runs out.


public class Waits {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		
		
		// implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("g2599-name")));
		
		nameField.sendKeys("sachin bhagat");
		
		
		// Fluent wait		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
/*		
		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, SECONDS)
			       .pollingEvery(5, SECONDS)
			       .ignoring(NoSuchElementException.class);
		
		
*/		
		
		
		
		
		
		
		
		

	}

}
