import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe\\");
		WebDriver d= new ChromeDriver();
		d.get("https://twitter.com/");
		d.findElement(By.cssSelector("a[href='/login']")).click();
		d.findElement(By.cssSelector("input[autocapitalize='/sentences/']")).sendKeys("abcd@gamil.com");
		d.findElement(By.cssSelector("span[class='css-901oao css-16my406 css-bfa6kz r-poiln3 r-a023e6 r-rjixqe r-bcqeeo r-qvutc0\']")).click();
		d.findElement(By.cssSelector("input[class='css-901oao r-1awozwy r-1fmj7o5 r-6koalj r-37j5jr r-1inkyih r-16dba41 r-135wba7 r-bcqeeo r-13qz1uu r-qvutc0']")).sendKeys("password");
		d.findElement(By.cssSelector("span[class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0\']")).click();
		Thread.sleep(2000);
		d.close();
	}

}
