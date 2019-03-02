import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.get("http://qaclickacademy.com/practice.php");
driver.findElement(By.id("checkBoxOption1")).click();
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
Thread.sleep(3000);
if(driver.findElement(By.id("checkBoxOption1")).isSelected())
	{
	driver.findElement(By.id("checkBoxOption1")).click();
		}

System.out.println(driver.findElements(By.xpath("//*[value='checkbox']")).size());
driver.close();
	}
	

}
