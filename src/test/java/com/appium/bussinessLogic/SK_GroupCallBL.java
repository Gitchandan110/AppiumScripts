package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_GroupCallPO;

public class SK_GroupCallBL extends SK_GroupCallPO {

	public void ClickBtnGroupListName() {

		try {
			   Base.waitFor30Seconds(btnGroupCallActiveList());
		
		/*	if (btnSubscribeGroupCall().isDisplayed()){
				System.out.println("Subscribe group call button found");
				btnSubscribeGroupCall().click();
				System.out.println("User is Subscribed for group call");
			}*/
			
			if (btnGroupCallActiveList().isDisplayed()) {
				System.out.println("Group call list found : " + btnGroupCallList().getText());
				
				System.out.println("Subscribed on : " + txtSubscribedOn().getText());
				
				System.out.println("Device ID : " + txtDeviceId().getText());
				
				System.out.println("Push ID : " + txtPushId().getText());
				
				
				btnGroupCallActiveList().click();
				Thread.sleep(3000);
			    System.out.println("Group call button clicked");
				Base.takeScreenShot("Group Call Screen");
			}

		} catch (Exception ex) {

			System.out.println(ex);
		}

	}
}