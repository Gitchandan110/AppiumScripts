package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_SendNotificationPO extends Base {
	
	
	public MobileElement chkboxCreateNewTemplate() {

		By chkboxCreateNewTemplate = By.id("com.safety.armourgrid:id/send_notify_radio_create_template");

		return driver.findElement(chkboxCreateNewTemplate);

	}

	public MobileElement ddSelectTemplate() {

		By ddSelectTemplate = By.id("com.safety.armourgrid:id/send_notify_edit_template_name");

		return driver.findElement(ddSelectTemplate);

	}

	public MobileElement TemplateAutomation() {

		By TemplateAutomation = By.xpath("//android.widget.TextView[@text=\"Automation Template\"]");

		return driver.findElement(TemplateAutomation);

	}

	public MobileElement btnNext() {

		By btnNext = By.id("com.safety.armourgrid:id/send_notify_button_temp_next");
		return driver.findElement(btnNext);

	}
	
	public MobileElement btnNextSendNotification() {

		By btnNext = By.xpath("//android.widget.Button[@text=\"NEXT\"]");
		return driver.findElement(btnNext);

	}
	
	public MobileElement btnSendNotification() {

		By btnSend = By.id("com.safety.armourgrid:id/send_notify_button_send");
		return driver.findElement(btnSend);

	}
	
	
	public MobileElement btnNavigateUp() {

		By NavigateUp = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(NavigateUp);

	}

}
