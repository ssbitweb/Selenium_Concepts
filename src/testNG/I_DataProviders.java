package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


// Q . What is the use of DataProvider?

// -- DataProvider is use to test with multiple sets of data.
/*
XML=============

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name ="testNgDataProvidersTest">
	<test name="dataProviders" preserve-order = "true">
	<parameter name ="browser" value ="chrome" />
		<classes>
			<class name="testNG.TestNG_DataProviders">
				<methods>
					<include name ="registerForm" />
				</methods>
			</class>
		</classes>
	</test>
</suite>

*/
public class I_DataProviders {
	
	WebDriver driver;
	String baseUrl;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) {
		baseUrl = "http://www.globalsqa.com/samplepagetest/";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	
	@DataProvider(name="fieldInputs")
	public static Object[][] fillData(){
		return new Object[][] {{"sachin bhagat","sachinbhagat0307@gmail.com", "https://www.website1.com", "Comments one"},
				               {"ajay bhagat", "ajaybhagat@gmail.com", "https://www.website2.com", "comments2" }};
	}
	
	@Test(dataProvider="fieldInputs")
	public void registerForm(String name, String email, String website, String comments) {
		
		driver.findElement(By.id("g2599-name")).sendKeys(name);
		driver.findElement(By.id("g2599-email")).sendKeys(email);
		driver.findElement(By.id("g2599-website")).sendKeys(website);
		driver.findElement(By.xpath("//textarea[@name='g2599-comment']")).sendKeys(comments);		
		driver.findElement(By.xpath("//input[@class='pushbutton-wide']")).click();
		
	}
	
	public void tearDown() {
		
		//driver.close();
		
	}

}
