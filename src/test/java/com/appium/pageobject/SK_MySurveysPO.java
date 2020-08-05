package com.appium.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_MySurveysPO extends Base {

	public MobileElement HeaderMysurveys() {

		By HeaderMysurveys = By.xpath("//android.widget.TextView[@text=\"My Surveys\"]");

		return driver.findElement(HeaderMysurveys);

	}

	public MobileElement surveyTitle() {

		By HeaderMysurveys = By.xpath("//android.widget.TextView[@text=\"COVID-19 Screening Questionnaire\"]");

		// com.safety.armourgrid:id/fragment_current_survey_title

		return driver.findElement(HeaderMysurveys);

	}

	public MobileElement surveyScreen() {

		By surveyScreen = By.id("com.safety.armourgrid:id/fragment_current_survey_layout");

		return driver.findElement(surveyScreen);

	}

	public MobileElement surveyDescription() {

		By surveyDescription = By.id("com.safety.armourgrid:id/fragment_current_survey_desc");

		return driver.findElement(surveyDescription);

	}

	public MobileElement radioBtnYes() {

		By Yes = By.xpath("//android.widget.RadioButton[@text=\"Yes\"]");

		return driver.findElement(Yes);

	}
	
/*	public List<MobileElement> RadioBtnYes() {

		By Yes = By.xpath("//android.widget.RadioButton[@text=\"Yes\"]");

		return driver.findElements(Yes);

	}*/
	
	
	
	
	

	public MobileElement radioBtnNo() {

		By No = By.xpath("//android.widget.RadioButton[@text=\"No\"]");

		return driver.findElement(No);

	}

	public MobileElement txtbxCountry() {

		By CountryName = By.id("com.safety.armourgrid:id/list_survey_text_edit");

		return driver.findElement(CountryName);

	}

	public MobileElement btnSubmit() {

		By btnSubmit = By.id("com.safety.armourgrid:id/list_survey_button_submit");

		return driver.findElement(btnSubmit);

	}
	
	public MobileElement CurrentScreen() {

		By CurrentScreen = By.xpath("//android.widget.TextView[@text=\"CURRENT\"]");
		return driver.findElement(CurrentScreen);

	}

	public MobileElement PastScreen() {

		By PastScreen = By.xpath("//android.widget.TextView[@text=\"PAST\"]");
		return driver.findElement(PastScreen);

	}

	public MobileElement btnNavigateBack() {

		By BtnBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

		return driver.findElement(BtnBack);

	}

}
