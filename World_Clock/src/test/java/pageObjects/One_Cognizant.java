package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class One_Cognizant extends BasePage {

	public One_Cognizant(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="(//div[@id='QuicklinksItemTitle'])[7]") WebElement ele;
    @FindBy (xpath="//div[@class='viewAllHotAppsBtn']") WebElement ele2;
    @FindBy (xpath="//div[@class ='aZHolder']/div")
	public List<WebElement> ele3;
    public void onecognizant()
	{
	ele.click();
	}

	public void hotapps()
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",ele2);
	js.executeScript("arguments[0].click();", ele2);
	}

}
