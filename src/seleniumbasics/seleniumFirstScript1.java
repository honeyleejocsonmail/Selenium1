package seleniumbasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class seleniumFirstScript1 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.quit();
	}

}
