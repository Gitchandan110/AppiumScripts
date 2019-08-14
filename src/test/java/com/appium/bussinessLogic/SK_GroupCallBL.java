package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_GroupCallPO;

public class SK_GroupCallBL extends SK_GroupCallPO {

	public void ClickBtnGroupListName() {

		try {
			   Base.waitFor30Seconds(btnGroupCallList());
		
			if (btnGroupCallList().isDisplayed()) {
				
				System.out.println("Group call button found"+btnGroupCallList().getText());
				btnGroupCallList().click();
				btnGroupCallActiveList().click();
				System.out.println("Group call button clicked");
			}

		} catch (Exception ex) {

			System.out.println(ex);
		}

	}
}