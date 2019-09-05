package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_SettingsPO;

public class SK_SettingsBL extends SK_SettingsPO {

	public void selectOptionLogOut() {

		Base.scrolltoElement("Logout");
		optionLogOut().click();
		popupLogOut().click();
		System.out.println("Logout from the App");

	}

	public void SelectOptionGroupCall() throws InterruptedException {

		Base.scrolltoElement("Group Call");
		optionGroupCall().click();
		Base.GetDateTime();
		Thread.sleep(10000);
		System.out.println("Group Call option clicked");
		Base.GetDateTime();

	}

	public void SelectOptionIncident() throws InterruptedException {

		Base.scrolltoElement("Incident Options");
		optionIncident().click();
		Thread.sleep(10000);
		System.out.println("lncident option clicked");

	}
	
	
	public void SelectOptionProfile() throws InterruptedException {

		Base.scrolltoElement("Profile");
		optionProfile().click();
		Thread.sleep(5000);
		System.out.println("Profile option clicked");

	}
	
	
	
	
	
	
	
	

	public void clickButtonBack() {

		try {

			if (btnNavigateBack().isDisplayed()) {
				btnNavigateBack().click();
				System.out.println("User Navigate Back");
			}

		} catch (Exception ex) {
			System.out.println("Exception in Naivigation Back:" + ex.getMessage());
		}
	}

}
