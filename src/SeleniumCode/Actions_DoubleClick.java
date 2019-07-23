package seleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



// Q . How to perform DoubleClick in selenium using action class?


public class Actions_DoubleClick {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		Actions act = new Actions(driver);
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleClickButton).perform();
		
		
		driver.switchTo().alert().accept();
		
		
	}

}
