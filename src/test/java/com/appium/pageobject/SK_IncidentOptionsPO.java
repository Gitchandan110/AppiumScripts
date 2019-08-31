package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_IncidentOptionsPO extends Base {

	public MobileElement btnAutoStartIncident() {

		By AutoSatartIncident = By.id("com.safety.armourgrid:id/incident_options_auto_start_switch");

		return driver.findElement(AutoSatartIncident);

	}

	public MobileElement btnVideoAudioLocationIncident() {

		By VideoAudioLocationIncident = By.id("com.safety.armourgrid:id/incident_options_send_video_audio_location");

		return driver.findElement(VideoAudioLocationIncident);

	}

	public MobileElement btnPhotoAudioLocationIncident() {

		By PhotoAudioLocationIncident = By.id("com.safety.armourgrid:id/incident_options_send_photos_audio_location");

		return driver.findElement(PhotoAudioLocationIncident);

	}

	public MobileElement btnAudioLocationIncident() {

		By AudioLocationIncident = By.id("com.safety.armourgrid:id/incident_options_send_audio_location");

		return driver.findElement(AudioLocationIncident);

	}

	public MobileElement btnVideoLocationIncident() {

		By VideoLocationIncident = By.id("com.safety.armourgrid:id/incident_options_send_video_location");

		return driver.findElement(VideoLocationIncident);

	}

	public MobileElement btnNavigateBack() {

		By BtnBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

		return driver.findElement(BtnBack);

	}

}
