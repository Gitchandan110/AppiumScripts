package com.appium.bussinessLogic;

import com.appium.pageobject.SK_IncidentOptionsPO;

public class SK_IncidentOptionsBL extends SK_IncidentOptionsPO {
	
	
	public void clickPhotoIncident() {
		
		try {
			
			if(btnPhotoAudioLocationIncident().isDisplayed()) {
				
				btnPhotoAudioLocationIncident().click();
				System.out.println("Photo Incident selected");
				
			}
		
		} catch (Exception ex) {
			
			System.out.println("Exception in Phot Incident:" + ex.getMessage());
		}
	}

}
