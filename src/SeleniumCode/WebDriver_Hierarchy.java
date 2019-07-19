package SeleniumCode;

// Q. Why WebDriver driver = new ChromeDriver(); ?

// WebDriver Hierarchy
//=========================
//
//                         SearchContext(I) [findElement(), findElements()]
//                               | extends
//                           WebDriver(I) [get(), Close()]
//                               | implements
// JavaScriptExecutor(I)<-- RemoteWebDriver(C) -->TakeScreenshot(I)
//                               | extends
//                          ChromeDriver(C)
//                          FirefoxDriver(C)

//============================================================
//  we can write 
//
//  ChromeDriver driver = new ChromeDriver();
//  
//  In this we created object/instance of ChromeDriver Class.
//  but this will execute our script on chrome browser only because 
//  same object can not be used for creating instance of FirefoxDriver
//  here reference variable is of ChromeDriver Class

//  To Solve this we Create

//  WebDriver driver = new ChromeDriver();

//  WebDriver         --> interface
//  driver            --> reference variable WebDriver interface.
//  new               --> keyword
//  new ChromeDriver  --> object/instance.
//  ChromeDriver      --> class, actually its constructor.

//  Here we created new object/instance of ChromeDriver class 
//  by taking reference variable of WebDriver interface.
//  here reference variable is of WebDriver interface.. 
//  now we can implement all instance of WebDriver interface.
//  like driver = new FirefoxDriver();
//  this is Dynamic Polymorphism/ Top Casting

//  BUT we can't Write like

//  WebDriver driver = new WebDriver();

//  because WebDriver is an interface and we can't create object of interface*.

public class WebDriver_Hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
