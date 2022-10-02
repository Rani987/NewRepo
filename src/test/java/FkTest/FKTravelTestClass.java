package FkTest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FKpackage.BaseClass;
import FKpackage.FKTravel;
import FKpackage.FkSearch;
import FKpackage.FkTravelFilter;
import FKpackage.LoginFk;

public class FKTravelTestClass extends BaseClass
{
	LoginFk login;
	FKTravel tr;
	FkTravelFilter fi;
	int testcaseid;
	@BeforeClass
	public void initializeFk() throws IOException, InterruptedException
	{
		openFKBrowser();
		login=new LoginFk(driver);
		tr=new FKTravel(driver);
		fi=new FkTravelFilter(driver);
		testcaseid=100;
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		login.setLoginFkMob();
		login.setLoginFkPass();
		login.clickLoginFkLog();
		Thread.sleep(3000);
		tr.clickFKTravel();
		tr.clickFKTravelRound();
		tr.clickFKTravelFrom();
		Thread.sleep(2000);
		fi.scrollFkTravelFilterPrice();
	}
	@Test
	public void m1()
	{
	}
	
	
}
