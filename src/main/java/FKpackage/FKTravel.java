package FKpackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FKTravel 
{
  @FindBy(xpath="(//div[@class='eFQ30H'])[8]")private WebElement travel;
  @FindBy(xpath="(//div[@class='_1XFPmK'])[2]")private WebElement round;
  @FindBy(xpath="(//div[@class='_3qBKP_ _1Jqgld'])[1]")private WebElement from; 
  @FindBy(xpath="(//div[@class='_3qBKP_ _1Jqgld'])[2]")private WebElement to;
  @FindBy(xpath="//table[@class='aSgzfL']//tr[4]/td[6]")private WebElement date1;
  @FindBy(xpath="//div[@class='_3SCHpg _1Jqgld']")private WebElement travel1;
  @FindBy(xpath="(//div[@class='_1XFPmK'])[4]")private WebElement premium;
  @FindBy(xpath="//button[@class='_2KpZ6l _34K0qG _37Ieie']")private WebElement adult;
  @FindBy(xpath="(//button[@class='_2KpZ6l _34K0qG _37Ieie'])[3]")private WebElement child;
  @FindBy(xpath="//button[text()='Done']")private WebElement done;
  @FindBy(xpath="//button[@class='_2KpZ6l _1QYQF8 _3dESVI']") private WebElement search;
  @FindBy(xpath="//table[@class='aSgzfL']//tr[5]/td") private WebElement date2;
  
  WebDriver driver1;
  public FKTravel(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  driver1=driver;
  }
  
  public void clickFKTravel()
  {
	  travel.click();
  }
  
  public void clickFKTravelRound() throws InterruptedException
  {
	  round.click();
	  Thread.sleep(3000);
  }
  public void clickFKTravelFrom()
  {
	  Actions act=new Actions(driver1);
	  act.click(from).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ENTER).perform();
	  act.click(to).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  act.sendKeys(Keys.ENTER).perform();
	  
	  act.click(date1).perform();
	  act.click(date2).perform();
	 // act.sendKeys(Keys.ENTER).perform();
	  act.click(travel1).perform();
	  act.click(premium).perform();
	  act.click(adult).perform();
	  act.click(child).perform();
	  act.click(done).perform();
	  act.click(search).perform();
  }
  
  
}
