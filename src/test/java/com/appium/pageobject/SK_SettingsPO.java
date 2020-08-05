package com.appium.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_SettingsPO extends Base {

	public MobileElement eventOptions() {

		By EventOptions = By.id("com.safety.armourgrid:id/settings_incident_options");
		
		return driver.findElement(EventOptions);

	}

	public MobileElement optionPanicButton() {

		By PanicButton = By.id("com.safety.armourgrid:id/settings_panic_button");
		return driver.findElement(PanicButton);

	}

	public MobileElement optionProfile() {

		By Profile = By.id("com.safety.armourgrid:id/settings_profile");
		return driver.findElement(Profile);

	}

	public MobileElement optionOrganization() {

		By Organization = By.id("com.safety.armourgrid:id/settings_organizations");
		return driver.findElement(Organization);

	}

	public MobileElement optionEmergencyContacts() {

		By EmergencyContact = By.id("com.safety.armourgrid:id/settings_contacts");
		return driver.findElement(EmergencyContact);

	}
	
	public MobileElement optionMySurveys() {

		By MySurveys = By.xpath("//android.widget.TextView[@text=\"My Surveys\"]");
		//com.safety.armourgrid:id/settings_survey
		return driver.findElement(MySurveys);

	}
	
	
	

	public MobileElement optionMyHistory() {

		//By MyHistory = By.id("com.safety.armourgrid:id/settings_history");
		
		By MyHistory=By.xpath("//android.widget.TextView[@text=\"My History\"]");
		
		return driver.findElement(MyHistory);

	}
	
	public MobileElement tabNotifications() {

		//By MyHistory = By.id("com.safety.armourgrid:id/settings_history");
		
		By Notifications=By.xpath("//android.widget.TextView[@text=\"NOTIFICATIONS\"]");
		
		return driver.findElement(Notifications);

	}
	
	public List<MobileElement> itemNotifications() {

		//By MyHistory = By.id("com.safety.armourgrid:id/settings_history");
		
		By Item=By.id("com.safety.armourgrid:id/incident_history_item_status");
		
		return driver.findElements(Item);

	}
	
	public MobileElement btnDismissBroadcast() {

		By Dismiss=By.id("com.safety.armourgrid:id/dismiss_button");
		
		return driver.findElement(Dismiss);

	}
	
		
	public MobileElement tabEvents() {

		//By MyHistory = By.id("com.safety.armourgrid:id/settings_history");
		
		By Events=By.xpath("//android.widget.TextView[@text=\"EVENTS\"]");
		
		return driver.findElement(Events);

	}
	

	public MobileElement optionIncidentResponsePlan() {

		By IRP = By.id("com.safety.armourgrid:id/settings_plan");
		return driver.findElement(IRP);

	}

	public MobileElement optionGroupCall() {

		By GRPCALL = By.id("com.safety.armourgrid:id/settings_group_call");
		return driver.findElement(GRPCALL);

	}

	public MobileElement optionMap() {

		By MAP = By.id("com.safety.armourgrid:id/settings_map");
		return driver.findElement(MAP);

	}
	
	
	public MobileElement optionVisitorManagement() {

		By optionVisitorManagement = By.id("com.safety.armourgrid:id/settings_visitors");
		return driver.findElement(optionVisitorManagement);

	}
	
	public MobileElement optionSendNotification() {

		By optionSendNotification = By.id("com.safety.armourgrid:id/settings_notification");
		return driver.findElement(optionSendNotification);

	}
	
	public MobileElement optionTutorial() {

		By Tutorial = By.id("com.safety.armourgrid:id/settings_tutorial");
		return driver.findElement(Tutorial);

	}

	public MobileElement optionPrivacyPolicy() {

		By PP = By.id("com.safety.armourgrid:id/settings_privacy");
		return driver.findElement(PP);

	}

	public MobileElement optionTermsOfServices() {

		By TS = By.id("com.safety.armourgrid:id/settings_tou");
		return driver.findElement(TS);

	}

	public MobileElement optionLogOut() {

		By LogOut = By.id("com.safety.armourgrid:id/settings_logout");
		return driver.findElement(LogOut);

	}
	
	public MobileElement popupLogOut() {

		By LogOutYes = By.id("android:id/button1");
		return driver.findElement(LogOutYes);

	}
	
	public MobileElement btnSettingsNavigateUp() {

		By NavigateUp = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(NavigateUp);
	
	}

}