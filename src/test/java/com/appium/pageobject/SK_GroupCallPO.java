package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_GroupCallPO extends Base {

	public MobileElement btnGroupCallList() {

		By BtnGroupList = By.id("com.safety.armourgrid:id/list_group_name");

		return driver.findElement(BtnGroupList);

	}

	public MobileElement btnGroupCallActiveList() {

		// By BtnActiveList=By.id("com.safety.armourgrid:id/groups_recycler_view");

		/*By BtnActiveList = By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
*/
		By BtnActiveList =By.id("com.safety.armourgrid:id/list_group_active");
		
		return driver.findElement(BtnActiveList);

	}

	public MobileElement btnSubscribeGroupCall() {

		By SubscribeButton = By.id("com.safety.armourgrid:id/btn_subscribe");

		return driver.findElement(SubscribeButton);

	}

	public MobileElement btnNavigateBack() {

		By BtnBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

		return driver.findElement(BtnBack);

	}

	public MobileElement txtDeviceId() {

		By DeviceId = By.id("com.safety.armourgrid:id/activity_departments_device_id");

		return driver.findElement(DeviceId);

	}

	public MobileElement txtPushId() {

		By PushId = By.id("com.safety.armourgrid:id/activity_departments_push_id");

		return driver.findElement(PushId);

	}

	public MobileElement txtSubscribedOn() {

		By SubscribedOn = By.id("com.safety.armourgrid:id/activity_departments_date");

		return driver.findElement(SubscribedOn);

	}
	


}
