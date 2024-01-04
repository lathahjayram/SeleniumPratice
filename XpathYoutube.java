import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathYoutube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe\\");
		WebDriver d= new ChromeDriver();
		
		d.get("https://www.youtube.com/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='search']")).sendKeys("Mr. bean");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@id='thumbnail' and @href='/watch?v=yHgLTGXY2So']")).click();
		Thread.sleep(4000);
		//d.findElement(By.xpath("//yt-formatted-string[text()='149K']")).click();	
		//d.findElement(By.xpath("yt-formatted-string[contains(., 'K')]/preceding-sibling::yt-icon-button[1]")).click();
		//d.findElement(By.xpath("//yt-icon[@id=\"close-icon\"]")).click();  disable in html tree
		
	}
}
