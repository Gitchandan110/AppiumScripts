package com.appium.DeviceScripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.bussinessLogic.SK_HomePageBL;
import com.appium.bussinessLogic.SK_IncidentScreenBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_MapBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_SettingsBL;
import com.appium.bussinessLogic.SK_SignInBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.commonutils.Base;

public class SK_Maps extends Base {

	SK_LaunchBL launchbl = PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_TermsOfServicesBL termsbl = PageFactory.initElements(driver, SK_TermsOfServicesBL.class);
	SK_PrivacyPolicyBL privacypolicybl = PageFactory.initElements(driver, SK_PrivacyPolicyBL.class);
	SK_SignInBL signinbl = PageFactory.initElements(driver, SK_SignInBL.class);
	SK_PermissionBL permissionbl = PageFactory.initElements(driver, SK_PermissionBL.class);
	SK_QuickTipsBL quicktipsbl = PageFactory.initElements(driver, SK_QuickTipsBL.class);
	SK_HomePageBL homepagebl = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_IncidentScreenBL incidentscreenbl = PageFactory.initElements(driver, SK_IncidentScreenBL.class);
	SK_SettingsBL settingsbl = PageFactory.initElements(driver, SK_SettingsBL.class);
	SK_MapBL mapBl = PageFactory.initElements(driver, SK_MapBL.class);

	@BeforeTest

	public void launchSafetyKuvrr() throws MalformedURLException {

		 launchAppSamsung();
		 
		System.out.println("SK_Maps");

	}

	@Test(priority = 1)
	public void VerifyAllMap() throws InterruptedException, IOException {

		/*
		 * launchbl.verifyTitle(); launchbl.clickBtnSignIn();
		 * termsbl.acceptTermsOfServices(); privacypolicybl.acceptPrivacyPolicy();
		 * signinbl.fillEmail(); signinbl.fillPassword(); signinbl.clickSubmit();
		 * permissionbl.acceptPermissions(); quicktipsbl.closeTips();
		 */
		homepagebl.PleaseWait300Seconds();
		homepagebl.OpenMAP();
		mapBl.selectAllMAP();

	}

	@AfterMethod

	public void CloseApp() {

		driver.closeApp();
		System.out.println("driver.closeApp() App done");

		/*
		 * homepagebl.clickSetting(); settingsbl.selectOptionLogOut();
		 */

	}

}
