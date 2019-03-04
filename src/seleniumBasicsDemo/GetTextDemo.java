package seleniumBasicsDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver-v0.20\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseurl="http://www.twoplugs.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseurl);
		WebElement element=driver.findElement(By.xpath("html/body/div/section[1]/div/div/form/div/button"));
		String buttonText= element.getText();
		System.out.println("The text on button Element is "+buttonText);
		driver.quit();
	}

}
