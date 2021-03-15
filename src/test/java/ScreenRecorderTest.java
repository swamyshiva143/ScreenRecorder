import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ScreenRecorder.MyScreenRecorder;

public class ScreenRecorderTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Swamyshiva\\swamyshiva\\chromedriver\\chromedriver.exe");
		driver =  new ChromeDriver();	//launch browser
		
	}
	
	@Test
	public void navigationTest() throws Exception {
		MyScreenRecorder.startRecording("navigationTest");
		
		driver.get("http://www.google.com");
		driver.get("http://www.facebook.com");
		driver.get("http://www.amazon.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		MyScreenRecorder.stopRecording();
		
	}
	
	
	@Test
	public void navigation_FeatureTest() throws Exception {
		MyScreenRecorder.startRecording("navigationTest");
		
		driver.get("http://www.flipkart.com");
		driver.get("http://www.facebook.com");
		driver.get("http://www.gmail.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		MyScreenRecorder.stopRecording();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
