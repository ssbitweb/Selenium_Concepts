package seleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


// Q. Write a code for dropdown?
// Q. What are different methods of select?

//  Methods od select
// --selectByVisibleText();
// --selctByvalue();
// --selectByIndex();

public class Select_DropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		// select dropdown
		WebElement experienceField = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
		Select sel = new Select(experienceField);
		sel.selectByVisibleText("3-5");
//		sel.selectByValue("3-5");
//		sel.selectByIndex(2); // index starts from 0
		
		
		
		
		
		
		
	}

}
