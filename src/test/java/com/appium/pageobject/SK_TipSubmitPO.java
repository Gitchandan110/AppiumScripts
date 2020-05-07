package com.appium.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_TipSubmitPO extends Base {
	
	
	
	public MobileElement screenTipCategories() {

		By categories = By.id("com.safety.armourgrid:id/activity_category_recycler");
		return driver.findElement(categories);

	}
	
	public List<MobileElement> tipCategories() {

	
		By categories = By.id("com.safety.armourgrid:id/list_item_erplans_img");
		
		return driver.findElements(categories);

	}
	
	
	public MobileElement tipCategorie() {

		
		By categorie = By.id("com.safety.armourgrid:id/list_item_erplans_img");
		
		return driver.findElement(categorie);

	}
	
	
	public MobileElement navigateBack() {

		By Back = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(Back);

	}
	
	public MobileElement dropdownSelectCategories() {

		By ddCategories = By.id("android:id/text1");
		return driver.findElement(ddCategories);

	}
	
	public List<MobileElement> TipcategoriesList() {

		By category = By.id("android:id/text1");
		return driver.findElements(category);

	}
	
	
	public MobileElement dropdownGeofence() {

		By GeoFence = By.id("android:id/text1");
		return driver.findElement(GeoFence);

	}

	public MobileElement chkboxIncludeGeoLocation() {

		By GeoLocation = By.id("com.safety.armourgrid:id/tips_include_location");
		return driver.findElement(GeoLocation);

	}

	public MobileElement chkboxRemainAnonymous() {

		By Anonymous = By.id("com.safety.armourgrid:id/tips_remain_anon");
		return driver.findElement(Anonymous);

	}

	public MobileElement txtTipsDescription() {

		By Description = By.id("com.safety.armourgrid:id/tips_description");
		return driver.findElement(Description);

	}

	public MobileElement txtTipsName() {

		By TipsName = By.xpath("//android.widget.EditText[@text=\"Description/Names of Anyone Involved\"]");
		return driver.findElement(TipsName);

	}

	public MobileElement btnAttachMedia() {

		By AttachMedia = By.id("com.safety.armourgrid:id/tips_media_text");
		return driver.findElement(AttachMedia);

	}
	
	public MobileElement optionImageMedia() {

		By AttachMedia = By.xpath("//android.widget.TextView[@text=\"Image\"]");
		return driver.findElement(AttachMedia);

	}
	
	public MobileElement optionVideoMedia() {

		By AttachMedia = By.xpath("//android.widget.TextView[@text=\"Video\"]");
		return driver.findElement(AttachMedia);

	}
	
	public MobileElement optionAudioMedia() {

		By AttachMedia = By.xpath("//android.widget.TextView[@text=\"Audio\"]");
		return driver.findElement(AttachMedia);

	}

	public MobileElement btnSendTip() {

		By SendTip = By.id("com.safety.armourgrid:id/tips_send_button");
		return driver.findElement(SendTip);

	}

}
