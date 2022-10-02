package FKpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FkTravelFilter
{
	@FindBy(xpath="//div[@class='_2IN3-t']")private WebElement price;
	@FindBy(xpath="//div[text()='Book']") private WebElement book;
	 WebDriver driver1;
	public FkTravelFilter(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		driver1=driver;
	}
	
	public void scrollFkTravelFilterPrice()
	{
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView();",book);
	}
}
