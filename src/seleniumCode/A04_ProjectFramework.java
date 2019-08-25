package seleniumCode;

// Q . Which Framework you are using? Explain your project Framework?

// 1- Language
// 2- Type of framework - POM & Data Driven
// 3- TestNG
// 4- packages
//    src/main/java
//     --config
//     --testBase
//     --Pages    
//     --utils
//     --testData
//    src/test/java
//     --loginPageTest
// 5- Maven -- Build Tool
// 6- Git -- VC Tool
// 7- Jenkins - CI Tool
// 8- extent reports -- for reporting purpose

//==============================================

// 1-Language 
//  -- We are using java as our language binding because most of the automation developers using knows java.  

// 2-Type of Framework -POM & data Driven
//  -- We are using Page Object Model design pattern with Page factory and data driven framework
//    ( Q. What is Page Objects and Page Factory?)
//    ( Q. What is advantages of Page Object Model?)
//    ( Q. How u initialize elements in POM)
//  Page Objects -- as POM suggest each web page has separate java class that holds the functionality and member objects of that page.
//      -- and each page has separate class for Tests. 
//  Page factory -- Page factory is the way to initialize the web element. 
//  (NOTE: Page factory is static class in selenium used to initialize element in POM)
//  (How? --> e.g  PageFactory.initElements(driver, this);

//  Advantages
//  1) Code re-usability -- write once use many time
//  2) Code Maintainability --clean separation between page code and test code
//  3) Object Repository -- each page has java class that has corresponding member objects.
//  4) readability -- page code and test code separate and readable. 


// 3- TestNG
// we are using TestNG test framework for
// --prioritizing
// --grouping
// --parameterizing
// --parallel test execution
// --dataProvide --is used to test with multiple sets of data.


// 4- Packages
//  We created maven project which have separate packages for pages and tests

//  1- Pages Layer 
//   --all web pages relates class comes under pages package in src/main/java, 

//  2- Test layer
//   --all tests related class comes under tests package in src/test/java.

//  we also created config, testBase, Util, and testData package in src/main/java

//  1.1- config
//    config package holds config.properties file which contain common properties also called as environment variables such as
//  --URL of application
//  --browser
//  --Login Credentials
//  --username
//  --password
//  -- these properties remain constant throughout the framework.

//  1.2- testBase- 
//    testBase class holds all common function used by all pages i.e
//  --loading property file
//  --WebDriver initialization
//  --maximize window
//  --implicit wait
//  --delete all cookies
//  --get(URL);
//    all pageClass are extending testBase class also all pageTest are extending testBase class.
//    inheritance concept is used here.

//  1.3 - Util 
//  --util package contain all utility function which is repeative in nature such as
//  --taking screenShot
//  --waits
//  --actions
//  --reading excel

//  1.4 - TestData
//  --all the test data are places in testData package which contain
//  --excel file
//  --we pass data and handle data driven testing using dataProvider 
//  --we are using Apache POI to handle excel sheet.

// 5- Maven 
//  -- we are using Maven for Build, execution and dependency purpose.
//  -- so that we do not need to add separate jar in project build path, Maven will take care of all dependencies.
//  --integrating TestNG dependencies and running POM.xml file using jenkins.

// 6- Git -- A Version Control (VC) tool
//  -- we are using Git to manage code repository
//  -- to store our testScript

// 7- Jenkins - A Continuous Integration (CI) Tool
//  --we execute tests cases on daily basis and
//  -- also for nightly execution based on the schedule.

// 8- extent report
//   --we are using extent report for reporting purpose
//   --because it generates beautiful HTML report in test-output folder
//   -- also used for maintaining the logs
//   -- also to include screenshot of failed test cases


public class A04_ProjectFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
