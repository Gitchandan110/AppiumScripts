package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_IncidentScreenPO;

public class SK_IncidentScreenBL extends SK_IncidentScreenPO{
	String TestCaseSheet = "TestCase";
	
	public void EndIncident() {

		try {

			if (btnEndIncident().isDisplayed()) {
				Base.takeScreenShot("Incident Screen");
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
	
	public void clickCloseChat() {
		
		try {
			
			if(btnCloseChat() !=null && btnCloseChat().isDisplayed()) {
				Base.takeScreenShot("Incident Screen");
				btnCloseChat().click();
				System.out.println("Close Chat button clicked");
				
			}else { System.out.println("Close Chat button not found");
				
				}
		} catch (Exception ex) {
			
			System.out.println("Exception in clickCloseChat():" + ex);
			
		}
		
		
	}
	
	
	
	
	
	
	
	public void EndPicIncident() {

		try {

			if (btnEndPicIncident().isDisplayed()) {
				Base.takeScreenShot("Incident Screen");
				btnEndPicIncident().click();
				Thread.sleep(3000);
				System.out.println("End Pic Incident button clicked");
		
			} else {

				System.out.println("End Pic Incident button not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in End Pic Incident button :" + ex.getMessage());

		}

	}
	
	
	public void SelectEndReason() {

		try {

			if (reasonEndIncident().isDisplayed()) {
				Base.takeScreenShot("Incident Screen");
				reasonEndIncident().click();
				 ExcelUtils.WriteExcel(TestCaseSheet, 25, 1, "Pass");
				System.out.println("End Reson option clicked");
		
			} else {

				System.out.println("End Reson option not clicked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in End Reason option:" + ex.getMessage());

		}

	}
	
	
	

}



