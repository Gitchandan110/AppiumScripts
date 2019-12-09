package com.appium.bussinessLogic;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_HomePagePO;

public class SK_HomePageBL extends SK_HomePagePO {
	
	String TestCaseSheet = "TestCase";

	public void startSOS() {

		try {

			if (btnSOS().isDisplayed()) {
				System.out.println("SOS button found");
				btnSOS().click();
				System.out.println("SOS started");
				 ExcelUtils.WriteExcel(TestCaseSheet, 20, 1);
				Thread.sleep(40000);
				 ExcelUtils.WriteExcel(TestCaseSheet, 21, 1);

			} else {

				System.out.println("SOS not started");
			}

		} catch (Exception ex) {

			System.out.println("Exception in SOS :" + ex.getMessage());

		}

	}

	public void startSafeWalk() {

		try {

			if (btnSafeWalk().isDisplayed()) {
				btnSafeWalk().click();
				Thread.sleep(40000);
				 ExcelUtils.WriteExcel(TestCaseSheet, 26, 1);
				System.out.println("SafeWalk started");

			} else {

				System.out.println("SafeWalk not started");
			}

		} catch (Exception ex) {

			System.out.println("Exception in SafeWalk :" + ex.getMessage());

		}
	}

	public void startTimer() {

		try {

			if (btnTimer().isDisplayed()) {

				btnTimer().click();
				System.out.println("Timer Button Clicked");
				Thread.sleep(5000);

			} else {

				System.out.println("Timer Button not Clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Timer button:" + ex.getMessage());

		}

	}

	public void startTips() {

		try {

			if (btnTips().isDisplayed()) {

				btnTips().click();
				System.out.println("Tips clicked");
				Thread.sleep(5000);

			} else {

				System.out.println("Tips Button not Clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Tips button:" + ex.getMessage());

		}
	}

	public void clickSetting() {

		try {
			if (btnSettings().isDisplayed()) {
				btnSettings().click();
				System.out.println("Setting Button Clicked");

			} else {

				System.out.println("Setting Button not found");
			}

		} catch (Exception ex) {

			System.out.println(ex.getMessage());
			System.out.println(ex.fillInStackTrace());
		}

	}

}
