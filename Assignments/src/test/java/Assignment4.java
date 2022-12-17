

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Dimension;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String args[]) throws InterruptedException {
	WebDriver driver;
	WebDriverManager.firefoxdriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://timesofindia.indiatimes.com/poll.cms");
//	driver.manage().window().maximize();
	System.out.println(driver.manage().window().getSize());
	
	int x = 1000;
	int y = 500;
	while ((x<1552) && (y < 832)) {
		
		driver.manage().window().setSize(new Dimension(x, y));
		
		x = x +1;
		y = y +1;
	}

	
	}
}
