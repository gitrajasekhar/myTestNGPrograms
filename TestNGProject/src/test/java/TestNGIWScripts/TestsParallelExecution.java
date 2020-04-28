package TestNGIWScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestsParallelExecution {

	@Test
	@Parameters("Browser")
	public void LaunchGooglePageAndCloseBrowser(String Browser) throws InterruptedException {
      	 
		 if (Browser.equals("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", "d:\\Softwares\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver(); 
			 driver.navigate().to("https://www.google.com");
			 Thread.sleep(10000);
			 driver.close();
		 }
		
		 if (Browser.equals("FireFox")) {
			 System.setProperty("webdriver.firefoxdriver","d:\\softwares\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.navigate().to("https://www.google.com");
			 Thread.sleep(10000);
			 driver.close();
		 }
		
		
	}

}




