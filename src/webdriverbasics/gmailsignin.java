package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailsignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("kavin9965755008@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > span")).click();
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("#passwordNext > span > span")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

}
