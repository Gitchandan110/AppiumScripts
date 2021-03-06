package com.appium.EmulatorScripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.bussinessLogic.SK_GroupCallBL;
import com.appium.bussinessLogic.SK_HomePageBL;
import com.appium.bussinessLogic.SK_IncidentScreenBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_MembersGroupCallBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_SettingsBL;
import com.appium.bussinessLogic.SK_SignInBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.commonutils.Base;

public class SK_Emulator_GroupCall extends Base{
	
	SK_LaunchBL launchbl = PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_TermsOfServicesBL termsbl = PageFactory.initElements(driver, SK_TermsOfServicesBL.class);
	SK_PrivacyPolicyBL privacypolicybl = PageFactory.initElements(driver, SK_PrivacyPolicyBL.class);
	SK_SignInBL signinbl = PageFactory.initElements(driver, SK_SignInBL.class);
	SK_PermissionBL permissionbl = PageFactory.initElements(driver, SK_PermissionBL.class);
	SK_QuickTipsBL quicktipsbl = PageFactory.initElements(driver, SK_QuickTipsBL.class);
	SK_HomePageBL homepagebl = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_SettingsBL settingsbl = PageFactory.initElements(driver, SK_SettingsBL.class);
	SK_GroupCallBL groupcallbl=PageFactory.initElements(driver, SK_GroupCallBL.class);
	SK_MembersGroupCallBL membersGPCall=PageFactory.initElements(driver, SK_MembersGroupCallBL.class);
	
	
	@BeforeTest

	public void launchApp() {

		try {
			launchInstalledAppEmulator();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeMethod

	public void Login() {

		launchbl.verifyTitleSafetyKuvrr();
		launchbl.clickBtnSignIn();
		termsbl.acceptTermsOfServices();
		privacypolicybl.acceptPrivacyPolicy();
		signinbl.fillEmail();
		signinbl.fillPassword();
		signinbl.clickSubmit();
		permissionbl.acceptPermissions();
		quicktipsbl.closeTips();
		homepagebl.clickSetting();
	}

	@Test

	public void GroupCall() throws InterruptedException, IOException {
		
		settingsbl.SelectOptionGroupCall();
		groupcallbl.ClickBtnGroupListName();
		membersGPCall.ClickBtnVideoCall();
		membersGPCall.ClickBtnEndGrpCall();
		membersGPCall.ClickBtnAudioCall();
		membersGPCall.ClickBtnEndGrpCall();
	}
	
@AfterMethod
	
	public void logOutApp() {
		
		homepagebl.clickSetting();
		settingsbl.selectOptionLogOut();
		
		
	}
	
}
