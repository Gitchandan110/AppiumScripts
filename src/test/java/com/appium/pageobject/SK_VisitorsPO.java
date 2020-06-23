package com.appium.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_VisitorsPO extends Base {

	public MobileElement btnAddVisitors() {

		By addVisitor = By.id("com.safety.armourgrid:id/menu_buttons_add");
		return driver.findElement(addVisitor);

	}

	public MobileElement tbCountryCode() {

		By CountryCode = By.id("com.safety.armourgrid:id/new_visitor_edit_country_code");
		return driver.findElement(CountryCode);

	}

	public MobileElement tbMobileNumber() {

		By tbMobileNumber = By.id("com.safety.armourgrid:id/new_visitor_edit_mobile_number");
		return driver.findElement(tbMobileNumber);

	}

	public MobileElement btnGo() {

		By btnGo = By.id("com.safety.armourgrid:id/new_visitor_button_go");
		return driver.findElement(btnGo);

	}

	public MobileElement btnNavigateUP() {

		By BtnNavigate = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(BtnNavigate);

	}

	public MobileElement tbFirstName() {

		By tbFirstName = By.id("com.safety.armourgrid:id/new_visitor_edit_first_name");
		return driver.findElement(tbFirstName);

	}

	public MobileElement tbLastName() {

		By tbLastName = By.id("com.safety.armourgrid:id/new_visitor_edit_last_name");
		return driver.findElement(tbLastName);

	}

	public MobileElement tbEmail() {

		By tbEmail = By.id("com.safety.armourgrid:id/new_visitor_edit_email");
		return driver.findElement(tbEmail);

	}

	public MobileElement tbCompanyName() {

		By tbCompanyName = By.id("com.safety.armourgrid:id/new_visitor_edit_company_name");
		return driver.findElement(tbCompanyName);

	}

	public MobileElement selectHostName() {

		By selectHostName = By.id("com.safety.armourgrid:id/new_visitor_edit_host_name");
		return driver.findElement(selectHostName);

	}

	public MobileElement tbSerchHost() {

		By tbSerchHost = By.id("com.safety.armourgrid:id/search_src_text");
		return driver.findElement(tbSerchHost);

	}

	public MobileElement SelectHost() {

		By SelectHost = By.xpath("//android.widget.TextView[@text=\"chandan kumar, chandan.kumar@netsutra.com\"]");
		return driver.findElement(SelectHost);

	}

	public MobileElement btnNext() {

		By btnNext = By.id("com.safety.armourgrid:id/new_visitor_button_next");
		return driver.findElement(btnNext);

	}

	public MobileElement btnSafetyKuvrrApp() {

		By rbtnSafetyKuvrr = By.id("com.safety.armourgrid:id/new_visitor_radio_app");
		return driver.findElement(rbtnSafetyKuvrr);

	}

	public MobileElement chkbxERP() {

		By chkbxERP = By.id("com.safety.armourgrid:id/new_visitor_checkbox_erp");
		return driver.findElement(chkbxERP);

	}

	public MobileElement chkbxMAP() {

		By chkbxMAP = By.id("com.safety.armourgrid:id/new_visitor_checkbox_map");
		return driver.findElement(chkbxMAP);

	}

	public MobileElement passActivationDate() {

		By passActivationDate = By.id("com.safety.armourgrid:id/new_visitor_edit_active_date");
		return driver.findElement(passActivationDate);

	}

	public MobileElement btnNextMonthCalendar() {

		By btnNextMonthCalendar = By.xpath("//android.widget.ImageButton[@conteny-desc=\"Next month\"]");
		return driver.findElement(btnNextMonthCalendar);

	}

	public MobileElement selectDate() {

		By selectDate = By.xpath("//android.view.View[@text=\"1\"]");
		return driver.findElement(selectDate);

	}

	public MobileElement btnOK() {

		By btnOK = By.xpath("//android.widget.Button[@text=\"OK\"]");
		return driver.findElement(btnOK);

	}

	public MobileElement btnVisitorPassType() {

		By btnVisitorPassType = By.id("com.safety.armourgrid:id/new_visitor_edit_pass_type");
		return driver.findElement(btnVisitorPassType);

	}

	public MobileElement VisitorPassType() {

		By VisitorPassType = By.xpath("//android.widget.TextView[@text=\"VP_10AM_8PM_365Days\"]");
		return driver.findElement(VisitorPassType);

	}

	public MobileElement btnSendInvite() {

		By btnSendInvite = By.id("com.safety.armourgrid:id/new_visitor_button_send");
		return driver.findElement(btnSendInvite);

	}

}
