package com.baselib;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {

	public DesiredCapabilities Capabilities;
	public static String sDirpath=System.getProperty("user.dir");
	public static String apkpath=sDirpath+"//Amazon_shopping.apk";
	public static AndroidDriver<MobileElement> driver;
	@BeforeSuite
	public void setup() throws MalformedURLException{
		File sfile=new File(apkpath);
		Capabilities=new DesiredCapabilities();
		Capabilities.setCapability("automationName",genericclass.readconfigproperties("AUTOMATIONNAME"));
		Capabilities.setCapability("platformName",genericclass.readconfigproperties("PLATFORMNAME"));
		Capabilities.setCapability("deviceName",genericclass.readconfigproperties("DEVICENAME"));
		Capabilities.setCapability("platformVersion",genericclass.readconfigproperties("PLATFORMVERSION"));
		//Capabilities.setCapability(MobileCapabilityType.NO_RESET,"false");
		Capabilities.setCapability(MobileCapabilityType.FULL_RESET,"true");
		Capabilities.setCapability("app",sfile.getAbsolutePath());
		Capabilities.setCapability("autoAcceptAlerts",genericclass.readconfigproperties("ACCEPTALERTS"));
		driver=new AndroidDriver<MobileElement>(new URL(genericclass.readconfigproperties("APPIUMSERVERURL")),Capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void close(){
		driver.quit();
	}
	
}
