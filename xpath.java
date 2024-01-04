import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe\\");
		
		WebDriver d= new ChromeDriver();
		d.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("@HjLatha");
		d.findElement(By.xpath("//span[text()='Next']")).click();
		
		
	}

}
