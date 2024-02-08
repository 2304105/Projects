package TestBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	public static String exepath;
	public static String browserType;
	public static String browser="chrome";
	
	@BeforeSuite
	public static WebDriver getWebDriver() {
		  browserType=browser;
		  if(browserType.equalsIgnoreCase("edge")) {
			  driver=new EdgeDriver();
		  }
		  else if(browserType.equalsIgnoreCase("chrome")){
			  driver=new ChromeDriver();
		  }
		  driver.get("https://be.cognizant.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().deleteAllCookies();
		  WebElement seeAll=driver.findElement(By.xpath("//*[@id=\"c24ff0ed-b166-42e5-b7d5-57c9a9e573cb\"]/div/div/div/p/a/span/strong"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView();",seeAll);
		  return driver;
		    
	}
}