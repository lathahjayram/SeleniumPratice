import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Compose {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.yahoo.com/d/folders/1");
		driver.findElement(By.id("login-username")).sendKeys("lathahjayram1@yahoo.com");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\" \"]")).sendKeys("jayanth1919");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Compose']")).click();
		driver.findElement(By.xpath("//div[@class='typeahead-inputs-container M_0 p_R H_6NIX']")).sendKeys("latha Jayram");
		
		
		
	}

}
