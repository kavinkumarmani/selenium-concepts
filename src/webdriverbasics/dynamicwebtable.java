package webdriverbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicwebtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Saran\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath="]/td[1]";
		
		List <WebElement> totalrow=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowcount=totalrow.size();
		System.out.println("total number of rows are "+rowcount);
				
		
		for(int i=2;i<=rowcount;i++) {
			String actualxpath=beforexpath+i+afterxpath;
			WebElement element=driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			if(element.getText().contentEquals("Island Trading")) {
				System.out.println("the company name: "+ element.getText()+"is found");
				break;
			}
		}
			
			System.out.println("*******************");
			
			//*[@id="customers"]/tbody/tr[2]/td[2]
			//*[@id="customers"]/tbody/tr[3]/td[2]
			
			String afterxpathcontact="]/td[2]";
			
			for(int i=2;i<=rowcount;i++) {
				String actualxpath=beforexpath+i+afterxpathcontact;
				WebElement element=driver.findElement(By.xpath(actualxpath));
				System.out.println(element.getText());
				
			}
			
			System.out.println("********************");
			//*[@id="customers"]/tbody/tr[2]/td[3]
			//*[@id="customers"]/tbody/tr[3]/td[3]
			
			String afterxpathcountry="]/td[3]";
			
			for(int i=2;i<=rowcount;i++) {
				String actualxpath=beforexpath+i+afterxpathcountry;
				WebElement element=driver.findElement(By.xpath(actualxpath));
				System.out.println(element.getText());
			}
			//handle columns
			
			//*[@id="customers"]/tbody/tr[1]/th[1]
			//*[@id="customers"]/tbody/tr[1]/th[2]
			
			String colbeforexpath="//*[@id=\"customers\"]/tbody/tr[1]/th[";
			String colafterxpath="]";
			
			//total columns
			
			List<WebElement> totalcol=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
			int colcount=totalcol.size();
			System.out.println("totalnumber of columns are "+colcount);
			
			System.out.println("the values of column are");
			
			for(int i=1;i<=3;i++) {
				String actualxpath=colbeforexpath+i+colafterxpath;
				WebElement element=driver.findElement(By.xpath(actualxpath));
				System.out.println(element.getText());
			}
			
			
	}
	

}

