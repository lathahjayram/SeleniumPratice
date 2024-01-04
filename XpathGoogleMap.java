import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGoogleMap 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe\\");
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com/maps");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@id='xoLGzf-T3iPGc']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("makali");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@placeholder='Choose destination...']")).sendKeys("rajajinagar");
		Thread.sleep(2000);
		//d.findElement(By.xpath("//span[text()='Your location']")).click();
		d.close();
	}
}
