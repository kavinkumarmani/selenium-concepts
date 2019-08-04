package webdriverbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableproject {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.livechennai.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu\"]/a[7]")).click();
		//*[@id="menu"]/a[7]
		driver.findElement(By.xpath("//*[@id=\"gold-price\"]/a")).click();
		//*[@id="gold-price"]/a
		
		//html/body/div[2]/div[1]/table/tbody/tr/td/div[6]/table/tbody/tr[1]/td[1]
				//html/body/div[2]/div[1]/table/tbody/tr/td/div[6]/table/tbody/tr[1]/td[2]
		
		//*[@id="container"]/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[1]
		//*[@id="container"]/div/div[3]/div[2]/div[1]/div[2]/div[7]/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[1]
		List<WebElement> totalcol=driver.findElements(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[6]/table/tbody/tr[1]/td"));
		int colcount=totalcol.size();
		System.out.println("total number of columns are "+colcount);
		
		String colbeforexpath="/html/body/div[2]/div[1]/table/tbody/tr/td/div[6]/table/tbody/tr[1]/td[";
		String colafterxpath="]";
		for(int i=1;i<=colcount;i++) {
			String actualxpath=colbeforexpath+i+colafterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println("the column elements are "+element.getText());
		}
		
		

	}

}
