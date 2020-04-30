package com.appium.bussinessLogic;

import java.io.IOException;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_MembersGroupCallPO;

public class SK_MembersGroupCallBL extends SK_MembersGroupCallPO {

	public void ClickBtnVideoCall() throws InterruptedException, IOException {

		try {
			if (txtMembers().isDisplayed()) {

				System.out.println("Members Screen opened");
			}

			if (btnVideoCall() != null && btnVideoCall().isDisplayed()) {
				System.out.println("Video Call button found");
				btnVideoCall().click();
				Thread.sleep(30000);
				Base.takeScreenShot("Group call Screen");
				System.out.println("Video Call Started");

			} else {

				btnNavigateBack().click();
				System.out.println("Video Call button not found");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ClickBtnAudioCall() throws InterruptedException, IOException {

		try {
			if (btnAudioCall() != null && btnAudioCall().isDisplayed()) {
				btnAudioCall().click();
				Thread.sleep(30000);
				Base.takeScreenShot("Group call Screen");
				System.out.println("Audio Call Started");

			} else {

				btnNavigateBack().click();
				System.out.println("Audio Call button not found");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ClickBtnEndGrpCall() {

		if (btnEndGroupCall().isDisplayed()) {
			btnEndGroupCall().click();
			System.out.println("Group Call Ended");
		}
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
