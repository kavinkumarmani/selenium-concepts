package webdriverbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\c:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		//create reference object
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body > div.page > header > div > nav > div.rd-navbar-inner > div > div.rd-navbar-nav-wrap.toggle-original-elements > ul > a > span:nth-child(2)")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("kavin9965755008@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Password@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(5000);
        List<WebElement>iframeelements=driver.findElements(By.tagName("iframe"));
        System.out.println("no.of iframes"+ iframeelements.size());
       //driver.switchTo().frame(0);
       //driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//span[text()='Contacts']")).click();
        
	

	}

} 
