package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_HomePagePO;

public class SK_HomePageBL extends SK_HomePagePO {
	
	String TestCaseSheet = "TestCase";

	public void startSOS() {

		try {

			if (btnSOS().isDisplayed()) {
				System.out.println("SOS button found");
				Base.takeScreenShot("Home Screen");
				btnSOS().click();
				System.out.println("SOS started");
				Thread.sleep(3000);
				Base.takeScreenShot("SOS Screen");
				 ExcelUtils.WriteExcel(TestCaseSheet, 20, 1, "Pass");
				Thread.sleep(40000);
				 ExcelUtils.WriteExcel(TestCaseSheet, 21, 1, "Pass");

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
				Thread.sleep(7000);
				Base.takeScreenShot("WalkSafe Screen");
				Thread.sleep(40000);
				 ExcelUtils.WriteExcel(TestCaseSheet, 26, 1, "Pass");
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
				Base.takeScreenShot("Timer Screen");

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

	public void start911() {

		try {

			if (btn911().isDisplayed()) {
				btn911().click();
				System.out.println("911 Started");
				Thread.sleep(5000);
				Base.takeScreenShot("911 Screen");

			} else {

				System.out.println("911 Not Started");
			}

		} catch (Exception ex) {

			System.out.println("Exception in 911 :" + ex.getMessage());

		}
	}
	
	public void OpenMAP() {

		try {

			if (btnMaps().isDisplayed()) {
				btnMaps().click();
				System.out.println("Map Open");
				Thread.sleep(5000);
				Base.takeScreenShot("Map Screen");

			} else {

				System.out.println("Map Not Open");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Map :" + ex.getMessage());

		}
	}
	
	
	public void OpenERP() {

		try {

			if (btnPlans().isDisplayed()) {
				btnPlans().click();
				System.out.println("ERP Open");
				Thread.sleep(10000);
				Base.takeScreenShot("ERP Screen");

			} else {

				System.out.println("ERP Not Open");
			}

		} catch (Exception ex) {

			System.out.println("Exception in ERP :" + ex.getMessage());

		}
	}
	
	public void switchCamera() {

		try {

			if (btnRotateCamera().isDisplayed()) {

				btnRotateCamera().click();
				System.out.println("Camera rotated");
				Thread.sleep(3000);

			} else {

				System.out.println("Camera not rotated");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Camera Rotation :" + ex.getMessage());

		}
	}
	
	
	
	public void clickSetting() {

		try {
			if (btnSettings().isDisplayed()) {
				btnSettings().click();
				System.out.println("Setting Button Clicked");
				Thread.sleep(3000);
				Base.takeScreenShot("Setting Screen");

			} else {

				System.out.println("Setting Button not found");
			}

		} catch (Exception ex) {

			System.out.println(ex.getMessage());
			System.out.println(ex.fillInStackTrace());
		}

	}

}
