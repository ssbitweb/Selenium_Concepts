package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



// Q . How to Perform Right Click using Actions Class

// -- using contextClick() method

public class R_Actions_Right_Click {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// contextClick -- rightClick
		Actions act = new Actions(driver);
		WebElement rightClickButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(rightClickButton).perform();
		
		WebElement copyElement = driver.findElement(By.xpath("//span[contains(text(),'Copy')]"));
		copyElement.click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
	}

}
