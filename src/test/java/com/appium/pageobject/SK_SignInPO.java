package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_SignInPO extends Base {

	public MobileElement Email() {
		
		By emailId = By.id("com.safety.armourgrid:id/login_edit_email");
		return driver.findElement(emailId);
	}
	
	public MobileElement editCountryCode() {
		
		try {
			By countrycode = By.id("com.safety.armourgrid:id/login_edit_country_code");
		//	By countrycode = By.xpath("//android.widget.EditText[@text='Country Code']");
			return driver.findElement(countrycode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
	
	public MobileElement SelectCountryScreen() {
		
		By selectCountry = By.xpath("//android.widget.TextView[@text='Select Country']");
		return driver.findElement(selectCountry);
	}
	
	public MobileElement countryCodeIndia() {
		
		By countrycodeIndia = By.xpath("//android.widget.TextView[@text='India(+91)']");
		return driver.findElement(countrycodeIndia);
	}
	

	public MobileElement mobileNumber() {
		
		try {
			By mobilenumber = By.id("com.safety.armourgrid:id/login_edit_mobile_number");
			return driver.findElement(mobilenumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	
	
	public MobileElement Password() {

		By password = By.id("com.safety.armourgrid:id/login_edit_password");
    	return driver.findElement(password);

	}
	
	public MobileElement Submit() {

		By submit = By.id("com.safety.armourgrid:id/login_button_submit");
		return driver.findElement(submit);

	}	

	public MobileElement popupLoginError() {

		By error = By.xpath("//android.widget.TextView[@text='Error']");
		return driver.findElement(error);

	}
	
	public MobileElement btnOKLoginError() {

		By btnOK = By.xpath("//android.widget.Button[@text='OK']");
		return driver.findElement(btnOK);

	}

	public MobileElement ForgetPassword() {

		By forgetPassword = By.id("com.safety.armourgrid:id/login_button_forgot_password");
		return driver.findElement(forgetPassword);

	}
	
	public MobileElement screenVerifySecurityCode() {

		try {
			By securityCode = By.xpath("//android.widget.TextView[@text='Verify Security Code']");
			return driver.findElement(securityCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public MobileElement txtSecurityCode() {

		try {
			By securityCode = By.id("com.safety.armourgrid:id/otp_edit");
			return driver.findElement(securityCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public MobileElement btnSubmitSecurityCode() {

		By submitbutton = By.id("com.safety.armourgrid:id/otp_button_submit");
		return driver.findElement(submitbutton);

	}
	
	public MobileElement btnResendSecurityCode() {

		By submitbutton = By.id("com.safety.armourgrid:id/otp_resend_text");
		return driver.findElement(submitbutton);

	}
	
	
}
