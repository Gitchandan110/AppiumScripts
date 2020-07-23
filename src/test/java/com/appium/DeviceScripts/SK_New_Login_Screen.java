package com.appium.DeviceScripts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.bussinessLogic.SK_HomePageBL;
import com.appium.bussinessLogic.SK_IncidentScreenBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_MySQL_GetOTPBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_SettingsBL;
import com.appium.bussinessLogic.SK_SignInBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.commonutils.Base;

public class SK_New_Login_Screen extends Base {

	SK_LaunchBL launchbl = PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_TermsOfServicesBL termsbl = PageFactory.initElements(driver, SK_TermsOfServicesBL.class);
	SK_PrivacyPolicyBL privacypolicybl = PageFactory.initElements(driver, SK_PrivacyPolicyBL.class);
	SK_SignInBL signinbl = PageFactory.initElements(driver, SK_SignInBL.class);
	SK_PermissionBL permissionbl = PageFactory.initElements(driver, SK_PermissionBL.class);
	SK_QuickTipsBL quicktipsbl = PageFactory.initElements(driver, SK_QuickTipsBL.class);
	SK_HomePageBL homepagebl = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_IncidentScreenBL incidentscreenbl = PageFactory.initElements(driver, SK_IncidentScreenBL.class);
	SK_SettingsBL settingsbl = PageFactory.initElements(driver, SK_SettingsBL.class);
	SK_MySQL_GetOTPBL getOTPbl=PageFactory.initElements(driver, SK_MySQL_GetOTPBL.class);

	@BeforeTest

	public void launchApp() {

		try {
		//	launchAppKarbon();
			 launchAppMotoG4P();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeMethod

	public void Login() throws ClassNotFoundException, SQLException, IOException {

	
		launchbl.verifyTitleSafetyKuvrr();
		launchbl.clickBtnSignIn();
		termsbl.acceptTermsOfServices();
		privacypolicybl.acceptPrivacyPolicy();
		signinbl.EditCountryCode();
		signinbl.SelectCountry();
		signinbl.SelectIndia();
		signinbl.fillMobileNumber();
		signinbl.clickSubmit();
		getOTPbl.getOTPfromDB();
		signinbl.verifySecurityCode();
		permissionbl.acceptPermissions();
		quicktipsbl.closeTips();

	}

	@Test

	public void SOS() {

		homepagebl.startSOS();
		incidentscreenbl.EndIncident();
		incidentscreenbl.SelectEndReason();

	}

	@AfterMethod

	public void CloseApp() {
		
		
		  driver.closeApp();
		  System.out.println("driver.closeApp() App done");
	}

}
