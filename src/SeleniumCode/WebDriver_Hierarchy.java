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


public class WebDriver_Hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
