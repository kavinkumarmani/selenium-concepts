package webdriverbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("kavinkumar");
		driver.findElement(By.name("lastname")).sendKeys("M");
		//actions concept
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.id("u_0_q"))).sendKeys("kavin9965755008@gmail.com").build().perform();
		action.click(driver.findElement(By.id("u_0_t"))).sendKeys("kavin9965755008@gmail.com").build().perform();
		action.click(driver.findElement(By.id("u_0_x"))).sendKeys("Password@123").build().perform();
		Thread.sleep(5000);
		//drop down select concept
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("17");
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByVisibleText("Jul");
		Select s2=new Select(driver.findElement(By.id("year")));
		s2.selectByVisibleText("1993");
		Thread.sleep(3000);
		action.click(driver.findElement(By.xpath("//label[text()='Male']"))).build().perform();
		//number of links in this page
		
		//List <WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		//for(int i=0;i<links.size();i++) {
			//String link= links.get(i).getText();
			//System.out.println(link);
		//total iframes
		List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		System.out.println("number of iframes"+iframes.size());
		}

		
		

	}


