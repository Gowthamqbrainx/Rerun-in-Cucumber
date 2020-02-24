package qbrainx.extentReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExecutingCLass {
	public WebDriver driver;
@BeforeClass
private void launch() {
	System.setProperty("webdriver.gecko.driver", "F:\\Gowtham\\Oxygen workspaces\\ExtentReportTestNG\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}

@Test
private void url() {
driver.get("https://www.facebook.com/");
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}

@Test
private void login() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement username = driver.findElement(By.id("email"));
	Object executeScript = js.executeScript("arguments[0].setAttribute('value','gowtham')",username );
	driver.findElement(By.id("pass")).sendKeys("cudbcudbu");
	driver.findElement(By.id("loginbutton")).click();

}

}
