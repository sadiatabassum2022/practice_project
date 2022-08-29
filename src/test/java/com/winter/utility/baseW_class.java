package com.winter.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class baseW_class {
 
	public static Properties propw;
    public static WebDriver driverw;

	public baseW_class() {
	 propw = new Properties();	
		try {
			FileInputStream flsw = new FileInputStream (System.getProperty("user.dir")+ "\\src\\test\\java\\com\\winter\\configure\\cinfigureW.properties");
			propw.load(flsw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
public void initBrowserW() {

	//propw.getProperty("BROWSER1");
	String browsersetW = propw.getProperty("BROWSER1");
	
	if(browsersetW.equals("CHROME")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriverW\\chromedriver.exe");
	    driverw = new ChromeDriver ();
		driverw.get("http://automationpractice.com/index.php");
		driverw.manage().window().maximize();
		driverw.manage().timeouts().pageLoadTimeout(testdataW.pageLoadTimeoutw,TimeUnit.SECONDS);
		driverw.manage().timeouts().implicitlyWait(testdataW.implicitlyWaitw,TimeUnit.SECONDS); 
		System.out.println("Chrome Browser launch");
	
	}
	
     else if (browsersetW.equals("FF"))	;
	
	
	}

public static void GetURLWIN (String Talent) {
	driverw.get(propw.getProperty("URLWIN"));
}
	
	
	
}
