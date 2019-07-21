package seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Q. What is WebDriver? 
// Q. How do you launch url? 
// Q. how to initialize driver?

// WenDriver -- webdriver is an interface that interacts and control web browser
//             which has different language bindings and driver.. like java, python

public class WebDriverBasic {

	public static void main(String[] args) {
		
		// To initialize driver we need to create object/instance of any driver of WebDriver interface.
		WebDriver driver = new ChromeDriver();
		
		// get() Method is used to launch url
		driver.get("https://www.google.com");
		
		// To close
		driver.close();
		
	}

}
