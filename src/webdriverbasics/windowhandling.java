package webdriverbasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\c:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		//create reference object
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.vkcgroup.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//parent window
		String parent=driver.getWindowHandle();
		System.out.println("parent windoe");
		//click on child window
		driver.findElement(By.xpath("//i[@class='fa fa-facebook-official']")).click();
		Set<String> allwindows= driver.getWindowHandles();
		int count= allwindows.size();
		//System.out.println("count");
		for(String child:allwindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.name("email")).sendKeys("kavin9965755008@gmail.com");
			}
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='Dealer Login']")).click();
		
		 

	}

}
