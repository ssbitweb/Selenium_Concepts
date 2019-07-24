package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Q . write and Explain all TestNG Annotations?
// Q . Write Hierarchy of TestNg.xml tags/


/*

Hierarchy of TestNG.xml
========================

<suite name ="testNgBasic">
	<test name="TestNgBasicTitleTest" preserve-order = "true">
		<classes>
			<class name="testNG.TestNG_Basic">
				<methods>
					<include name ="homePageTileTest" />
				</methods>
			</class>
		</classes>
	</test>
</suite>

=============================================
TestNG Annotations and Explanation

1. BeforeSuite  -- Methods with this annotation will runs before all tests in a suite.
2. AfterSuite   -- Methods with this annotation will runs after all tests in a suite.
3. BeforeTest   -- Methods with this annotation will runs before each and every tests method with <test> tag in xml file.
4. AfterTest    -- Methods with this annotation will runs after each and every tests method with <test> tag in xml file.
5. BeforeClass  -- Methods with this annotation will runs before first test method in current Class.
6. AfterClass   -- Methods with this annotation will runs after last test method in current Class.
7. BeforeMethod -- Methods with this annotation will runs before each test method.
8. AfterMethod  -- Methods with this annotation will runs after each test method. 
9. Test         -- This annotation is a part of Test case.

==============================
*/

public class TestNG_Annotations {
	
	 @Test
	  public void method1() {
		  System.out.println("This is methos 1");
	  }
	  @Test
	  public void method2() {
		  System.out.println("This is methos 2");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BeforeMethod--executed before method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AfetrMethod--executed after method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("BeforeClass--executed before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("AfterClass--executed after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BeforeTest--executed before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("AfterTest--executed after test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("BeforeSuite--executed before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite--executed after suite");
	  }
	
	  
	  
	  
/*

Output:

BeforeSuite--executed before suite
BeforeTest--executed before test
BeforeClass--executed before class
BeforeMethod--executed before method
This is methos 1
AfetrMethod--executed after method
BeforeMethod--executed before method
This is methos 2
AfetrMethod--executed after method
AfterClass--executed after class
AfterTest--executed after test
PASSED: method1
PASSED: method2

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

AfterSuite--executed after suite

===============================================
Default suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================


*/
}
