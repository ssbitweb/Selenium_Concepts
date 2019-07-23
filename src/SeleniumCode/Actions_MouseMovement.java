package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_MouseMovement {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// Actions class
		Actions act = new Actions(driver);
		driver.switchTo().frame("globalSqa"); // by name
		
		WebElement trainingFilters = driver.findElement(By.xpath("//span[@id='current_filter']"));
		act.moveToElement(trainingFilters).perform();
		
		WebElement courseList = driver.findElement(By.xpath("//div[contains(text(),'Software Testing')]"));
		act.moveToElement(courseList).click().perform();
		
		
		

	}

}
