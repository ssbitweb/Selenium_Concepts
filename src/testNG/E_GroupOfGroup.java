package testNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//Q . How to create group of group in TestNG?

// -- add groups in define tag .

/*

<suite name ="testNgGrouping">
  <test name="TestNgGroupOfGroup" preserve-order = "true">
	<groups>
	
	    <define name = "all">
	        <include name ="smokeTest"></include>
	        <include name ="functionalTest"></include>
	    </define>
	    
	    <define name = "onlySmoke">
	        <include name ="smokeTest"></include>
	    </define>	
	
	    <run>
	        <include name ="onlySmoke"></include>
	    </run>
	</groups>
		<classes>
			<class name="testNG.TestNG_GroupOfGroup" ></class>			
		</classes>
  </test>
</suite>

======================
OUTPUT:
initialize driver and launch chrome
logged in successfully
Mail sent
driver.quit

*/
public class E_GroupOfGroup {
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("initialize driver and launch chrome");
	}
	
	@Test(priority = 1, groups = {"smokeTest", "functionalTest"})
	public void loginTest() {
		System.out.println("logged in successfully");
	}
	
	@Test(priority = 2, groups = {"functionalTest"})
	public void composeMail() {
		System.out.println("Mail sent");
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("driver.quit");
	}

}
