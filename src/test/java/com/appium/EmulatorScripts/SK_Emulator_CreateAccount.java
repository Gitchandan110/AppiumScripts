package com.appium.EmulatorScripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.appium.bussinessLogic.SK_AddEmergencyContactBL;
import com.appium.bussinessLogic.SK_AddOrganizationBL;
import com.appium.bussinessLogic.SK_CreateProfileBL;
import com.appium.bussinessLogic.SK_HomePageBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_SettingsBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.commonutils.Base;


public class SK_Emulator_CreateAccount extends Base{
	
	SK_LaunchBL launchbl = PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_TermsOfServicesBL termsbl=PageFactory.initElements(driver, SK_TermsOfServicesBL.class);
	SK_PrivacyPolicyBL privacypolicybl=PageFactory.initElements(driver, SK_PrivacyPolicyBL.class);
	SK_CreateProfileBL createProfilebl=PageFactory.initElements(driver, SK_CreateProfileBL.class);
	SK_AddOrganizationBL addOrgbl=PageFactory.initElements(driver, SK_AddOrganizationBL.class);
	SK_AddEmergencyContactBL addEmergencyContactbl=PageFactory.initElements(driver, SK_AddEmergencyContactBL.class);
	SK_PermissionBL permissionbl=PageFactory.initElements(driver, SK_PermissionBL.class);
	SK_QuickTipsBL quicktipsbl=PageFactory.initElements(driver, SK_QuickTipsBL.class);
	SK_HomePageBL homepagebl = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_SettingsBL settingsbl = PageFactory.initElements(driver, SK_SettingsBL.class);

	
	
	
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

	public void pageTitle() {

		launchbl.verifyTitle();
		
		
	}
	
	@Test(priority=1)
	
	public void createAccount() throws IOException {
		
		launchbl.clickBtnNewAccount();
		termsbl.acceptTermsOfServices();
		privacypolicybl.acceptPrivacyPolicy();
		createProfilebl.fillProfileDetails();
		createProfilebl.saveProfile();
		addOrgbl.fillOrgCode();
	    addOrgbl.saveOrgCode();
	    addEmergencyContactbl.fillFirstName();
	    addEmergencyContactbl.fillLastName();
	    addEmergencyContactbl.fillEmail();
	    addEmergencyContactbl.fillPhoneNumber();
	    addEmergencyContactbl.SaveEmergencyContact();
	    addEmergencyContactbl.fillFirstName();
	    addEmergencyContactbl.fillLastName();
	    addEmergencyContactbl.fillEmail();
	    addEmergencyContactbl.fillPhoneNumber();
	    addEmergencyContactbl.SaveEmergencyContact();
	    permissionbl.acceptPermissions();
	    quicktipsbl.closeTips();
		
	}
	
		
@AfterMethod
	
	public void logOutApp() {
		
		homepagebl.clickSetting();
		settingsbl.selectOptionLogOut();
		
		
	}

		
	
		
		
		

}
