package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("proceed")).click();
		//alert
		Alert alert=driver.switchTo().alert();
		Thread.sleep(6000);
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct popup alerts");
		}
		else {
			System.out.println("incorrect popup alerts");
		}
		alert.accept();
		
	}

}
