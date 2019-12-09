package com.appium.bussinessLogic;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_IncidentScreenPO;

public class SK_IncidentScreenBL extends SK_IncidentScreenPO{
	String TestCaseSheet = "TestCase";
	
	public void EndIncident() {

		try {

			if (btnEndIncident().isDisplayed()) {

				btnEndIncident().click();
				Thread.sleep(3000);
				System.out.println("End Incident button clicked");
		
			} else {

				System.out.println("End Incident button not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in End Incident button :" + ex.getMessage());

		}

	}
	
	
	
	public void SelectEndReason() {

		try {

			if (reasonEndIncident().isDisplayed()) {

				reasonEndIncident().click();
				 ExcelUtils.WriteExcel(TestCaseSheet, 25, 1);
				System.out.println("End Reson option clicked");
		
			} else {

				System.out.println("End Reson option not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in End Reason option:" + ex.getMessage());

		}

	}
	
	
	

}



