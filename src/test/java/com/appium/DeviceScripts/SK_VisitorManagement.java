package com.appium.DeviceScripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.bussinessLogic.SK_ERPBL;
import com.appium.bussinessLogic.SK_HomePageBL;
import com.appium.bussinessLogic.SK_IncidentScreenBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_MyHistoryBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_SettingsBL;
import com.appium.bussinessLogic.SK_SignInBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.bussinessLogic.SK_VisitorManagementBL;
import com.appium.commonutils.Base;

public class SK_VisitorManagement extends Base {

	SK_LaunchBL launchbl = PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_TermsOfServicesBL termsbl = PageFactory.initElements(driver, SK_TermsOfServicesBL.class);
	SK_PrivacyPolicyBL privacypolicybl = PageFactory.initElements(driver, SK_PrivacyPolicyBL.class);
	SK_SignInBL signinbl = PageFactory.initElements(driver, SK_SignInBL.class);
	SK_PermissionBL permissionbl = PageFactory.initElements(driver, SK_PermissionBL.class);
	SK_VisitorManagementBL visitorManagementbl = PageFactory.initElements(driver, SK_VisitorManagementBL.class);
	SK_HomePageBL homepagebl = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_SettingsBL settingsbl = PageFactory.initElements(driver, SK_SettingsBL.class);

	@BeforeTest

	public void launchSafetyKuvrr() throws MalformedURLException {

		 launchAppSamsung();
		
		System.out.println("SK_VisitorManagement");

	}

	@Test(priority = 1)
	public void testERP() throws InterruptedException, IOException {

		homepagebl.PleaseWait300Seconds();
		homepagebl.clickSetting();
		settingsbl.SelectVisitorManagement();
		visitorManagementbl.createNewVisitor();

	}

	@AfterMethod

	public void CloseApp() {

		driver.closeApp();
		System.out.println("driver.closeApp() App done");

	}

}
