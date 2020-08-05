package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_SendNotificationPO;

public class SK_SendNotificationBL extends SK_SendNotificationPO {

	String TestCaseSheet = "TestCase";
	
	public void verifySendNotification() {

		try {

			if (ddSelectTemplate().isDisplayed()) {
				ddSelectTemplate().click();
				Thread.sleep(3000);
				Base.takeScreenShot("Send Notification");
				System.out.println("ddSelectTemplate() Clicked");
				} else {
				System.out.println("ddSelectTemplate() not Clicked");
			}
			
			    TemplateAutomation().click();
			    System.out.println("TemplateAutomation() Clicked");
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


