package com.appium.bussinessLogic;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_PermissionPO;

public class SK_PermissionBL extends SK_PermissionPO{
	
	public void acceptPermissions() {
		
		try { 
			
	//	Base.waitFor300Seconds(BtnAllow());	
			
	 for(int i=0;i<4;i++) {
			
			if(BtnAllow().isDisplayed()) {
				
				BtnAllow().click();
				
				System.out.println("Device Permission accepted");

			} else {

				System.out.println("Quick Tips Closed");
			}
			
		}

		} catch (Exception ex) {

			System.out.println("Exception found :" + ex.getMessage());
		}

	}

}
