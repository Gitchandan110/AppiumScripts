package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_OrganizationPO;

public class SK_OrganizationBL extends SK_OrganizationPO {

	String TestCaseSheet = "TestCase";
	
	public void fillOrgCode() {

		try {

			if (tbAddOrganization().isDisplayed()) {
				tbAddOrganization().sendKeys("CKORG");
				Base.takeScreenShot("OrgCode Screen");
				System.out.println("Org Code filed");
			} else {
				System.out.println("Org Code not filed");
			}
		} catch (Exception ex) {
			System.out.println("Exception in OrgCode:" + ex.getMessage());
		}
	}
	
	public void saveOrgCode() {

		try {

			if (btnConfirmOrganization().isDisplayed()) {
				btnConfirmOrganization().click();
				System.out.println("Org Code Saved");
				ExcelUtils.WriteExcel(TestCaseSheet, 15, 1, "Pass");
			} else {
				System.out.println("Org Code not Saved");
			}
		} catch (Exception ex) {
			System.out.println("Exception in Save OrgCode:" + ex.getMessage());
		}
	}
	
}


