package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\c:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//create action class
		Actions action=new Actions(driver);
		WebElement username= driver.findElement(By.name("identifier"));
		WebElement password= driver.findElement(By.name("password"));
		action.sendKeys(username,"kavin9965755008@gmail.com").perform();
		action.sendKeys(username, Keys.ENTER).perform();
		

	}

}
