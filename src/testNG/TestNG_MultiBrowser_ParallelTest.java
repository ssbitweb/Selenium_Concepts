package testNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Q . How multiple browser selection is handled?
// Q . How to perform parallel tests in TestNg?

// -- we need to pass browser as parameter and set annotation Parameters("browser)
// -- for parallel test execution we just need to set parallel attribute to "tests" in suite tag.(imp)
/*
xml
=====

<suite name ="testNgBrowserTest" parallel="tests">

	<test name="ChromeTest" preserve-order = "true">
	<parameter name ="browser" value ="chrome" />
		<classes>
			<class name="testNG.TestNG_MultiBrowser_Selection"></class>
		</classes>
	</test>
	
	<test name="FirefoxTest" preserve-order = "true">
	<parameter name ="browser" value ="firefox" />
		<classes>
			<class name="testNG.TestNG_MultiBrowser_Selection"></class>
		</classes>
	</test>	
	
</suite>

*/



public class TestNG_MultiBrowser_ParallelTest {
	
	WebDriver driver;
	String baseUrl;
	
	@Parameters("browser")
	@Test
	public void setUp(String browser) {
		
		baseUrl = "https://tstats.000webhostapp.com/TrainBetweenForm.php";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
	}

}