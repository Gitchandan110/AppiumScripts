package com.appium.bussinessLogic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Objects;

import org.openqa.selenium.support.PageFactory;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_PermissionPO;
import com.appium.pageobject.SK_QuickTipsPO;
import com.appium.pageobject.SK_SignInPO;

import io.appium.java_client.MobileElement;

public class SK_SignInBL extends SK_SignInPO {
	
	
	SK_PermissionPO permissionpo=PageFactory.initElements(driver, SK_PermissionPO.class);
	
	String LoginDataSheet = "Login";
	String TestCaseSheet = "TestCase";
	
	
	public void EditCountryCode() {

		try {
			
			MobileElement element=editCountryCode();
			if (Objects.nonNull(element) && element.isDisplayed()) {
				element.click();
				System.out.println("Edit Country Code field clicked");
				Base.waitFor30Seconds(SelectCountryScreen());
				//assertTrue(SelectCountryScreen().isDisplayed());

			}

			else {

				System.out.println("Edit Country Code field not found");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Edit Country Code field:" + ex.getMessage());
			System.out.println("StackTrace in Edit Country Code field:" + ex.getStackTrace());
			System.out.println("ExceptionCause in Edit Country Code field:" + ex.getCause());
		}

	}
	
	public void SelectCountry() {

		try {

			if (SelectCountryScreen().isDisplayed()) {
				System.out.println("Select Country screen gets open");
				ExcelUtils.WriteExcel(TestCaseSheet, 7, 1, "Pass");
				Base.scrolltoElement("India(+91)");
			

			}

			else {

				System.out.println("Select Country Screen not found");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Select Country Screen:" + ex.getMessage());
			System.out.println("StackTrace in Select Country Screen:" + ex.getStackTrace());
			System.out.println("ExceptionCause in Select Country Screen:" + ex.getCause());
		}

	}

	public void SelectIndia() {

		try {

			if (countryCodeIndia().isDisplayed()) {
				System.out.println("India found");
				countryCodeIndia().click();
				ExcelUtils.WriteExcel(TestCaseSheet, 6, 1, "Pass");
			

			}

			else {

				System.out.println("India not found");
			}
		} catch (Exception ex) {

			System.out.println("Exception in selecting country is:" + ex.getMessage());
			System.out.println("StackTrace inselecting country is:" + ex.getStackTrace());
			System.out.println("ExceptionCause in selecting country is:" + ex.getCause());
		}

	}
	
	public void fillMobileNumber() {

		try {
			
			MobileElement element=mobileNumber();

			if (Objects.nonNull(element) && element.isDisplayed()) {
				System.out.println("Mobiel number field found");
				element.sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 2));
				System.out.println("Mobile Number is:"+ ExcelUtils.ReadExcel(LoginDataSheet, 1, 2));
				System.out.println("Mobile Number is entered");
				ExcelUtils.WriteExcel(TestCaseSheet, 8, 1, "Pass");

			}

			else {

				System.out.println("Mobile Number is not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Mobile Number:" + ex.getMessage());
			System.out.println("StackTrace in Mobile Number:" + ex.getStackTrace());
			System.out.println("ExceptionCause in Mobile Number:" + ex.getCause());
		}

	}
	
	public void clickSubmit() {

		try {

			if (Submit().isDisplayed()) {
				Submit().click();
				System.out.println("SignIn button Clicked");
				Base.GetDateTime();
				Base.waitFor30Seconds(permissionpo.BtnAllow());
		        Base.GetDateTime();
		        ExcelUtils.WriteExcel(TestCaseSheet, 6, 1, "Pass");
			}

			else {

				System.out.println("SignIn button Not Clicked");
			}
		} catch (Exception ex) {

			System.out.println("Exception in SignIn:" + ex.getMessage());
		}

	}
	
	
	public void verifySecurityCode() {

		try {

			if (txtSecurityCode()!=null && txtSecurityCode().isDisplayed()) {
				txtSecurityCode().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 3));
				btnSubmitSecurityCode().click();
				ExcelUtils.WriteExcel(TestCaseSheet, 11, 1, "Pass");
			}

			else {

				System.out.println("txtSecurityCode Not Clicked");
			}
		} catch (Exception ex) {

			System.out.println("Exception in txtSecurityCode:" + ex.getMessage());
		}

	}

	

	
	

	public void fillEmail() {

		try {

			if (Email().isDisplayed()) {
				System.out.println("Email Found");
				Email().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 0));
				System.out.println("Email is:"+ ExcelUtils.ReadExcel(LoginDataSheet, 1, 0));
				System.out.println("Email entered");

			}

			else {

				System.out.println("Email not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Email:" + ex.getMessage());
			System.out.println("StackTrace in Email:" + ex.getStackTrace());
			System.out.println("ExceptionCause in Email:" + ex.getCause());
		}

	}

	public void fillPassword() {

		try {

			if (Password().isDisplayed()) {
				Password().sendKeys(ExcelUtils.ReadExcel(LoginDataSheet, 1, 1));
				System.out.println("Password is :"+ ExcelUtils.ReadExcel(LoginDataSheet, 1, 1));
				System.out.println("Password entered");

			}

			else {

				System.out.println("Password not entered");
			}
		} catch (Exception ex) {

			System.out.println("Exception in Password:" + ex.getMessage());
		}

	}

	

}
