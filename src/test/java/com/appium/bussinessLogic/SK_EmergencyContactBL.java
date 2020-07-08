package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_EmergencyContactsPO;

public class SK_EmergencyContactBL extends SK_EmergencyContactsPO {
	
	String TestCaseSheet = "TestCase";

	public void fillFirstName() {

		try {

			if (tbFirstName().isDisplayed()) { 
				tbFirstName().sendKeys("chandan");
				System.out.println("First Name filed");
			} else {
				System.out.println("First Name not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in FirstName:" + ex.getMessage());
		}
	}

	public void fillLastName() {

		try {

			if (tbLastName().isDisplayed()) {
				tbLastName().sendKeys("kumar");
				System.out.println("Last Name filed");
			} else {
				System.out.println("Last Name not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in LastName:" + ex.getMessage());
		}
	}

	public void fillEmail() {

		try {

			if (tbEmail().isDisplayed()) {
				tbEmail().sendKeys("chandan.kumar@netsutra.com");
				System.out.println("Email filled");
				if (driver.isKeyboardShown() == true) {
					driver.hideKeyboard();
					System.out.println("Hide Keyboard done");
				}
			} else {
				System.out.println("Email not filled");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Email:" + ex.getMessage());
		}
	}

	public void fillPhoneNumber() {

		try {

			if (tbPhoneNo().isDisplayed()) {
				tbPhoneNo().sendKeys("0815161349");
				System.out.println("Phone Number filed");
				Base.takeScreenShot("Emergency contact Screen");
			} else {
				System.out.println("Phone Number not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Phone Number:" + ex.getMessage());
		}
	}

	public void SaveEmergencyContact() {

		try {

			if (btnSaveContact().isDisplayed()) {
				btnSaveContact().click();
				System.out.println("Contact Saved");
				ExcelUtils.WriteExcel(TestCaseSheet, 16, 1, "Pass");
			} else {
				System.out.println("Contact not Saved");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Save Contact:" + ex.getMessage());
		}
	}

}
