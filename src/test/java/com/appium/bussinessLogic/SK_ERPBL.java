package com.appium.bussinessLogic;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_ERP_PO;

import io.appium.java_client.MobileElement;

public class SK_ERPBL extends SK_ERP_PO {

	String TestCaseSheet = "TestCase";

	public void SelectEarthquakeERP() {

		try {

			if (erpEarthquake().isDisplayed()) {
				System.out.println("EarthQuake Plan displayed");
				erpEarthquake().click();
				Thread.sleep(10000);
				System.out.println("EarthQuake Plan clicked");
				Base.takeScreenShot("ERP Screen");

			} else {

				System.out.println("EarthQuake Plan not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in EarthQuake Plan:" + ex.getMessage());
		}

	}

	public void clickEarthQuakeOption() {

		int optionCount = optionEarthQuake().size();
		System.out.println("EarthQuake Option count is : " + optionCount);
		
		for (int i = 0; i < optionCount; i++) {
			
			optionEarthQuake().get(i).click();
		
		}
		
	} 
	
	
	

	public void clickBtnAcknowledge() {

		try {

			if (btnAcknowledge().isDisplayed()) {
				Base.takeScreenShot("ERP Screen");
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
