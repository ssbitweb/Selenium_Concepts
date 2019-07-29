package seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

// Exception -- Exception is an event that occur during execution of program, that disrupt the normal flow of program.

//         Object
//            |
//        throwable
//            |
//  Exception------Error
//      |
//  RuntimeException [ java.lang.runtimeException ]
//      |
//  WebDriverException [ org.openqa.selenium.webdriverException ]
//      --TimeoutException
//      --ConnectionClosedException
//      --UnreachableBrowserException
//      --StaleElementReferenceException
//      --NotFoundException
//            --NoSuchElementException
//            --NoSuchWindowException
//            --NoSuchFrameException
//            --NoSuchAttributeException
//            --NoAlertPresentException
//            --ElementNotVisibleException
//            --ElementNotSelectableException

//======================================================================

// Selenium Exception can be categorized into two parts

// 1. Checked Exception/ Compile Time Exception:
//    --Checked Exceptions are handled during the process of writing codes. These exceptions are handled before compiling the code

// 2. UnChecked Exception / Run-Time Exception:
//    --These exceptions are thrown at runtime.

//===============================================

// 1. NoSuchElementException
//    --when trying to find Element but FindBy method can not find the element.

// 2. NoSuchWindowException
//    --when trying to switch to window which is not present.

// 3. NoSuchFrameException
//    --when trying to switch invalid frame which is not present.

// 4. NoSuchAttributeException
//    --While trying to get attribute value but the attribute is not available in DOM.

// 5. NoAlertPresentException
//    --when trying to switch invalid alert, which is not present.

// 6. ElementNotVisibleException
//    --when trying to find element which is present but its Type is hidden i.e type = hidden in html DOM.

// 7. ElementNotSelectableException
//    --when trying to find element which is present but its disabled( can't be selected or clicked)

// 8. TimeoutException 
//    --when command did not completed within time. occurs in wait

// 9. WebDriverException
//    --The WebDriver is performing the action immediately after ‘closing’ the browser.

// 10. StaleElementReferenceException
//    --when element is not longer present or removed from DOM.

// 11. UnreachableBrowserException
//    --when browser is unable to be opened or have crashed because of some reasons.

// 12. NotFoundException
//    --This exception is subclass of WebDriverException. It happens when an element on the DOM does not exist.


//===============================================================================================


public class D_WebDriver_Exception {

	public static void main(String[] args) {
		
//  Q. How to handle exception?

		// 1. using try - catch block:
		
	WebDriver driver = new ChromeDriver();
	
	try {
		driver.get("https//www.somewebsite.com");  // code where exception is suppose to occur.
	}catch (WebDriverException e) { // catch block handle exception

		e.printStackTrace();
		e.getMessage();
		e.toString();
	}finally {
		System.out.println("This WebSite does not exist");  // no matter what finally block executes.
		driver.close();                                    // whether exception occur or not
	}
	
		
// try block-- is the block where we put code that suppose to occur exception.
	
// catch block -- is the block where we handle exception ..in above example we handled WebDriverException
	
// finally block -- is the block which is always get executed whether execution occur or not.
	
	
	// 2 using Throws
	
	// thread.sleep(5000) -- will throws Interrupted exception in class.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
