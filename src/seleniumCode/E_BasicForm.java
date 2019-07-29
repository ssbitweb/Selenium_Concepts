package seleniumCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E_BasicForm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.manage().deleteAllCookies();  // how to delete cookies?
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // implicit wait( applied on all element)
		
		
		// by id
		WebElement nameField = driver.findElement(By.id("g2599-name"));
		nameField.sendKeys("sachin bhagat");
		
		// by name
		WebElement emailField = driver.findElement(By.name("g2599-email"));
		emailField.sendKeys("myEmail@gmail.com");
		
		// by cssSelector
		WebElement websiteField = driver.findElement(By.cssSelector("#g2599-website"));
		websiteField.sendKeys("https://www.myWebsite.com");
		
		// by xpath
		
		// DROP-DOWN ============
		WebElement experienceField = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
		Select sel = new Select(experienceField);
		//sel.selectByVisibleText("3-5");
		//sel.selectByValue("3-5");
		sel.selectByIndex(2); // index starts from 0
		
		// CHECK BOX ==============
		List <WebElement> expertiseCheckBoxList = driver.findElements(By.xpath("//label[@class='grunion-checkbox-multiple-label checkbox-multiple']"));
		System.out.println(expertiseCheckBoxList.size());
		for( WebElement checkBox : expertiseCheckBoxList) {
			if(!checkBox.isSelected()) {
				// to select all
				//checkBox.click(); 
				
				// to select individual
				checkBox.findElement(By.xpath("//label[contains(text(),'Automation Testing')]")).click();
				checkBox.findElement(By.xpath("//label[contains(text(),'Manual Testing')]")).click();
				break;
			}
		}
		
		// RADIO-BUTTON ============
		List <WebElement> educationRadio = driver.findElements(By.xpath("//label[@class='grunion-radio-label radio']"));
		System.out.println(educationRadio.size());
		for( WebElement radio : educationRadio) {
			if( !radio.isSelected())
			radio.findElement(By.xpath("//label[@class='grunion-radio-label radio']//input[@value='Graduate']")).click();
			break;
		}
		
		// ALERT ==============
		WebElement alertBox = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		alertBox.click();
		
		Alert alr = driver.switchTo().alert();
		System.out.println(alr.getText());
		alr.dismiss();
		alr.accept();
		
		// by xpath
		WebElement commentBox = driver.findElement(By.xpath("//textarea[@class='textarea']"));
		commentBox.sendKeys("This is comment from Comment Box");
		
		WebElement submitButtom = driver.findElement(By.xpath("//input[@class='pushbutton-wide']"));
		submitButtom.click();
		
		
		// verification Point
		String actualText = driver.findElement(By.xpath("//p[contains(text(),'sachin')]")).getText();
		String expectedText = "Name: sachin bhagat";
		try {
		Assert.assertEquals(actualText, expectedText);
		}catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.toString();
		}
		
		System.out.println("Successfully tested Form");
		
		driver.quit();
		
	}

}
