package seleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Q. What is xpath?
// Q. Difference between absolute and relative xpath?
// Q. xpath for starts_with, ends_with, contains
// Q. how to fetch element when its attribute value changing frequently. 
// Q. Write xpath for parent-proceding sibling- following sibling- ancestor

/*
  
   Xpath-- xpath is xml path.
   -- It is way of locating element in XML DOM or XML Tree.

   "/"  -- single slash --> single represent absolute xpath.
        -- In this case it searches locators matching element right from first node of xml DOM.
       
   "//" -- double slash --> double slash represent relative xpath.
        -- In this case it searches locators matching element anywhere in DOM.
        
   e.g Absolute xpath
   ====================
    
    /html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]
     
   e.g Relative xpath
   =====================
   
    //input[@name='g2599-name']
    //input[@id='g2599-name'] 
   
   starts-with:
   ======================
    
    //input[starts-with(@id, 'g2599-na')]
   
   ends-with:( does not support bcoz ends-with is a function of xpath 2.0 but browser only support 1.0) instead use "contains"
   =======================
   
    //input[ends-with(@id, '-name')] --> does not work
   
   contains:
   =========================
   
   //input[contains(@id,'-name')]
   //input[contains(@value,'Automation Testing')]
   //label[contains(text(),'Automation Testing')]
   
   =========================
   when attribute value changing frequently
   
   //input[@id='name-g2599'] 
   //input[@id='name-g2600'] 
   //input[@id='name-g2601']
   //input[@id='name-g2602']
   
   //input[@id='g2599-name'] 
   //input[@id='g2600-name'] 
   //input[@id='g2601-name']
   //input[@id='g2602-name'] 
   
   --use starts-with or contains
   --or use absolute xpath
   
   //input[starts-with(@id, '-name')]
   //input[contains(@id,'-name')]
  
   xpath -->  parent::preceding-sibling::following-sibling::ancestor
   =============================================================
  
   <ul class="something">
     <li>
     <li>
        <a class="nav" href="/sign-in">
     <li>   
   <ul>
   
   -----------------------------
   //a[@href='/sign-in']
   //parent::li
   //preceding-sibling::li
   //following-sibling::li[1]
   //ancestor::ul
   
*/

public class Xpath {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize window
		driver.get("http://www.globalsqa.com/samplepagetest/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// absolute xpath
		WebElement nameField = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/input[1]"));
		nameField.sendKeys("Sachin Bhagat");
		
		// relative xpath
		WebElement emailField = driver.findElement(By.xpath("//input[@name='g2599-email']"));
		emailField.sendKeys("sachinbht37@gmail.com");
		
		// starts-with
		WebElement websiteField = driver.findElement(By.xpath("//input[starts-with(@id,'g2599-web')]"));
		websiteField.sendKeys("https://www.myWebsite.com");
		
		// contains
		WebElement experienceField = driver.findElement(By.xpath("//select[contains(@id,'-experienceinyears')]"));
		Select sel = new Select(experienceField);
		sel.selectByVisibleText("3-5");
		
		//xpath parent::preceding-sibling::following-sibling::ancestor
		WebElement expertiseField = driver.findElement(By.xpath("//input[@value='Automation Testing']//parent::label//preceding-sibling::label[1]//following-sibling::label[1]//ancestor::div[1]"));
		expertiseField.click();
		
	}

}
