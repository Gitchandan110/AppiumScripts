package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_MembersGroupCallPO extends Base {

	public MobileElement btnVideoCall() {

		By VideoCall = By.id("com.safety.armourgrid:id/menu_call_video");
		return driver.findElement(VideoCall);

	}

	public MobileElement btnAudioCall() {

		By AudioCall = By.id("com.safety.armourgrid:id/menu_call_audio");
		return driver.findElement(AudioCall);

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
