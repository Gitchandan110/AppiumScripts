package com.appium.bussinessLogic;

import org.testng.Assert;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_LaunchPO;

public class SK_LaunchBL extends SK_LaunchPO {

	String TestCaseSheet = "TestCase";

	public void verifyTitleSafetyKuvrr() {

		try {

			if (titleSafetyKuvrr().isDisplayed()) {

				System.out.println("Title of Launch Screen is :" + titleSafetyKuvrr().getText());
				Base.takeScreenShot("Launch Screen");
				Assert.assertEquals(titleSafetyKuvrr().getText(), "Safety Kuvrr", "Title Does not match");
				System.out.println("Assertion pass: Title Matched");
				ExcelUtils.WriteExcel(TestCaseSheet, 1, 1, "Pass");

			} else {

				System.out.println("Title is Missing");

			}

		} catch (Exception ex) {

			System.out.println("Exception in Title is:" + ex.getMessage());

		}

	}

	public void verifyKuvrrImage() {

		try {

			if (KuvrrImage() != null && KuvrrImage().isDisplayed()) {
				System.out.println("KuvrrImage Found");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Title is:" + ex.getMessage());

		}

	}

	public void clickBtnSignIn() {

		try {

			if (BtnSignIn().isDisplayed()) {
				Base.takeScreenShot("Launch Screen");
				ExcelUtils.WriteExcel(TestCaseSheet, 2, 1, "Pass");
				BtnSignIn().click();
				System.out.println("SignIn Button Clicked");
				ExcelUtils.WriteExcel(TestCaseSheet, 4, 1, "Pass");

			}

			else {

				System.out.println("SignIn Button not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in SignIn :" + ex.getStackTrace());
			System.out.println("Exception in SignIn :" + ex.getMessage());
		}

	}

	public void clickBtnNewAccount() {

		try {

			if (BtnNewAccount().isDisplayed()) {
				System.out.println("New Account Button Found");
				Base.takeScreenShot("Launch Screen");
				ExcelUtils.WriteExcel(TestCaseSheet, 3, 1, "Pass");
				// BtnSignIn().click();
				BtnNewAccount().click();
				System.out.println("New Account Button Clicked");
				ExcelUtils.WriteExcel(TestCaseSheet, 5, 1, "Pass");

			}

			else {

				System.out.println("New Account Button not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in New Account :" + ex.getStackTrace());
			System.out.println("Exception in New Account :" + ex.getMessage());
		}

	}

}
