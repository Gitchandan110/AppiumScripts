package com.appium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_EditProfilePO extends Base {

	public WebElement txtFirstName() {

		By FirstName = By.id("com.safety.armourgrid:id/edit_profile_edit_firstname");
		return driver.findElement(FirstName);

	}

	public WebElement txtLastName() {

		By LastName = By.id("com.safety.armourgrid:id/edit_profile_edit_lastname");
		return driver.findElement(LastName);
	}

	public WebElement txtMobileNumber() {
		By MobileNumber = By.id("com.safety.armourgrid:id/edit_profile_edit_phone");
		return driver.findElement(MobileNumber);
	}

	public WebElement txtSafeWord() {

		By SafeWord = By.id("com.safety.armourgrid:id/edit_profile_edit_safeWord");
		return driver.findElement(SafeWord);
	}

	public WebElement txtEmail() {

		By Email = By.id("com.safety.armourgrid:id/edit_profile_edit_email");

		return driver.findElement(Email);
	}

	public WebElement txtConfirmEmail() {

		By ConfirmEmail = By.id("com.safety.armourgrid:id/edit_profile_edit_confirm_email");
		return driver.findElement(ConfirmEmail);
	}

	
	public WebElement btnAdditionalInfo() {

		By AdditionalInfo = By.id("com.safety.armourgrid:id/edit_profile_more");
		return driver.findElement(AdditionalInfo);
	}
	
	public WebElement frameAdditionalInfo() {

		By FrameAdditionalInfo = By.id("com.safety.armourgrid:id/edit_profile_extra_container");
		return driver.findElement(FrameAdditionalInfo);
	}
	
	public WebElement txtDateOfBirth() {

		By DOB = By.id("com.safety.armourgrid:id/edit_profile_edit_dob");
	
		return driver.findElement(DOB);
	}

	public WebElement txtGender() {

	   By Gender = By.id("com.safety.armourgrid:id/edit_profile_edit_gender");
		
		return driver.findElement(Gender);
	}

	public WebElement txtWeight() {

		By Weight = By.id("com.safety.armourgrid:id/edit_profile_edit_weight");
		return driver.findElement(Weight);
	}

	public WebElement txtHeight() {

		By Height = By.id("com.safety.armourgrid:id/edit_profile_edit_height");
		return driver.findElement(Height);
	}

	public WebElement txtHairColor() {

		By HairColor = By.id("com.safety.armourgrid:id/edit_profile_edit_hair");
		return driver.findElement(HairColor);
	}

	public WebElement txtEyeColor() {

		By EyeColor = By.id("com.safety.armourgrid:id/edit_profile_edit_eyes");
		return driver.findElement(EyeColor);
	}

	public WebElement txtAddress() {

		By Address = By.id("com.safety.armourgrid:id/edit_profile_edit_address");
		return driver.findElement(Address);
	}

	public WebElement txtCity() {

		By City = By.id("com.safety.armourgrid:id/edit_profile_edit_city");
		return driver.findElement(City);
	}

	public WebElement txtState() {

		By State = By.id("com.safety.armourgrid:id/edit_profile_edit_state");
		return driver.findElement(State);
	}

	public WebElement txtZip() {

		By State = By.id("com.safety.armourgrid:id/edit_profile_edit_zip");
		return driver.findElement(State);
	}

	public WebElement txtCountry() {

		By Country = By.id("com.safety.armourgrid:id/edit_profile_edit_country");
		return driver.findElement(Country);
	}

	public WebElement txtAutoMake() {

		By AutoMake = By.id("com.safety.armourgrid:id/edit_profile_edit_autoMake");
		return driver.findElement(AutoMake);
	}

	public WebElement txtAutoModel() {

		By AutoModel = By.id("com.safety.armourgrid:id/edit_profile_edit_autoModel");
		return driver.findElement(AutoModel);
	}

	public WebElement txtAutoColor() {

		By AutoColor = By.id("com.safety.armourgrid:id/edit_profile_edit_autoColor");
		return driver.findElement(AutoColor);
	}

	public WebElement txtAutoYear() {

		By AutoYear = By.id("com.safety.armourgrid:id/edit_profile_edit_autoYear");
		return driver.findElement(AutoYear);
	}

	public WebElement txtAutoLicence() {

		By AutoLicence = By.id("com.safety.armourgrid:id/edit_profile_edit_autoLicense");
		return driver.findElement(AutoLicence);
	}

	public WebElement txtAutoLicenceState() {

		By AutoLicenceState = By.id("com.safety.armourgrid:id/edit_profile_edit_autoLicenseState");
		return driver.findElement(AutoLicenceState);
	}

	public WebElement txtMedicAlertInfo() {

		By MedicAlertInfo = By.id("com.safety.armourgrid:id/edit_profile_edit_medicAlertInfo");
		return driver.findElement(MedicAlertInfo);
	}

	public WebElement txtAdaConsiderations() {

		By AdaConsiderations = By.id("com.safety.armourgrid:id/edit_profile_edit_adaConsiderations");
		return driver.findElement(AdaConsiderations);
	}
	
	public WebElement btnSaveProfile() {

		By SaveProfile = By.id("com.safety.armourgrid:id/confirm");

		return driver.findElement(SaveProfile);
	}
	
	public WebElement btnChangePassword() {

		By ChangePassword = By.id("com.safety.armourgrid:id/edit_profile_change_password");

		return driver.findElement(ChangePassword);
	}
	

}
