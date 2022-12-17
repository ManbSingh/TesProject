import java.lang.reflect.Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	
	
	public static void main (String args[]) {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		int val;
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		String math = driver.findElement(By.xpath("//span[@id='mathq2']")).getText();
		String[] math2 = math.split(" ");
		
		
		System.out.println(math2[0]);
		System.out.println(math2[1]);
		System.out.println(math2[2]);
		
		if (math2[1].equals("+")) {
			
			val = Integer.parseInt(math2[0])+ Integer.parseInt(math2[2]);
		}else if (math2[1].equals("*")) {
			val = Integer.parseInt(math2[0])* Integer.parseInt(math2[2]);
		}else if (math2[1].equals("/")) {
			val = Integer.parseInt(math2[0])/ Integer.parseInt(math2[2]);
	    }else {
	    	val = Integer.parseInt(math2[0])- Integer.parseInt(math2[2]);
	    }
		
		System.out.println(val);
		
		
		driver.findElement(By.xpath("//input[@id='mathuserans2']")).sendKeys(String.valueOf(val));
	
		
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		
		
	}
	
	
	
}
