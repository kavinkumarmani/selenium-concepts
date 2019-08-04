package webdriverbasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.vkcgroup.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//i[@class='fa fa-facebook-official']")).click();
		Thread.sleep(2000);
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> it=allwindows.iterator();
		String parentwindowid= it.next();
		System.out.println("the parent window id is "+ parentwindowid);
		String childwindowid=it.next();
		System.out.println("the child window id is "+childwindowid );
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("kavin9965755008@gmail.com");      
		driver.switchTo().window(parentwindowid);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Dealer Login']")).click();
	}

}
