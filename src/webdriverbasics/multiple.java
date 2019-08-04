package webdriverbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List <WebElement> lst= driver.findElements(By.tagName("a"));
		System.out.println(lst.size());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for(int i=0;i<lst.size();i++) {
		String lsts=lst.get(i).getText();
		System.out.println(lsts);}
			
		}

	}
