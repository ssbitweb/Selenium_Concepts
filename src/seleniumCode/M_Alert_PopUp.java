package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// Q. Write a code for alert popUp?
// Q. what are different methods of alert?

// switchTo() -- method is used to switch alert.
// accept()   -- to click OK
// dismiss()  -- to click cancel
// getText()  -- to get text message


public class M_Alert_PopUp {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		WebElement alertBox = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		alertBox.click();
		
		// Alert PopUp
		Alert alr = driver.switchTo().alert();
		alr.getText(); // to get alert message
		alr.accept();  // to click OK
		alr.dismiss(); // to click Cancel
		alr.sendKeys("sachinbht37@gmail.com"); // to fill alert Box if any
		
	}

}
