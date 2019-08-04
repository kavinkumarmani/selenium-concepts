package webdriverbasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sathya.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='btn x-btn-secondary btn-circle btn-social btn-brand-facebook']")).click();
		Thread.sleep(5000);
		//all windows
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> it=allwindows.iterator();
		String parentwindowid= it.next();
		System.out.println("the parentwindow id is "+ parentwindowid);
		String childwindowid= it.next();
		System.out.println("the childwindow id is "+ childwindowid);
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("kavin9965755008@gmail.com");
		Thread.sleep(3000);
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		
			
		
		

	}

}
