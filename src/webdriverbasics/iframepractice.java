package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframepractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//iframe
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.id("name")).sendKeys("kavinkumar");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("http://www.uitestpractice.com/")).click();
	}

}
