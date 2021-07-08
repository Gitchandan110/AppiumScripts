package com.appium.commonutils;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	//SK_HomePagePO homePagepo=PageFactory.initElements(driver, SK_HomePagePO.class);

	public static AndroidDriver<MobileElement> driver;

	public static AppiumDriver launchApkKarbon() throws MalformedURLException {

		File appDir = new File("C:\\Users\\Chandan\\Git\\ArtifactIdAppium\\ApkFile");
		File apk = new File(appDir, "SK_51_develop_30_Aug_19.apk");

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability("deviceName", "K9 VIRAAT_4G");
		capability.setCapability("udid", "DQTKDYTGKRWOONPR");
		capability.setCapability("platformVersion", "6.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.safety.armourgrid");
		capability.setCapability("appActivity", "com.safety.armourgrid.activity.SplashActivity");
		capability.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Device Capability is working");
		return driver;

	}
	
	public static AppiumDriver launchAppVivo() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "vivo 1820");
		capability.setCapability("udid", "DYTWMNIBAMY9IVAU");
		capability.setCapability("platformVersion", "8.1.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("noReset", "true");
		capability.setCapability("appPackage", "com.safety.armourgrid");
		capability.setCapability("appActivity", "com.safety.armourgrid.DeepLinkActivity");
	//	capability.setCapability("appWaitActivity", "com.safety.armourgrid.activity.SplashActivity");
		capability.setCapability("automationName", "UiAutomator2");
		capability.setCapability ("simpleIsVisibleCheck", "true");
		capability.setCapability ("useJSONSource", "true");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Device Capability is working");
		return driver;

	}
	
	public static AppiumDriver launchAppSamsung() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "Galaxy M01 Core");
		capability.setCapability("udid", "RZ8N82W5Z3B");
		capability.setCapability("platformVersion", "10.0.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("noReset", "true");
		capability.setCapability("appPackage", "com.safety.armourgrid");
		capability.setCapability("appActivity", "com.safety.armourgrid.DeepLinkActivity");
	//	capability.setCapability("appWaitActivity", "com.safety.armourgrid.activity.SplashActivity");
		capability.setCapability("automationName", "UiAutomator2");
		capability.setCapability ("simpleIsVisibleCheck", "true");
		capability.setCapability ("useJSONSource", "true");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Device Capability is working");
		return driver;

	}
	
	public static AppiumDriver launchAppKarbon() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "K9 VIRAAT_4G");
		capability.setCapability("udid", "DQTKDYTGKRWOONPR");
		capability.setCapability("platformVersion", "6.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("noReset", "true");
		capability.setCapability("appPackage", "com.safety.armourgrid");
		capability.setCapability("appActivity", "com.safety.armourgrid.DeepLinkActivity");
		capability.setCapability("automationName", "UiAutomator2");
		capability.setCapability ("simpleIsVisibleCheck", "true");
		capability.setCapability ("useJSONSource", "true");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Device Capability is working");
		return driver;

	}
	
	
	
	
	

	public static AppiumDriver launchGooglePlayKarbon() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability("deviceName", "K9 VIRAAT_4G");
		capability.setCapability("udid", "DQTKDYTGKRWOONPR");
		capability.setCapability("platformVersion", "6.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.android.vending");
		capability.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		System.out.println("Device Capability is working");
		return driver;

	}

	
	public static AppiumDriver launchGooglePlayEmulator() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();

		capability.setCapability("deviceName", "Android Emulator");
		capability.setCapability("udid", "emulator-5554");
		capability.setCapability("platformVersion", "7.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.android.vending");
		capability.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		return driver;

	}

	
	public static AppiumDriver launchInstalledAppEmulator() throws MalformedURLException {

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "Android Emulator");
		capability.setCapability("udid", "emulator-5554");
		capability.setCapability("platformVersion", "7.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.safety.armourgrid");
		capability.setCapability("appActivity", "com.safety.armourgrid.activity.SplashActivity");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 600);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}
	
	
	public static void waitFor30Seconds(MobileElement element) {

		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
			System.out.println("Explicit Wait 30 seconds Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void waitFor300Seconds(MobileElement element) {

		try {
			new WebDriverWait(driver, 300).until(ExpectedConditions.visibilityOf(element));
			System.out.println("Explicit Wait 300 Seconds Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void Scrolldown() throws Exception {

		driver.hideKeyboard();

		MobileElement Frame = driver.findElement(By.className("android.widget.ScrollView"));

		List<MobileElement> listElement = Frame.findElements(By.className("android.widget.EditText"));
		System.out.println("Number of Elements are :" + listElement.size());

		for (int i = 0; i > listElement.size(); i++) {

			System.out.println("List Item :" + listElement.get(i).getText());

		}

		MobileElement listitem = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\"Confirm Password\"));"));
		System.out.println("Scrolled items are :" + listitem.getText());

		System.out.println("Scrolled item locations are :" + listitem.getLocation());
		listitem.click();
	}

	public static String GetDateTime() {

		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String date1 = dateFormat.format(date);

		// Print the Date
		System.out.println("Current date and time is " + date1);
		return date1;

	}
	
	
	public static String GetCurrentTime() {

		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("mm:ss");

		// get current date time with Date()
		String timeString = dateFormat.format(new Date()).toString();

	/*	// Now format the date
		String date1 = dateFormat.format(date);*/

		// Print the Date
		System.out.println("Current date and time is " + timeString);
		return timeString;

	}
	
	
	public static void scrolltoElement(String text){
		
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
		        
   }
	
	
	public static void scrolltoMobileElement(WebDriver driver, WebElement webElement) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

	}
	
	
	
	
	public static void takeScreenShot(String screenName) throws IOException {

		String imageLocation = "C:\\Users\\Chandan\\Git\\ArtifactIdAppium\\Screenshots\\";
		// String screenName= obj.getTagName();

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File capturedImage = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(capturedImage, new File(imageLocation + screenName));
			System.out.println("Screenshot captured");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String MailReader() {
		
		String hostName = "smtp.gmail.com";
		String username = "karbonkuvrr@gmail.com";
		String password = "omsai11ram";
		int messageCount;
		int unreadMsgCount;
		String emailSubject=null;
		String OTP = null;
		Message emailMessage;

		
	    Properties sysProps = System.getProperties();
	    sysProps.setProperty("mail.store.protocol", "imaps");

	    try {
	        Session session = Session.getInstance(sysProps, null);
	        Store store = session.getStore();
	        store.connect(hostName, username, password);
	        Folder emailInbox = store.getFolder("INBOX");
	        emailInbox.open(Folder.READ_WRITE);
	        messageCount = emailInbox.getMessageCount();
	        System.out.println("Total Message Count: " + messageCount);
	        unreadMsgCount = emailInbox.getNewMessageCount();
	        System.out.println("Unread Emails count:" + unreadMsgCount);
	        emailMessage = emailInbox.getMessage(messageCount);
	        emailSubject = emailMessage.getSubject();

	        Pattern linkPattern = Pattern.compile("\\Your Safety Kuvrr Security Code is (.*)"); // here you need to define regex as per you need
	        Matcher pageMatcher =
	                linkPattern.matcher(emailMessage.getContent().toString());

	        while (pageMatcher.find()) {
	            System.out.println("Found OTP " + pageMatcher.group(1));
	        }
	        emailMessage.setFlag(Flags.Flag.SEEN, true);
	        emailInbox.close(true);
	        store.close();
	      //  return String;

	    } catch (Exception mex) {
	        mex.printStackTrace();
	    }
		return OTP;
	}
	
	
	public static void pressBackButton() {
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		System.out.println("Device Back button clicked");
		
	}
	
public static void switchOffDevice() {
		
	driver.longPressKey(new KeyEvent(AndroidKey.POWER));
    System.out.println("Device is switched off by long press long Press power button");
		
	}
	

}
