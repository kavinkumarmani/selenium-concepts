package webdriverbasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class sathyawindowshandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sathya.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//parent window
		String parent=driver.getWindowHandle();
		//click on link
		driver.findElement(By.xpath("//a[@class='btn x-btn-secondary btn-circle btn-social btn-brand-facebook']")).click();
		//child window
		Set<String> child=driver.getWindowHandles();
		for(String allwindows:child) {
			if(!parent.equalsIgnoreCase(allwindows)) {
				driver.switchTo().window(allwindows);
				driver.findElement(By.name("email")).sendKeys("kavin9965755008@gmail.com");
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("#menubar-my-account > div > a")).click();
		

	}

}
