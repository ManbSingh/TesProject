import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class LaunchBrowser {
	
	WebDriver driver;
  @Test
  public void f() {
	 System.out.println(driver.getTitle());
  }
  @BeforeSuite
  public void beforeSuite() {
	  
	  
		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.quit();
  }

}
