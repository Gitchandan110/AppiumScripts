package com.appium.bussinessLogic;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_ERP_PO;

import io.appium.java_client.MobileElement;

public class SK_ERPBL extends SK_ERP_PO {

	String TestCaseSheet = "TestCase";

	public void SelectEarthquickERP() {

		try {

			if (erpEarthquick().isDisplayed()) {
				System.out.println("EarthQuick Plan displayed");
				erpEarthquick().click();
				Thread.sleep(10000);
				System.out.println("EarthQuick Plan clicked");

			} else {

				System.out.println("EarthQuick Plan not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EarthQuick Plan:" + ex.getMessage());
		}

	}

	public void clickEarthquickOption() {

		int optionCount = optionEarthquick().size();
		System.out.println("Earthquick Option count is : " + optionCount);
		
		for (int i = 0; i < optionCount; i++) {
			
		optionEarthquick().get(i).click();
		
		}
		
	}

	public void clickBtnAcknowledge() {

		try {

			if (btnAcknowledge().isDisplayed()) {
				System.out.println("Acknowledge button is displayed");
				btnAcknowledge().click();
				Thread.sleep(5000);
				System.out.println("ERP Acknowledge done");

			} else {

				System.out.println("ERP Acknowledge not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ERP Acknowledge:" + ex.getMessage());
		}

	}
	
	public void clickBtnNavigateUP() {

		try {

			if (btnNavigateUP().isDisplayed()) {
				System.out.println("NavigateUP button is displayed");
				btnNavigateUP().click();
				Thread.sleep(5000);
				System.out.println("NavigateUP done");

			} else {

				System.out.println("NavigateUP button not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in NavigateUP button:" + ex.getMessage());
		}

	}
	
}
