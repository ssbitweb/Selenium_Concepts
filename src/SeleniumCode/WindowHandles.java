package seleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



// Q . How do you handle multiple windows?
// Q . What is Difference between getWindowHandle() and getWindowHandles()
//---------------------

// getWindowhandle()
// -- used to handle single window i.e current window, 
// -- return Type is String

// getWindowHandles() 
// -- used to handle List or Set of Windows  ,
// -- return Type is List <String>



public class WindowHandles {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		String pwh = driver.getWindowHandle(); // get single window
		String cwh = null;
		
		
		WebElement newWindowButton = driver.findElement(By.xpath("//button[@class='btn-style class1']"));
		newWindowButton.click();
		
	    for(String wh : driver.getWindowHandles()) { // get all window
			if( wh != pwh) {
				cwh = wh;
			}
		}
		
		String childWindow = driver.switchTo().window(cwh).getTitle();
		
		System.out.println(childWindow);  //Let's Kode It

		String parentWindow = driver.switchTo().window(pwh).getTitle();
		
		System.out.println(parentWindow); //Practice | Let's Kode It
		
		driver.switchTo().window(cwh).close();
		
		
	}

}
