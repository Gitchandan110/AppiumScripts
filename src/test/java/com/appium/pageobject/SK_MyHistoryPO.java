package com.appium.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_MyHistoryPO extends Base {

	public MobileElement tabNotifications() {

		// By MyHistory = By.id("com.safety.armourgrid:id/settings_history");

		By Notifications = By.xpath("//android.widget.TextView[@text=\"NOTIFICATIONS\"]");

		return driver.findElement(Notifications);

	}
	
	public List<MobileElement> frameNotification(){
		
		By frame=By.xpath("//android.widget.LinearLayout[@index=\"0\"]");
		return driver.findElements(frame);
		
	}
	
	public MobileElement dateNotification() {

		// By MyHistory = By.id("com.safety.armourgrid:id/settings_history");
		By Date = By.id("com.safety.armourgrid:id/incident_history_item_date");
		return driver.findElement(Date);

	}
	
	
	public List<MobileElement> itemNotifications() {

		// By MyHistory = By.id("com.safety.armourgrid:id/settings_history");
		By Item = By.id("com.safety.armourgrid:id/incident_history_item_status");
		return driver.findElements(Item);

	}
	
	public MobileElement Notification() {

		// By MyHistory = By.id("com.safety.armourgrid:id/settings_history");
		By Not = By.id("com.safety.armourgrid:id/incident_history_item_status");
		return driver.findElement(Not);

	}
	

	public MobileElement btnDismissBroadcast() {

		By Dismiss = By.id("com.safety.armourgrid:id/dismiss_button");
		return driver.findElement(Dismiss);

	}

	public MobileElement tabEvents() {

		// By MyHistory = By.id("com.safety.armourgrid:id/settings_history");

		By Events = By.xpath("//android.widget.TextView[@text=\"EVENTS\"]");

		return driver.findElement(Events);

	}

	public MobileElement btnSettingsNavigateUp() {

		By NavigateUp = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(NavigateUp);

	}

}