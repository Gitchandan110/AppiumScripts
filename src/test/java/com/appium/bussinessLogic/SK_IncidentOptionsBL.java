package com.appium.bussinessLogic;

import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_IncidentOptionsPO;

public class SK_IncidentOptionsBL extends SK_IncidentOptionsPO {
	
	String TestCaseSheet = "TestCase";

	public void clickPhotoIncident() {

		try {

			if (btnPhotoAudioLocationIncident().isDisplayed()) {
				btnPhotoAudioLocationIncident().click();
				System.out.println("Photo Incident selected");
				 ExcelUtils.WriteExcel(TestCaseSheet, 22, 1);
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
				ExcelUtils.WriteExcel(TestCaseSheet, 23, 1);
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
				ExcelUtils.WriteExcel(TestCaseSheet, 24, 1);
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
