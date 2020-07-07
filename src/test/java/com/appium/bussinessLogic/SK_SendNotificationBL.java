package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_SendNotificationPO;

public class SK_SendNotificationBL extends SK_SendNotificationPO {

	String TestCaseSheet = "TestCase";
	
	public void SendNotification() {

		try {

			if (ddSelectTemplate().isDisplayed()) {
				ddSelectTemplate().click();
				Thread.sleep(3000);
				Base.takeScreenShot("Send Notification");
				System.out.println("Send Notification Clicked");
				} else {
				System.out.println("Send Notification not Clicked");
			}
			
			    TemplateSelectedUser().click();
			    System.out.println("TemplateSelectedUser() Clicked");
		    	btnNext().click();
		    	Base.takeScreenShot("Send Notification");
		    	Base.scrolltoElement("NEXT");
		      	Base.takeScreenShot("Send Notification");
		    	btnNextSendNotification().click();
		    	Base.takeScreenShot("Send Notification");
		    	btnSendNotification().click();
		    	Thread.sleep(5000);
		    	btnNavigateUp().click();
			
			
		} catch (Exception ex) {
			System.out.println("Exception in Send Notification:" + ex.getMessage());
		}
	}
	
	
}


