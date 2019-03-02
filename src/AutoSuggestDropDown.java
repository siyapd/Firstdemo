import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class AutoSuggestDropDown {
	WebDriver driver;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		driver.findElement(By.id("autocomplete")).sendKeys((Keys.DOWN));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";

		
		int i = 0;
		while (!((String) js.executeScript(script)).equals("India")) {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys((Keys.DOWN));
			js.executeScript(script);

			
			if (i > 10) {
				break;
			}
			if (i > 10) {
				System.out.println("Elements not found");
			} else {
				System.out.println("Element  found");
			}

		}
		//driver.quit();

	}

}
