package webdriverbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicwebtables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.livechennai.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/a[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"gold-price\"]/a")).click();
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody"));
		List <WebElement> rows=table.findElements(By.tagName("tr"));
		int totalrows=rows.size();
		System.out.println("total number of rows are :"+totalrows);
		
		List<WebElement> columns=rows.get(0).findElements(By.tagName("td"));
		int totalcolums=columns.size();
		System.out.println("total number of columns are :"+totalcolums);
		
		for(int i=1;i<=totalrows;i++) {
			for(int j=1;j<=totalcolums;j++) {
				if(i==1) {
					//html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[1]/td[1]
					//html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[1]/td[2]
					System.out.print(driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[1]/td["+j+"]"+"	")).getText());
					}
				else {
					//html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[3]/td[1]
					//html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[3]/td[2]
					//html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[4]/td[1]
					System.out.print(driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr["+i+"]/td["+j+"]")).getText());
				}
			}
		}

	}

}
