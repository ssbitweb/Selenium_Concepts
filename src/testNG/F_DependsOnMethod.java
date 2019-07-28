package testNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// Q . How to Perform Depends On method?
// -- add parameter dependsOnMethod = { "methodName" }

// Q. How to skeep test method?
// -- just Test method parameter (enabled = false)



public class F_DependsOnMethod {	
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("initialize driver and launch chrome");
	}
	
	@Test
	public void loginTest() {
		System.out.println("logged in successfully");
	}
	
	@Test(dependsOnMethods = {"loginTest"})
	public void composeMail() {
		System.out.println("Mail sent");
	}
	
	@Test(enabled = false) // skeeped
	public void verify() {
		System.out.println("verified");
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("driver.quit");
	}

}


/*
OUTPUT:

initialize driver and launch chrome
logged in successfully
Mail sent
driver.quit
PASSED: loginTest
PASSED: composeMail
*/
