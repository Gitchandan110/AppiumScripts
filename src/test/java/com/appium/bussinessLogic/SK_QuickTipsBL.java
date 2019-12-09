package com.appium.bussinessLogic;

import org.openqa.selenium.support.PageFactory;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_QuickTipsPO;

public class SK_QuickTipsBL extends SK_QuickTipsPO {
	
	SK_HomePageBL homepagebl=PageFactory.initElements(driver, SK_HomePageBL.class);
	
	
	String TestCaseSheet="TestCase";
	
	public void closeTips() {
		
		try {

			if (btnCloseTips().isDisplayed()) {
				
				
				btnCloseTips().click();
				System.out.println("Quick Tips Closed");
				ExcelUtils.WriteExcel(TestCaseSheet, 19, 1);
				Base.GetDateTime();
				Thread.sleep(20000);
				Base.GetDateTime();
				

			} else {

				System.out.println("Quick Tips Closed");
			}

		} catch (Exception ex) {

			System.out.println("Exception found :" + ex.getMessage());
		}

	}

}
