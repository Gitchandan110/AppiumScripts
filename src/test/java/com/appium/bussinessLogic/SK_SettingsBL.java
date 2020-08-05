package com.appium.bussinessLogic;

import java.io.IOException;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_SettingsPO;

public class SK_SettingsBL extends SK_SettingsPO {

	public void selectOptionLogOut() {

		Base.scrolltoElement("Logout");
		optionLogOut().click();
		popupLogOut().click();
		System.out.println("Logout from the App");

	}

	public void SelectOptionGroupCall() throws InterruptedException, IOException {

		Base.scrolltoElement("Group Call");
		optionGroupCall().click();
		Base.GetDateTime();
		Thread.sleep(10000);
		Base.takeScreenShot("Group Call");
		System.out.println("Group Call option clicked");
		Base.GetDateTime();

	}

	public void SelectEventOption() throws InterruptedException, IOException {

		Base.scrolltoElement("Event Options");
		eventOptions().click();
		Thread.sleep(10000);
		Base.takeScreenShot("Event Options Screen");
		System.out.println("Event options clicked");

	}

	public void SelectOptionProfile() throws InterruptedException, IOException {

		Base.scrolltoElement("Profile");
		optionProfile().click();
		Thread.sleep(5000);
		Base.takeScreenShot("Profile Screen");
		System.out.println("Profile option clicked");

	}

	public void SelectOrganization() throws InterruptedException, IOException {

		Base.scrolltoElement("Organization");
		optionOrganization().click();
		Thread.sleep(5000);
		Base.takeScreenShot("Organization");
		System.out.println("Organization option clicked");

	}
	
	public void SendNotification() throws InterruptedException, IOException {

		Base.scrolltoElement("Send Notification");
		optionSendNotification().click();
		Thread.sleep(5000);
		Base.takeScreenShot("Send Notification");
		System.out.println("Send Notification clicked");

	}
	
	
	
	

	public void clickButtonBackSettings() {

		try {

			if (btnSettingsNavigateUp().isDisplayed()) {
				btnSettingsNavigateUp().click();
				System.out.println("User Navigate Back");
				Thread.sleep(5000);
			}

		} catch (Exception ex) {
			System.out.println("Exception in Naivigation Back:" + ex.getMessage());
		}
	}
	
	public void SelectMySurveys() throws InterruptedException, IOException {

		try {
			Base.scrolltoElement("My Surveys");
			optionMySurveys().click();
			Thread.sleep(8000);
			Base.takeScreenShot("My Surveys");
			System.out.println("My Surveys clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
	

	public void SelectMyHistory() throws InterruptedException, IOException {

		try {
			Base.scrolltoElement("My History");
			optionMyHistory().click();
			Thread.sleep(8000);
			Base.takeScreenShot("My History");
			System.out.println("My History clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void SelectVisitorManagement() throws InterruptedException, IOException {

		Base.scrolltoElement("Visitor Management");
		Base.takeScreenShot("Visitor Management");
		optionVisitorManagement().click();
		Thread.sleep(5000);
		System.out.println("Visitor Management Selected");

	}

}
