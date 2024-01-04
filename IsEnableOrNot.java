import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableOrNot {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe\\\\");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Latha/Desktop/disable.html");
		WebElement ele = driver.findElement(By.xpath("//input"));
		if(ele.isEnabled()) {
			System.out.println("enabled");
		}
		else {
			System.out.println("disable");
		}
		driver.close();
	}

}
