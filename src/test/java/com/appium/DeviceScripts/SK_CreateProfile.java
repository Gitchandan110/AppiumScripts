package com.appium.DeviceScripts;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.appium.bussinessLogic.SK_EmergencyContactBL;
import com.appium.bussinessLogic.SK_OrganizationBL;
import com.appium.bussinessLogic.SK_CreateProfileBL;
import com.appium.bussinessLogic.SK_HomePageBL;
import com.appium.bussinessLogic.SK_LaunchBL;
import com.appium.bussinessLogic.SK_PermissionBL;
import com.appium.bussinessLogic.SK_PrivacyPolicyBL;
import com.appium.bussinessLogic.SK_QuickTipsBL;
import com.appium.bussinessLogic.SK_SettingsBL;
import com.appium.bussinessLogic.SK_TermsOfServicesBL;
import com.appium.commonutils.Base;

public class SK_CreateProfile extends Base{
	
	SK_LaunchBL launchbl=PageFactory.initElements(driver, SK_LaunchBL.class);
	SK_TermsOfServicesBL termsbl=PageFactory.initElements(driver, SK_TermsOfServicesBL.class);
	SK_PrivacyPolicyBL privacypolicybl=PageFactory.initElements(driver, SK_PrivacyPolicyBL.class);
	SK_CreateProfileBL createprofilebl=PageFactory.initElements(driver, SK_CreateProfileBL.class);
	SK_OrganizationBL addOrgbl=PageFactory.initElements(driver, SK_OrganizationBL.class);
	SK_EmergencyContactBL addEmergencyContactbl=PageFactory.initElements(driver, SK_EmergencyContactBL.class);
	SK_PermissionBL permissionbl=PageFactory.initElements(driver, SK_PermissionBL.class);
	SK_QuickTipsBL quicktipsbl=PageFactory.initElements(driver, SK_QuickTipsBL.class);
	SK_HomePageBL homepagebl = PageFactory.initElements(driver, SK_HomePageBL.class);
	SK_SettingsBL settingsbl = PageFactory.initElements(driver, SK_SettingsBL.class);
	
	
	
	
	 @BeforeTest
	    
	    public void launchSafetyKuvrr() throws MalformedURLException, InterruptedException {
		  
		  
		// launchAppKarbon();
		 launchAppMotoG4P();
		  System.out.println("App Launched Successfull");
		  Thread.sleep(5000);
	
	        
	  }
	  
	@Test (priority=1) 
	
	public void CreateAccount() throws IOException {
		
		
		/*homepagebl.clickSetting();
		settingsbl.selectOptionLogOut();*/
		launchbl.verifyTitleSafetyKuvrr();
		launchbl.verifyKuvrrImage();
		launchbl.clickBtnNewAccount();
		termsbl.verifyTitleTermsOfServices();
		termsbl.acceptTermsOfServices();
		privacypolicybl.acceptPrivacyPolicy();
		createprofilebl.fillProfileDetails();
		createprofilebl.fillAdditionalInfo();
		createprofilebl.saveProfile();
		addOrgbl.fillOrgCode();
	    addOrgbl.saveOrgCode();
	    addEmergencyContactbl.fillFirstName();
	    addEmergencyContactbl.fillLastName();
	    addEmergencyContactbl.fillEmail();
	    addEmergencyContactbl.fillPhoneNumber();
	    addEmergencyContactbl.SaveEmergencyContact();
	    permissionbl.acceptPermissions();
	    quicktipsbl.closeTips();
		
	}
	
	
	   
	@AfterMethod
    
	public void CloseApp() {
		
		
		  driver.closeApp();
		  System.out.println("driver.closeApp() App done");
        

        
    }
    
 
}



	