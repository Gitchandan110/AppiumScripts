package com.appium.DeviceScripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.bussinessLogic.SK_GroupCallBL;
import com.appium.bussinessLogic.SK_HomePageBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_MembersGroupCallBL;
import com.appium.bussinessLogic.SK_OrganizationBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_EditProfileBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_SettingsBL;
import com.appium.bussinessLogic.SK_SignInBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.commonutils.Base;

public class SK_Organization extends Base{
	
	SK_LaunchBL launchbl = PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_HomePageBL homepagebl = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_SettingsBL settingsbl = PageFactory.initElements(driver, SK_SettingsBL.class);
	SK_OrganizationBL organizationbl= PageFactory.initElements(driver, SK_OrganizationBL.class);
	
	@BeforeTest

	public void launchApp() {

		try {
			 launchAppSamsung();
			 
			System.out.println("SK_Organization");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*@BeforeMethod

	public void Login() {

		launchbl.verifyTitle();
		launchbl.clickBtnSignIn();
		termsbl.acceptTermsOfServices();
		privacypolicybl.acceptPrivacyPolicy();
		signinbl.fillEmail();
		signinbl.fillPassword();
		signinbl.clickSubmit();
		permissionbl.acceptPermissions();
		quicktipsbl.closeTips();
		
	}*/

	@Test

	public void Profile() throws InterruptedException, IOException {
		
		homepagebl.PleaseWait300Seconds();
		homepagebl.clickSetting();
		settingsbl.SelectOrganization();
		organizationbl.UpdateOrganization();
		
	
	}
	
@AfterMethod
public void CloseApp() {
	
	
	  driver.closeApp();
	  System.out.println("driver.closeApp done");
		
		
	}
	
}
