package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionoutput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\c:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action= new Actions(driver);
		//gmail login
		action.moveToElement(driver.findElement(By.name("identifier"))).sendKeys("kavin9965755008@gmail.com").build().perform();
		action.click(driver.findElement(By.xpath("//span[@class='RveJvd snByac']"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.name("password"))).sendKeys("Password@123").build().perform();
		action.click(driver.findElement(By.xpath("//span[@class='RveJvd snByac']"))).build().perform();
		Thread.sleep(9000);
		//compose mail
		action.click(driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"))).build().perform();
		action.click(driver.findElement(By.xpath("//a[@class='gb_x gb_Ea gb_f']"))).build().perform();
		
		

	}

}
