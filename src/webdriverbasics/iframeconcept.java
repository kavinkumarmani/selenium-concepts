package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeconcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//frame
		driver.switchTo().frame("iframecontainer");
		driver.findElement(By.name("firstname")).sendKeys("kavin");
		driver.switchTo().defaultContent();

	}

}
