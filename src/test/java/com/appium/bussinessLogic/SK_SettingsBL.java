package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_SettingsPO;

public class SK_SettingsBL extends SK_SettingsPO{
	
	
	public void logOutSK() {
		
		Base.scrolltoElement("Logout");
		logOutOption().click();
		logOutPopUpYes().click();
		System.out.println("Logout from the App");
		
}
	
	public void SelectGroupCallOption() throws InterruptedException {
		
		Base.scrolltoElement("Group Call");
		groupCallOption().click();
		Base.GetDateTime();
		Thread.sleep(10000);
		System.out.println("Group Call option clicked");
		Base.GetDateTime();
		
	}
	
	

	public void SelectIncidentOption() throws InterruptedException {
		
		Base.scrolltoElement("Incident Options");
		incidentOptions().click();
		Thread.sleep(10000);
		System.out.println("lncident option clicked");
		
		
	}
	

}
