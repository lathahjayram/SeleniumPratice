import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationXYFetch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe\\\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[.='Log In']"));
		Thread.sleep(2000);
		Point loc = ele.getLocation();
		System.out.println(loc);
		
		int Xaxis = loc.getX();
		int Yaxis=loc.getY();
		System.out.println(Xaxis);
		System.out.println(Yaxis);
		
		driver.close();
	}

}
