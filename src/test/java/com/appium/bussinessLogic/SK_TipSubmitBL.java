package com.appium.bussinessLogic;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_TipSubmitPO;

public class SK_TipSubmitBL extends SK_TipSubmitPO {
	
	String TestCaseSheet = "TestCase";

	public void enterTipsDescription() {

		try {

			if (txtTipsDescription().isDisplayed()) {

				txtTipsDescription().sendKeys("Tips Description");

				System.out.println("Tips Description is filled");

			} else {

				System.out.println("Tips Description not filled");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Tips Description :" + ex.getMessage());

		}
	}

	public void enterTipsName() {

		try {

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();

				if (txtTipsName().isDisplayed()) {

					txtTipsName().sendKeys("Tips Name");

					System.out.println("Tips Name is filled");

				} else {

					System.out.println("Tips Name not filled");
				}

			}
		} catch (Exception ex) {

			System.out.println("Exception in Tips Name:" + ex.getMessage());

		}
	}

	public void uncheckRemainAnonymous() {

		try {

			if (chkboxRemainAnonymous().isDisplayed()) {

				System.out.println("Remain Anonymous status is:" + chkboxRemainAnonymous().getAttribute("checked"));

				chkboxRemainAnonymous().click();

				System.out.println("Remain Anonymous uncheked");

			} else {

				System.out.println("Remain Anonymous not uncheked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Remain Anonymous :" + ex.getMessage());

		}

	}

	public void selectIncludeGeoLocation() {

		try {

			if (chkboxIncludeGeoLocation().isDisplayed()) {

				System.out
						.println("Include Geolocation status is:" + chkboxIncludeGeoLocation().getAttribute("checked"));

				chkboxIncludeGeoLocation().click();

				System.out.println("Include GeoLocation checked");

			} else {

				System.out.println("Include GeoLocation not checked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Include GeoLocation :" + ex.getMessage());

		}

	}

	public void SendTips() {

		try {

			if (btnSendTip().isDisplayed()) {

				btnSendTip().click();
				Thread.sleep(5000);
				ExcelUtils.WriteExcel(TestCaseSheet, 43, 1, "Pass");
				System.out.println("Tips Send");

			} else {

				System.out.println("Tips Not sent");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Send Tips :" + ex.getMessage());

		}

	}

}
