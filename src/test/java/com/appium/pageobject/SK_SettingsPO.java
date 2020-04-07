package com.appium.pageobject;

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

	public MobileElement optionIncidentHistory() {

		By IncidentHistory = By.id("com.safety.armourgrid:id/settings_history");
		return driver.findElement(IncidentHistory);

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
	
	public MobileElement btnNavigateBack() {

		By BtnBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(BtnBack);
	
	}

}