package com.appium.bussinessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_VisitorsPO;

public class SK_VisitorManagementBL extends SK_VisitorsPO {

	public void createNewVisitor() {

		try {

			if (btnAddVisitors() != null && btnAddVisitors().isDisplayed()) {
				Base.takeScreenShot("Visitor Management");
				btnAddVisitors().click();
				Thread.sleep(2000);
				System.out.println("btnAddVisitors() Clicked");
				tbMobileNumber().click();
				tbMobileNumber().sendKeys("0000789654");
				Base.takeScreenShot("Visitor Management");
				btnGo().click();
				tbFirstName().click();
				tbFirstName().sendKeys("VsAppium");
				tbLastName().click();
				tbLastName().sendKeys("SK");
				tbEmail().sendKeys("Vapp@yopmail.com");
				driver.hideKeyboard();
				tbCompanyName().sendKeys("VisCompany");
				driver.hideKeyboard();
				Base.takeScreenShot("Visitor Management");
				selectHostName().click();
				Base.takeScreenShot("Visitor Management");
				tbSerchHost().click();
				tbSerchHost().sendKeys("chandan");
				SelectHost().click();
				driver.hideKeyboard();
				btnNext().click();
				btnSafetyKuvrrApp().click();
				chkbxERP().click();
				chkbxMAP().click();
				Base.takeScreenShot("Visitor Management");
			//	passActivationDate().click();
			//	btnNextMonthCalendar().click();
			//	selectDate().click();
			//	btnOK().click();
				btnVisitorPassType().click();
				Base.takeScreenShot("Visitor Management");
				VisitorPassType().click();
				Thread.sleep(3000);
				Base.scrolltoElement("SEND VISITOR INVITE");
				Thread.sleep(3000);
				Base.takeScreenShot("Visitor Management");
				Thread.sleep(3000);
				btnSendInvite().click();
				Thread.sleep(3000);
				Base.takeScreenShot("Visitor Management");
				System.out.println("btnSendInvite() Clicked");
				Thread.sleep(5000);
				Base.takeScreenShot("Visitor Management");
				btnNavigateUP().click();

			}

		} catch (Exception ex) {

			System.out.println("Exception in clickNotificationTab() is :" + ex);

		}

	}

}
