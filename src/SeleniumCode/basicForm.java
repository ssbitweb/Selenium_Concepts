package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class basicForm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		String actualTitle = "Google";
		Assert.assertEquals(title, actualTitle);
		System.out.println("success-Title Verified");
		driver.close();

	}

}
