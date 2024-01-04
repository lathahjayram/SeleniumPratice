import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe\\");
		WebDriver d= new ChromeDriver();
		d.get("https:\\instagram.com");
		Thread.sleep(2000);
		String title= d.getTitle();
		System.out.println(title);
		System.out.println(d.getCurrentUrl());
		
		d.get("https:\\facebook.com");
		System.out.println(d.getCurrentUrl());
		
		d.get("https.\\a23.com");
		System.out.println(d.getCurrentUrl());
		
	}
}
