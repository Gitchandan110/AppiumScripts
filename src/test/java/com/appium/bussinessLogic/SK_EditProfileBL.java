package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_EditProfilePO;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class SK_EditProfileBL extends SK_EditProfilePO {

	String TestCaseSheet = "TestCase";

	public void EditProfile() {

		try {
			if (txtFirstName().isDisplayed()) {
				txtFirstName().click();
				txtFirstName().sendKeys("Moto");
				System.out.println(" Edit txtFirstName()");

			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
			}

			if (txtLastName().isDisplayed()) {
				txtLastName().click();
				txtLastName().sendKeys("Chandan");
				System.out.println(" Edit txtLastName()");

			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
			}

			if (txtMobileNumber().isDisplayed()) {
				txtMobileNumber().click();
				txtMobileNumber().sendKeys("0815161349");
				System.out.println(" Edit txtMobileNumber()");

			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
			}

			if (txtSafeWord().isDisplayed()) {
				txtSafeWord().click();
				txtSafeWord().sendKeys("CKG");
				System.out.println(" Edit txtSafeWord()");

			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				Base.takeScreenShot("Edit Profile");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fillAdditionalInfo() {

		try {

			if (btnAdditionalInfo().isDisplayed()) {
				Base.scrolltoElement("Additional Info");
				btnAdditionalInfo().click();
				System.out.println("Additional Info selected");

			}

			/*
			 * MobileElement DOB = (MobileElement)
			 * driver.findElement(MobileBy.AndroidUIAutomator(
			 * "new UiScrollable(new UiSelector()).scrollIntoView(" +
			 * "new UiSelector().text(\"01/11/2001\"));"));
			 * 
			 * 
			 * if (txtDateOfBirth().isDisplayed()) { txtDateOfBirth().click();
			 * txtDateOfBirth().sendKeys("01/11/2001"); System.out.println(" DOB entered");
			 * 
			 * 
			 * if (driver.isKeyboardShown() == true) { driver.hideKeyboard();
			 * 
			 * }
			 * 
			 * }
			 */

			Base.scrolltoElement("Date of Birth:");

			if (txtDateOfBirth().isDisplayed()) {
				txtDateOfBirth().click();
				txtDateOfBirth().sendKeys("01/11/2001");
				System.out.println(" DOB entered");

			}
			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();

			}

			if (txtGender().isDisplayed()) {
				txtGender().click();
				txtGender().click();
				txtGender().sendKeys("M");
				System.out.println("Gender entered");
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();

				// Base.scrolltoElement("Weight");
				if (txtWeight().isDisplayed()) {
					txtWeight().click();
					txtWeight().sendKeys("55");
					System.out.println("Weight entered");
				}

			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtHeight().isDisplayed()) {
					txtHeight().click();
					txtHeight().sendKeys("6.5");
					System.out.println("Height entered");
				}

			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtHairColor().isDisplayed()) {
					txtHairColor().click();
					txtHairColor().sendKeys("Black");
					System.out.println("Hair color filled");
				}

			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtEyeColor().isDisplayed()) {
					txtEyeColor().click();
					txtEyeColor().sendKeys("Black");
					System.out.println("Eye color filled");
				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				Base.takeScreenShot("Edit Profile");
				if (txtAddress().isDisplayed()) {
					txtAddress().click();
					txtAddress().sendKeys("Vaishali Ghaziabad");
					System.out.println("Address filled");
				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtCity().isDisplayed()) {
					txtCity().click();
					txtCity().sendKeys("Gautam Budh Nagar");
					System.out.println("City filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtState().isDisplayed()) {
					txtState().click();
					txtState().sendKeys("UTTAR PRADESH");
					System.out.println("State filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtZip().isDisplayed()) {
					txtZip().click();
					txtZip().sendKeys("201010");
					System.out.println("ZIP Code filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtAutoMake().isDisplayed()) {
					txtAutoMake().click();
					txtAutoMake().sendKeys("BMW");
					System.out.println("Auto Maker filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtAutoModel().isDisplayed()) {
					txtAutoModel().click();
					txtAutoModel().sendKeys("BMW 2019");
					System.out.println("Auto Model filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				Base.takeScreenShot("Edit Profile");
				if (txtAutoColor().isDisplayed()) {
					txtAutoColor().click();
					txtAutoColor().sendKeys("Black");
					System.out.println("Auto Color filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtAutoYear().isDisplayed()) {
					txtAutoYear().click();
					txtAutoYear().sendKeys("2019");
					System.out.println("Auto Year filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtAutoLicence().isDisplayed()) {
					txtAutoLicence().click();
					txtAutoLicence().sendKeys("20202206");
					System.out.println("Auto Licence filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtAutoLicenceState().isDisplayed()) {
					txtAutoLicenceState().click();
					txtAutoLicenceState().sendKeys("Texsas");
					System.out.println("Auto Licence State filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtMedicAlertInfo().isDisplayed()) {
					txtMedicAlertInfo().click();
					txtMedicAlertInfo().sendKeys("Medic Alert Bracelet");
					System.out.println("Medic Alert filled");

				}
			}

			if (driver.isKeyboardShown() == true) {
				driver.hideKeyboard();
				if (txtAdaConsiderations().isDisplayed()) {
					txtAdaConsiderations().click();
					txtAdaConsiderations().sendKeys(
							"The Americans with Disabilities Act gives civil rights protections to individuals with disabilities similar to those provided to individuals on the basis of race, color, sex, national origin, age, and religion. It guarantees equal opportunity for individuals with disabilities in public accommodations, employment, transportation, State and local government services, and telecommunications.");
					System.out.println("Ada Consideration filled");

				}
			}

			if (btnSaveProfile().isDisplayed()) {
				btnSaveProfile().click();
				Base.takeScreenShot("Edit Profile");
				Thread.sleep(7000);
				System.out.println("Profile Saved");
				ExcelUtils.WriteExcel(TestCaseSheet, 18, 1, "Pass");
			}

			else {

				System.out.println("Profile not Saved");
			}

		} catch (Exception ex) {

			System.out.println("Exception in edit profile is:" + ex.getMessage());
		}

	}
}
