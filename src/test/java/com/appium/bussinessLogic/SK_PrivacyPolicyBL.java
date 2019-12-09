package com.appium.bussinessLogic;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_PrivacyPolicyPO;

public class SK_PrivacyPolicyBL extends SK_PrivacyPolicyPO {
	
	String TestCaseSheet = "TestCase";

	public void acceptPrivacyPolicy() {

		try {

			if (btnAcceptPrivacyPolicy().isDisplayed()) {

				btnAcceptPrivacyPolicy().click();
				ExcelUtils.WriteExcel(TestCaseSheet, 9, 1);
				System.out.println("Privacy Policy Accepted");
				
				ExcelUtils.WriteExcel(TestCaseSheet, 11, 1);

			} else {

				System.out.println("Privacy Policy not Accepted");
			}

		} catch (Exception ex) {

			System.out.println("Exception found :" + ex.getMessage());
		}

	}

}
