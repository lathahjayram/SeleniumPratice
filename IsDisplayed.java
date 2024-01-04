import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe\\\\");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Latha/Desktop/disable.html");
		WebElement ele = driver.findElement(By.xpath("//input"));
		if(ele.isDisplayed()) {
			System.out.println("displayed");
		}
		else {
			System.out.println("not displayed");
		}
		driver.close();
	}

}
