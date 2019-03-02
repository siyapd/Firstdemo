import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		//select 2 adult
		Select s =new Select(driver.findElement(By.id("Adults")));
		s.selectByIndex(1);
		Thread.sleep(1000);
		//select  children
		Select s1 =new Select(driver.findElement(By.id("Childrens")));
		s1.selectByIndex(2);
		Thread.sleep(1000);
		//click on depart on
		driver.findElement(By.id("DepartDate")).click();
		//todays date 24th Nov 2018
		if(driver.findElements(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).equals(24));
		{
			driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		}
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		driver.close();
		
		
		
	}

}
