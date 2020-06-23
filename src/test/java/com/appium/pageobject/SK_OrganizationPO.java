package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_OrganizationPO extends Base {

	public MobileElement tbAddOrganization() {

		By AddOrganization = By.id("com.safety.armourgrid:id/add_org_edit");

		return driver.findElement(AddOrganization);

	}

	public MobileElement btnConfirmOrganization() {

		By confirmOrganization = By.id("com.safety.armourgrid:id/confirm");
		return driver.findElement(confirmOrganization);
	}

	public MobileElement optionUpdateOrganization() {

		// By updateOrg=By.id("com.safety.armourgrid:id/settings_organizations_add_pro");

		By updateOrg = By.xpath("//android.widget.TextView[@text=\"Update Organization\"]");

		return driver.findElement(updateOrg);
	}

	public MobileElement tbAddNewOrganization() {

		// By updateOrg=By.id("com.safety.armourgrid:id/add_pro_code_edit");

		By updateOrg = By.xpath("//android.widget.EditText[@text=\"Enter new organization details\"]");

		return driver.findElement(updateOrg);

	}

	public MobileElement btnSaveOrganization() {

		// By SaveOrg=By.id("com.safety.armourgrid:id/confirm");

		By SaveOrg = By.xpath("//android.widget.TextView[@content-desc=\"Confirm\"]");

		return driver.findElement(SaveOrg);
	}

	public MobileElement popupSaveOrganization() {

		// By SaveOrg=By.id("android:id/button1");

		By SaveOrg = By.xpath("//android.widget.Button[@text=\"SAVE\"]");

		return driver.findElement(SaveOrg);
	}

	public MobileElement btnNavigateUp() {

		By NavigateUp = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(NavigateUp);

	}

}
