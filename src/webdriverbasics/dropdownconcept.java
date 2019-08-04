package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select select = new Select(driver.findElement(By.name("birthday_day")));
		select.selectByVisibleText("17");
		Select s1 = new Select(driver.findElement(By.name("birthday_month")));
		s1.selectByVisibleText("Jul");
		Select s2 = new Select(driver.findElement(By.name("birthday_year")));
		s2.selectByVisibleText("1993");

	}

}
