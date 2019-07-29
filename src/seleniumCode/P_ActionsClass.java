package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// Q . What are different methods in Actions class?
// Q . What are different keyboard event method?
// Q . what are different mouse event?
// Q . send your name in All CAPITAL later?


/*
   Actions Class
   ================ 
   
   Actions act = new Actions(driver);
   
   various methods of actions class can be categorized into
   
   1. Keyboard Event
   2. Mouse Event
   
   1. Keyboard Event methods are
   
   --KeyUp()   -- to press key
   --sendKeys()  -- to send chars
   --KeyDown()  -- to release key
   
   2. MouseMovement Event methods are
   
   --click() -- to click
   --doubleClick() -- to perform double click
   --contextClick() -- to perform right click
   --moveToElement(element) --to move mouse to element
   --clickAndHold()  --click (without releasing)
   --dragAndDrop(source, target)  --
   --dragAndDropBy(source, xOffset, yOffset)
   --moveByOffset(x-offset, y-offset)
   --release()  -- to release mouse left button.
 



*/

public class P_ActionsClass {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		// Actions class
		Actions act = new Actions(driver);
		
		// sending name in capital in name field
		WebElement nameField = driver.findElement(By.id("g2599-name"));
		
		// to press shift key
		act.keyDown(nameField, Keys.SHIFT).sendKeys("sachin bhagat").keyUp(Keys.SHIFT).build().perform();
		
		
		
		// sending email in capital in email field
		WebElement emailField = driver.findElement(By.id("g2599-email"));
		act.keyDown(emailField, Keys.SHIFT).sendKeys("sachinbhagat@gmail.com").keyUp(Keys.SHIFT).build().perform();
		
		
		
		
		
		
		
	}

}
