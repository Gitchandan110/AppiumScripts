package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_MembersGroupCallPO extends Base {

	public MobileElement txtMembers() {

		By titleMember = By.xpath("//android.widget.TextView[@text=\"Members\"]");

		return driver.findElement(titleMember);

	}

	public MobileElement btnVideoCall() {

		try {
			By VideoCall = By.id("com.safety.armourgrid:id/menu_call_video");
			return driver.findElement(VideoCall);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public MobileElement btnAudioCall() {

		try {

			By AudioCall = By.id("com.safety.armourgrid:id/menu_call_audio");
			return driver.findElement(AudioCall);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public MobileElement btnEndGroupCall() {

		By EndCall = By.id("com.safety.armourgrid:id/button_hangup_call");

		return driver.findElement(EndCall);

	}

	public MobileElement btnNavigateBack() {

		By BtnBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

		return driver.findElement(BtnBack);

	}

}
