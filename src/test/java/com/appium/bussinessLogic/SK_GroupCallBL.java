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
				System.out.println("Group call list button found"+btnGroupCallList().getText());
				btnGroupCallActiveList().click();
			    System.out.println("Group call button clicked");
			}

		} catch (Exception ex) {

			System.out.println(ex);
		}

	}
}