package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_GroupCallPO extends Base{
	
	
	
	public MobileElement btnGroupCallList() {
		
	By BtnGroupList=By.id("com.safety.armourgrid:id/list_group_name");	
		
	return driver.findElement(BtnGroupList);
	
	}
	
	public MobileElement btnGroupCallActiveList() {
		
	
	//    By BtnActiveList=By.id("com.safety.armourgrid:id/groups_recycler_view");
	    
	    By BtnActiveList=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
		
	    return driver.findElement(BtnActiveList);
	
	
	}

	public MobileElement btnSubscribeGroupCall() {
		
	By SubscribeButton=By.id("com.safety.armourgrid:id/btn_subscribe");	
		
	return driver.findElement(SubscribeButton);
	
	
	

		
		
		
	}
	

}
