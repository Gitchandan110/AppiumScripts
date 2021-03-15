package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_SetTimerPO;

public class SK_SetTimerBL extends SK_SetTimerPO{

	String TestCaseSheet = "TestCase";
	
	public void SetTimer() {
		
		try {

			if (btnSetTimer().isDisplayed()) { 
				System.out.println("Set Timer Button displayed");
				Base.takeScreenShot("Timer Screen");
				btnSetTimer().click();
				Thread.sleep(3000);
				Base.takeScreenShot("Timer Screen");
				System.out.println("Set Timer clicked");

			} else {

				System.out.println("Set Timer not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Set Timer button:" + ex.getMessage());
		}

	}

	
	
public void Set5Minute() {
	
	try {

		if (btnSet().isDisplayed()) {
			btnSet().click();
			System.out.println("Set 5 Minute button clicked");
			Thread.sleep(20000);
			Base.takeScreenShot("Timer Screen");
			ExcelUtils.WriteExcel(TestCaseSheet, 31, 1, "Pass");
			System.out.println("Current Time is :"+ Base.GetDateTime());
			System.out.println("Please wait for 7 Minutes");
			Thread.sleep(420000);
			Base.takeScreenShot("Timer Screen");
			System.out.println("Current Time is :"+ Base.GetDateTime());
			ExcelUtils.WriteExcel(TestCaseSheet, 32, 1, "Pass");

		} else {

			System.out.println("Set button not clicked");
		}

	} catch (Exception ex) {

		System.out.println("Exception in Set button:" + ex.getMessage());
	}

}

}


	

