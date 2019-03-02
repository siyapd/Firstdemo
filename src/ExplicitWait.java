import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		WebDriverWait d =new WebDriverWait(driver, 30);
		d.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loader"))));//wait unit element is not visible.
		System.out.println(driver.findElement(By.id("results")).getText());
		
		

	}

}
