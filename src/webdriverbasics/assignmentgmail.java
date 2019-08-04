package webdriverbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentgmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set property
		System.setProperty("webdriver.chrome.driver","\\c:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		//create reference object
		WebDriver driver = new ChromeDriver();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.google.com");
		//to enter gmail id and ckick on next button
		driver.findElement(By.name("identifier")).sendKeys("kavin9965755008@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > span > span")).click();
		//to enter password and click on 
		driver.findElement(By.name("password")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("#passwordNext > span > span")).click();
		//click on compose button
		driver.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).click();
		//to enter to email address
		driver.findElement(By.name("to")).sendKeys("kavin9965755008@gmail.com");
		//to enter subject
		driver.findElement(By.id(":99")).sendKeys("automating gmail");
		//to enter compose email
		driver.findElement(By.id(":ae")).sendKeys("sending automated email to my gmail");
		//click send button
		driver.findElement(By.cssSelector("#\\:8z")).click(); 
		//to click on account
		driver.findElement(By.cssSelector("#gb > div.gb_xd.gb_Od.gb_Fd > div.gb_Ec.gb_La.gb_Dc.gb_Md > div > div.gb_Fa.gb_Zc.gb_jg.gb_f.gb_sf > div > a > span")).click();
		//click on signout
		driver.findElement(By.id("gb_71")).click();
		//driver.close();
		//driver.quit();
	}

}
