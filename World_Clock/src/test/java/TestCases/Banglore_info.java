package TestCases;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.Be_Cognizant;

public class Banglore_info extends BaseClass {
static Be_Cognizant b_cog ;
	
	@Test(priority = 2)
	void BangaloreWatch_Title() {
		b_cog=new Be_Cognizant (driver);
		System.out.println(b_cog.checkindiaclock());
		Assert.assertEquals(b_cog.checkindiaclock().toLowerCase(), "bangalore, india (ist)");
	}

	@Test(priority = 3)
	public static void Bangalore_Time() {
		b_cog=new Be_Cognizant (driver);
		Date currentTime = new Date();
		SimpleDateFormat timeformat=new SimpleDateFormat("h:mma");
		String formatedtime=timeformat.format(currentTime); 
		System.out.println(formatedtime.toLowerCase());
		String webtime = b_cog.checkindiatime();
		System.out.println(webtime.toLowerCase());
		Assert.assertEquals(webtime.toLowerCase(), formatedtime.toLowerCase());
	}

	@Test(priority = 4)
	public static void Bangalore_Date() {
		b_cog=new Be_Cognizant (driver);
		LocalDate currentSysDate=LocalDate.now();
		DateTimeFormatter date_formatter=DateTimeFormatter.ofPattern("EEEE, M/d/yyyy");
		String formattedDate=currentSysDate.format(date_formatter);
		System.out.println(formattedDate.toLowerCase());
		String webdate=b_cog.chechindiadate();
		System.out.println(webdate.toLowerCase());
		Assert.assertEquals(webdate.toLowerCase(), formattedDate.toLowerCase());
	
	}
	

}