package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Q. What is WebDriver? 
// Q. how to initialize driver?
// Q. How to maximize window?
// Q. How do you launch url? 
// Q. how to get text of WebElement
// Q. What is difference between close and quit?

// WenDriver -- WebDriver is an interface that interacts and control web browser
//             which has different language bindings and driver.. like java, python

public class B_WebDriverBasic {

	public static void main(String[] args) {
		
		// To initialize driver we need to create object/instance of any driver of WebDriver interface.
		WebDriver driver = new ChromeDriver();
		
		// to maximize window
		driver.manage().window().maximize(); 
		
		// get() Method is used to launch url
		driver.get("http://www.globalsqa.com/samplepagetest/");
		
		// implicit wait -- applied on driver instance
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// getText method - used to get Text of webElement
		WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Sample Page')]"));
		
		System.out.println(heading.getText()); // Sample Page Test
		
		
		// -- close closes current window instance.
		driver.close(); 
		// -- quit closes all the instances of window that is open.
		driver.quit();
		
	}

}
