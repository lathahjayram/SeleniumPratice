import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ww.facebook.com");
		//driver.findElement(By.linkText("Marketplace")).click();
		driver.findElement(By.partialLinkText("Face")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
