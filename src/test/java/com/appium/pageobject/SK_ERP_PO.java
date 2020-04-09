package com.appium.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_ERP_PO extends Base {

	public MobileElement erpEarthquick() {

		try {

			// By.xpath("Class[@text=\"xyz\"]")
			By earthQuick = By.xpath("//android.widget.TextView[@text=\"Earthquick\"]");
			return driver.findElement(earthQuick);
		} catch (Exception ex) {
			System.out.println("po:" + ex);
		}
		return null;
	}

	public List<MobileElement> optionEarthquick() {

		By option = By.id("com.safety.armourgrid:id/list_item_erplan_info_state");

		return driver.findElements(option);

	}

	public MobileElement btnAcknowledge() {

		By Acknowledge = By.id("com.safety.armourgrid:id/send_acknowledgement_button");
		return driver.findElement(Acknowledge);

	}
	
	public MobileElement btnNavigateUP() {

		By BtnNavigate = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(BtnNavigate);

	}


}