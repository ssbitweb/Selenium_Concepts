package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


// Q . How to pass parameter to TestNG?

/*
<suite name ="testNgParameterTest">

    <test name="parameterTest" preserve-order = "true">
	<parameter name ="browser" value ="chrome" />
	<parameter name ="name" value ="Sachin Bhagat" />
	<parameter name ="email" value ="sachinbht37@gmail.com" />
	<parameter name ="website" value ="https://www.mywebsite.com" />
	<parameter name ="comments" value ="Hi sachin..! This is my Comments" />
		<classes>
			<class name="testNG.TestNG_Parameter"></class>
		</classes>
    </test>
		
</suite>

*/
public class TestNG_Parameter {
	
	WebDriver driver;
	String baseUrl;
	
	@Parameters("browser")
	@BeforeClass
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
	
	@Parameters({"name", "email", "website", "comments"})
	@Test
	public void trainSearch(String name, String email, String website, String comments) {
		
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
