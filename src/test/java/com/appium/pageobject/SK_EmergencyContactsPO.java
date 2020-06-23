package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_EmergencyContactsPO extends Base {

	
	public MobileElement btnAddEmergencyContact() {

		By AddEC = By.xpath("//android.widget.TextView[@content-desc=\"Add\"]");
		
	//	By AddEC = By.id("com.safety.armourgrid:id/add");
		return driver.findElement(AddEC);

	}

	
	public MobileElement tbFirstName() {

		By FirstName = By.id("com.safety.armourgrid:id/add_contact_first_name");
		return driver.findElement(FirstName);

	}

	public MobileElement tbLastName() {

		By LastName = By.id("com.safety.armourgrid:id/add_contact_last_name");
		return driver.findElement(LastName);

	}

	public MobileElement tbEmail() {

		By Email = By.id("com.safety.armourgrid:id/add_contact_email");
		return driver.findElement(Email);

	}

	public MobileElement tbPhoneNo() {

		By PhoneNumber = By.id("com.safety.armourgrid:id/add_contact_phone");
		return driver.findElement(PhoneNumber);

	}
	
	
	public MobileElement btnAutoFillAddressBook() {

	//	By AddressBook = By.id("com.safety.armourgrid:id/add_contact_auto_fill");
		
		By AddressBook = By.xpath("//android.widget.Button[@text=\"AUTO-FILL FROM AN ADDRESS BOOK ENTRY\"]");
		return driver.findElement(AddressBook);

	}
	

	public MobileElement btnSaveContact() {

		By SaveContact = By.id("com.safety.armourgrid:id/confirm");
		return driver.findElement(SaveContact);

	}

}
