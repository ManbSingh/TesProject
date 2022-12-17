import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment1 {

	WebDriver driver;
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.findElement(By.xpath("//select[@name='country']")).click();
		driver.findElement(By.xpath("//option[@value = 'Angola']")).click();
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test");
	    driver.findElement(By.xpath("//div[@id='load_box']//input[@value='Submit']")).click();
		
		
	}
	
}
