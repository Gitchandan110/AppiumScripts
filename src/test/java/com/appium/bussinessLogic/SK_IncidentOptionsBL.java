package com.appium.bussinessLogic;

import com.appium.pageobject.SK_IncidentOptionsPO;

public class SK_IncidentOptionsBL extends SK_IncidentOptionsPO {

	public void clickPhotoIncident() {

		try {

			if (btnPhotoAudioLocationIncident().isDisplayed()) {
				btnPhotoAudioLocationIncident().click();
				System.out.println("Photo Incident selected");
			}

		} catch (Exception ex) {
			System.out.println("Exception in Photo Incident:" + ex.getMessage());
		}
	}

	public void clickAudioIncident() {

		try {

			if (btnAudioLocationIncident().isDisplayed()) {
				btnAudioLocationIncident().click();
				System.out.println("Audio Location Incident selected");
			}

		} catch (Exception ex) {
			System.out.println("Exception in Audio Incident:" + ex.getMessage());
		}
	}

	public void clickVideoLocationIncident() {

		try {

			if (btnVideoLocationIncident().isDisplayed()) {
				btnVideoLocationIncident().click();
				System.out.println("Video Location Incident selected");
			}

		} catch (Exception ex) {
			System.out.println("Exception in Video Incident:" + ex.getMessage());
		}
	}
	
	public void clickButtonBack() {

		try {

			if (btnNavigateBack().isDisplayed()) {
				btnNavigateBack().click();
				System.out.println("User Navigate Back");
			}

		} catch (Exception ex) {
			System.out.println("Exception in Naivigation Back:" + ex.getMessage());
		}
	}
	
	

}
