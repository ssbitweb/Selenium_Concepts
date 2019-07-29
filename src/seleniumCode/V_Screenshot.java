package seleniumCode;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



// Q . Write code for taking screenshot of webpage?

// -- using getScreenshotas() method 
// -- before download (Apache commons IO jar from mvnrepository to work with Fileutils)
// -- and import org.apache.commons.io.FileUtils;


public class V_Screenshot {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.manage().deleteAllCookies();  // how to delete cookies?
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		// getScreenShotAs
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\SACHIN\\Desktop\\FileName.jpg"));
		
		
		
	}

}
