import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		//System.out.println("enter the expected url:");
//		Scanner sc= new Scanner(System.in);
//		String expectedUrl= sc.next();
		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.in");
		/*String actualUrl = d.getCurrentUrl();
		System.out.println(actualUrl);
		if(expectedUrl.equalsIgnoreCase(actualUrl)) {
			System.out.println("true");
		}
		else {
			System.out.println("fail");
		}*/
		d.quit();
	}

}
