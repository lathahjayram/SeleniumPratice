import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedOrNot {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe\\\\");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Latha/Desktop/checkbox.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[1]"));
		boolean result= ele.isSelected();
		System.out.println(result);
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		if(ele.isSelected())
		{
			System.out.println("selected");
		}
		else {
			System.out.println("not selected");
		}
		driver.close();
	}

}
