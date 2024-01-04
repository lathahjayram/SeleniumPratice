import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile");
		driver.findElement(By.id("//button[@type='submit']")).click();
		
		
	}

}
