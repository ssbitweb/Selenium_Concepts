package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

// Q . How drag and drop action is perform using selenium?


public class Actions_DragAndDrop {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("https://demoqa.com/droppable/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(from, to).perform();
		
		
		
		// verification point
		
		String textTo = to.getText();
		if(textTo.equals("Dropped!")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		// Or verification point using Assert
		
		String actualText = to.getText();
		String expectedText = "Dropped!";
		try {
		Assert.assertEquals(actualText, expectedText);
		}catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.toString();
		}
		
		
		
	}

}
