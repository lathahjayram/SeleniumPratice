import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeTextFteching {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver.exe\\\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		System.out.println("--------Attribute-------------");
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		String AttributeValue = ele.getAttribute("title");
		System.out.println(AttributeValue);
		
		System.out.println("-----------Text-------------");
		String text = ele.getText();	
		System.out.println(text);
		
		driver.close();
	}

}

