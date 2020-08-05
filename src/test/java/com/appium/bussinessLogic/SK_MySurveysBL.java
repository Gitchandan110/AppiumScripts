package com.appium.bussinessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_MySurveysPO;

public class SK_MySurveysBL extends SK_MySurveysPO {

	public void SubmitMySurveys() {

		try {

			if (HeaderMysurveys() != null && HeaderMysurveys().isDisplayed()) {
				System.out.println("My Survey Screen Opened");
				Base.takeScreenShot("My Surveys");
				PastScreen().click();
				Thread.sleep(3000);
				Base.takeScreenShot("My Surveys");
				CurrentScreen().click();
				Thread.sleep(3000);
				

				if (surveyTitle() != null && surveyTitle().isDisplayed()) {
					System.out.println("Current Surveys is available");
					Base.scrolltoElement("Shortness of Breath or Difficulty Breath Cough");
					radioBtnYes().click();
					Base.scrolltoElement("Fever Headache Chills");
					radioBtnYes().click();
					Base.scrolltoElement("Sore Throat");
					radioBtnYes().click();
					Base.scrolltoElement("Loss of Taste or Smell");
					radioBtnYes().click();
					Base.scrolltoElement("Muscle Pain");
					radioBtnYes().click();
					
					Base.scrolltoElement("Nasal Congestion");
					radioBtnYes().click();
					
					Base.scrolltoElement("Diarrhea");
					radioBtnYes().click();
					
					Base.scrolltoElement("Fatigue");
					radioBtnYes().click();
					
					Base.scrolltoElement("2. Have you had a fever at or above 100 degrees Fahrenheit or taken any fever-reducing medications (e.g., Tylenol or Advil) within in the last 72 hours?");
					radioBtnYes().click();	
				
					
					Base.scrolltoElement("3. Do you have reason to believe that you, or anyone with whom you've had close contact, may have been exposed to Covid-19 in the past 14 days?");
					radioBtnYes().click();
					
					Base.Scrolldown();
					txtbxCountry().click();
					txtbxCountry().sendKeys("India, France, Germany");
					Base.takeScreenShot("My Surveys");
					
				//	btnSubmit().click();
				//	Thread.sleep(3000);		
				//	Base.takeScreenShot("My Surveys");
				//	Thread.sleep(5000);	

					/*
					 * int totalRadioButton=RadioBtnYes().size();
					 * System.out.println("Total Number of Yes Radio Button is : " +
					 * totalRadioButton); for (int i=0; i < totalRadioButton; i++) {
					 * RadioBtnYes().get(i).click(); Base.scrolltoElement("Yes");
					 */
				}
			}

		} catch (Exception ex) {

			System.out.println("Exception in SubmitMySurveys is :" + ex);

		}

	}

}
