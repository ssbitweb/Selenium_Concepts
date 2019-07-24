package testNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


// Q . What is TestNG?

/*
TestNG -- TestNG is open source Automation Testing Framework 
          used to test from unit test to integration testing
       -- It is advanced from JUnit Framework.
       -- because of 
       1)easy annotation
       2)Prioritization
       3)Parameterization
       4)Dependent
       5)Grouping
       6)DataProvider
       7)Parallel Test
       
TestNG Annotation
==================
      
      1)BeforeSuite
      2)AfterSuite
      3)BeforeTest
      4)AfterTest
      5)BeforeClass
      6)AfterClass
      7)BeforeMethod
      8)AfterMethod
      9)Test
      
TestNG xml Structure
======================

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


// NOTE -- No Main method in TestNG class because itself Framework.

*/
public class TestNG_Basic {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.manage().deleteAllCookies();  // how to delete cookies?
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}

	@Test(priority = 1)
	public void homePageTileTest() {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Sample Page Testing Site Online - Global SQA Testing Sites";
		Assert.assertEquals(actualTitle, expectedTitle, "Title Doesn't Match");
		System.out.println(actualTitle);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	

}
