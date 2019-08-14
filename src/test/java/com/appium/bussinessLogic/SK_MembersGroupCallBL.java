package com.appium.bussinessLogic;

import com.appium.pageobject.SK_MembersGroupCallPO;

public class SK_MembersGroupCallBL extends SK_MembersGroupCallPO {

	public void ClickBtnVideoCall() throws InterruptedException {

		if (btnVideoCall().isDisplayed()) {

			btnVideoCall().click();
			Thread.sleep(30000);
			System.out.println("Video Call Started");
		}
	}

	public void ClickBtnAudioCall() throws InterruptedException {

		if (btnAudioCall().isDisplayed()) {

			btnAudioCall().click();
			Thread.sleep(30000);
			System.out.println("Audio Call Started");
		}
	}

	public void ClickBtnEndGrpCall() {

		if (btnEndGroupCall().isDisplayed()) {
			btnEndGroupCall().click();
			System.out.println("Group Call Ended");
		}
	}

}
