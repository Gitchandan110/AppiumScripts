package com.appium.bussinessLogic;

import org.openqa.selenium.support.PageFactory;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_PrivacyPolicyPO;
import com.appium.pageobject.SK_SignInPO;

public class SK_PrivacyPolicyBL extends SK_PrivacyPolicyPO {
	
	String TestCaseSheet = "TestCase";
	
	SK_SignInPO signinpo=PageFactory.initElements(driver, SK_SignInPO.class);

	public void acceptPrivacyPolicy() {

		try {

			if (btnAcceptPrivacyPolicy().isDisplayed()) {

				btnAcceptPrivacyPolicy().click();
				ExcelUtils.WriteExcel(TestCaseSheet, 9, 1, "Pass");
				System.out.println("Privacy Policy Accepted");
			    ExcelUtils.WriteExcel(TestCaseSheet, 11, 1, "Pass");
			    System.out.println("Please wait for 20 seconds");
			    Thread.sleep(20000);
			 
			   
				

			} else {

				System.out.println("Privacy Policy not Accepted");
			}

		} catch (Exception ex) {

			System.out.println("Exception found :" + ex.getMessage());
		}

	}

}
