package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_GroupCallPO extends Base{
	
	
	
	public MobileElement groupCall() {
		
	By GroupCall=By.id("com.safety.armourgrid:id/list_group_active");	
		
	return driver.findElement(GroupCall);
	
	}
	

	public MobileElement btnSubscribeGroupCall() {
		
	By SubscribeButton=By.id("com.safety.armourgrid:id/btn_subscribe");	
		
	return driver.findElement(SubscribeButton);
	
	
	

		
		
		
	}
	

}
