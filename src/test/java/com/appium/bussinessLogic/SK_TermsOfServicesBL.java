package com.appium.bussinessLogic;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_TermsOfServicesPO;

public class SK_TermsOfServicesBL extends SK_TermsOfServicesPO {

	String TestCaseSheet = "TestCase";

	public void verifyTitleTermsOfServices() {

		try {

			if (titleTermsofServices().isDisplayed()) {

				System.out.println("Title of Terms of Service Screen is :" + titleTermsofServices().getText());
				Base.takeScreenShot("Terms of Service");
				Assert.assertEquals(titleTermsofServices().getText(), "Terms of Service", "Title Does not match");
				System.out.println("Assertion pass: Title Matched");
				ExcelUtils.WriteExcel(TestCaseSheet, 1, 1, "Pass");

			} else {

				System.out.println("Title is Missing");

			}

		} catch (Exception ex) {

			System.out.println("Exception in Title is:" + ex.getMessage());

		}

	}
	
	
	
	
	
	public void acceptTermsOfServices() {

		try {

			if (AcceptTerms().isDisplayed()) {
				
				Base.takeScreenShot("AcceptTerms Screen");
				AcceptTerms().click();
				ExcelUtils.WriteExcel(TestCaseSheet, 8, 1, "Pass");
				System.out.println("Terms Of Services is accepted");
				ExcelUtils.WriteExcel(TestCaseSheet, 10, 1, "Pass");

			} else {

				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOf(AcceptTerms()));

				System.out.println("Terms Of Services is not accepted");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Accepting Terms Of Services is :" + ex.getMessage());
		}

	}

}
