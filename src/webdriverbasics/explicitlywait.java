package webdriverbasics;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\c:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		//create reference object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement firstname= driver.findElement(By.name("firstname"));
		WebElement lastname= driver.findElement(By.name("lastname"));
		WebElement phonenumber= driver.findElement(By.name("reg_email__"));
		WebElement password= driver.findElement(By.name("reg_passwd__"));
		WebElement radio= driver.findElement(By.id("u_0_6"));
		
		sendkey(driver,firstname,10,"kavinkumar");
		sendkey(driver,lastname,10,"m");
		sendkey(driver,phonenumber,10,"9965755008");
		sendkey(driver,password,10,"Password@1234");
		clickon(driver,radio,15);
		}
	public static void sendkey(WebDriver driver,WebElement element, int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickon(WebDriver driver,WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
