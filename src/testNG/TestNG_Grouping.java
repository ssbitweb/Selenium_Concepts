package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// Q . what is the use of grouping in TestNG
// Q . How to use Groups in TestNg?

// -- Groups allows to group the test cases
// -- sophisticated grouping of test.methods
//    Lets say we have diff classes of different groups i.e smoke test group, functional test group
//    if we want to execute only smoke test the we can include only smoke test group in group tag of xml.
//============================

/*
<suite name ="testNgGroups">
	<test name="TestNgGrouping" preserve-order = "true">
	<groups>
	    <run>
	        <include name ="smokeTest"></include>
	    </run>
	</groups>
		<classes>
			<class name="testNG.TestNG_Grouping" ></class>			
		</classes>
	</test>
</suite>

===========
OUTPUT:
initialize driver and launch chrome
logged in successfully
driver.quit

*/



public class TestNG_Grouping {
	
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



