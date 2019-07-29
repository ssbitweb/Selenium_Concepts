package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



// Q . What is difference between Assert and Verify?
// Q . What are verification point? what are methods to verify end result is achieved?
// Q . What are various kind of Assert in TestNG?


// -- Both Assert and verify is used to verify whether condition is true, despite of that
//    if assert statement failed it will stop the execution and test case is marked as failed
//    But In Case of verify if condition is false it will still execute next line of code, and doesn't 
//    stop the execution.

// -- Always pass massage parameter while comparing two string. it displays if assert fails.

//    Verification Point

// 1. To get Title of webPage and verify.
// 2. To get certain Text -- using getText() and verify.
// 3. To check certain element is present or not.
// 4. Using isDisplayed method whether element is displayed or not.

//    There are two types of assert in TestNG
// 1. Soft Assert -- when condition fail still executes next line.
// 2. Hard Assert -- when condition fail it stops execution immediately.

//    various types of TestNG assert

//  --assertEquals(actual, expected) -- string
//  --assertTrue(condition) -- boolean
//  --assertFalse(condition) -- boolean
//  --assertNull(object) 
//  --assertNotNull(object)


public class J_Assert_Vs_Verify {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		// Assert
		String actualTitle = driver.getTitle();
		String expectedTitle = "Sample Page Testing Site Online - Global SQA Testing Sites";
		
		Assert.assertEquals(actualTitle, expectedTitle, "Title Doesn't Match"); // Assert Statement with massage parameter

		System.out.println("Assert Title Verified :Test Case Passed");
		
		
		// verify
		String actualT = driver.getTitle();
		String expectedT = "Sample Page Testing Site Online - Global SQA Testing Site";
		
		if(actualT.equals(expectedT)) { // verify statement
			System.out.println("Title Verified : Test Case passed");
		}else {
			System.out.println("Title Not Verified: Test Case Failed");
		}
		
		
		// 			

	}

}
