package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsassisgnment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\c:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		//create reference object
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.name("identifier"))).sendKeys("kavin9965755008@gmail.com").build().perform();
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		action.click(driver.findElement(By.xpath("//span[@class='RveJvd snByac']"))).build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.name("password"))).sendKeys("Password@123").build().perform();
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		action.click(driver.findElement(By.xpath("//span[@class='RveJvd snByac']"))).build().perform();
		//click on compose
		action.click(driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//div[@class='aoD hl']"))).sendKeys("kavin9965755008@gmail.com").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@class='aoT']"))).sendKeys("mail subject").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"))).sendKeys("automatic mail").build().perform();
		action.click(driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"))).build().perform();

	}

}
