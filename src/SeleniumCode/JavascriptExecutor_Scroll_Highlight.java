package seleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// Q . How to scroll to element using JavascriptExecutor?
// Q . type text without using sendKeys ?


public class JavascriptExecutor_Scroll_Highlight {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.manage().deleteAllCookies();  // how to delete cookies?
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		
		//Create object of a JavascriptExecutor interface
		//use executeScript() method and pass the arguments 
		//Here i pass values based on css style. Yellow background color with solid red color border.
		
		WebElement aboutUs = driver.findElement(By.xpath("//p[contains(text(),'GlobalSQA')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1500)"); // scroll vertical down (default value is 0,0 top right)
		js.executeScript("arguments[0].scrollIntoView(true);", aboutUs); // full scroll 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", aboutUs);
		
		
		
		
		// get title of webpage
		String Title =  js.executeScript("return document.title;").toString();
		System.out.println(Title);
		
		// get url of webpage
		String url =  js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		//type text without using sendkeys
		js.executeScript("document.getElementById('g2599-name').value='sachin bhagat';");
		
		
		WebElement alertBox = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		
		// to click
		js.executeScript("arguments[0].click();", alertBox);
		
		
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		
		
	}

}
