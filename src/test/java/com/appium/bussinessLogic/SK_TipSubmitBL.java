package com.appium.bussinessLogic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonutils.Base;
import com.appium.commonutils.ExcelUtils;
import com.appium.pageobject.SK_TipSubmitPO;

import io.appium.java_client.MobileElement;

public class SK_TipSubmitBL extends SK_TipSubmitPO {
	
	String TestCaseSheet = "TestCase";
	
	
	
	public void sendAnonymousTipByCategories() {
		try {

			if (screenTipCategories() != null && screenTipCategories().isDisplayed()) {
				System.out.println("Tip Categories found");
				Base.takeScreenShot("Tip Categories");
			}

			int CountTipCategory = tipCategories().size();
			System.out.println("Count TipCategory is" + CountTipCategory);

			for (int i = 0; i < CountTipCategory; i++) {

				tipCategories().get(i).click();
				enterTipsDescription();
				enterTipsName();
				SendTips();
			

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void sendNonAnonymousTipByCategories() {
		try {

			if (screenTipCategories() != null && screenTipCategories().isDisplayed()) {
				System.out.println("Tip Categories found");
				Base.takeScreenShot("Tip Categories");
			}

			int CountTipCategory = tipCategories().size();
			System.out.println("Count TipCategory is" + CountTipCategory);

			for (int i = 0; i < CountTipCategory; i++) {

				tipCategories().get(i).click();
				chkboxRemainAnonymous().click();
				enterTipsDescription();
				enterTipsName();
				selectMedia();
				SendTips();
			

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void enterTipsDescription() {

		try {

			if (txtTipsDescription().isDisplayed()) {
			//	Base.takeScreenShot("Tips Screen");
				txtTipsDescription().sendKeys("Be careful as criminals always carrying anything like Bomb, Knife, Gun, and they can do \r\n" + 
						"Gun Shot, Fire, Firing, Attack Terrorist, Attacking, Terror, Missile Attack, Threat, Trap, \r\n" + 
						"Snatch, Robbery, Bank Loot, Assault, Goon, Acid Attack, Stone Pelting.");
				
				System.out.println("Tips Description is filled");
				driver.hideKeyboard();
				System.out.println("Keyboard Hide");
				
			} else {

				System.out.println("Tips Description not filled");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Tips Description :" + ex.getMessage());

		}
	}

	public void enterTipsName() {
		
		/*	if (driver.isKeyboardShown() == true) {
		driver.hideKeyboard();
*/
		
	try {

			     	if (txtTipsName().isDisplayed()) {
					Base.takeScreenShot("Tips Screen");
					txtTipsName().sendKeys("Tips Name");
					System.out.println("Tips Name is filled");

				} else {

					System.out.println("Tips Name not filled");
				}
		
			
		} catch (Exception ex) {

			System.out.println("Exception in Tips Name:" + ex.getMessage());

		}
	}

	public void uncheckRemainAnonymous() {

		try {

			if (chkboxRemainAnonymous().isDisplayed()) {
				System.out.println("Remain Anonymous status is:" + chkboxRemainAnonymous().getAttribute("checked"));
				chkboxRemainAnonymous().click();
				Base.takeScreenShot("Tips Screen");
				System.out.println("Remain Anonymous uncheked");

			} else {

				System.out.println("Remain Anonymous not uncheked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Remain Anonymous :" + ex.getMessage());

		}

	}

	public void selectIncludeGeoLocation() {

		try {

			if (chkboxIncludeGeoLocation().isDisplayed()) {

				System.out
						.println("Include Geolocation status is:" + chkboxIncludeGeoLocation().getAttribute("checked"));

				chkboxIncludeGeoLocation().click();
				Base.takeScreenShot("Tips Screen");
				System.out.println("Include GeoLocation checked");

			} else {

				System.out.println("Include GeoLocation not checked");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Include GeoLocation :" + ex.getMessage());

		}

	}

	public void SendTips() {

		try {

			if (btnSendTip().isDisplayed()) {
				Base.takeScreenShot("Tips Screen");
				btnSendTip().click();
				Thread.sleep(5000);
				ExcelUtils.WriteExcel(TestCaseSheet, 43, 1, "Pass");
				System.out.println("Tips Send");

			} else {

				System.out.println("Tips Not sent");
			}

		} catch (Exception ex) {

			System.out.println("Exception in Send Tips :" + ex.getMessage());

		}

	}
	
	
	public void selectTipCategoriesDropDown() throws InterruptedException {
		try {

			if (screenTipCategories() != null && screenTipCategories().isDisplayed()) {
				System.out.println("Tip Categories found");
				Base.takeScreenShot("Tip Categories");
				tipCategorie().click();
				Thread.sleep(3000);

				if (dropdownSelectCategories() != null && dropdownSelectCategories().isDisplayed()) {
					dropdownSelectCategories().click();
					System.out.println("Tip Categories drop down found");
					Base.takeScreenShot("Tip Categories");
				}

				int CountTipCategory = TipcategoriesList().size();
				System.out.println("Count TipCategory is : " + CountTipCategory);

				for (int i = 0; i < CountTipCategory; i++) {
					
				String CategoryName=driver.findElement(By.xpath("//android.widget.CheckedTextView[@index=\"["+ i +"]\"]")).getText();
				System.out.println("tip Category Name is :" + CategoryName);
				driver.findElement(By.xpath("//android.widget.CheckedTextView[@index=\"["+ i +"]\"]")).click();
				dropdownSelectCategories().click();

				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void selectMedia() {

		try {
                Base.scrolltoElement("Attach Media (Limit 10MB)");
			if (btnAttachMedia() !=null && btnAttachMedia().isDisplayed()) {
				btnAttachMedia().click();
				Thread.sleep(2000);
				optionImageMedia().click();

			} else {

				System.out.println("selectMedia() done");
			}

		} catch (Exception ex) {

			System.out.println("Exception in selectMedia() :" + ex.getMessage());

		}

	}
	
	

}
