package com.appium.bussinessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_MyHistoryPO;

public class SK_MyHistoryBL extends SK_MyHistoryPO{
	
	
	public void verifyNotificationTab() {
		
		try {
			
		if(tabNotifications() !=null && tabNotifications().isDisplayed()) {
		
			tabNotifications().click();
			Thread.sleep(3000);
			Base.takeScreenShot("My History");
			
			int CountNotification=itemNotifications().size();
			System.out.println("Notification Count is :" + CountNotification);
			
			for (int i=0; i < CountNotification; i++) {
				
					
			//	WebElement frame=driver.findElement(By.xpath("//android.widget.LinearLayout[@index=\"["+ i +"]\"]"));
				dateNotification().click();
				String NotificationDate=dateNotification().getText();
				System.out.println("Notification Date is : " + NotificationDate);
				Notification().click();
				String BroadCastMessage=Notification().getText();
				System.out.println("BroadCast Message is : " + BroadCastMessage);
				btnDismissBroadcast().click();
				Thread.sleep(3000);
			
			
			
				
			}
	
			
			
		}
			
			
			
			
		} catch (Exception ex) {
			
			System.out.println("Exception in clickNotificationTab() is :" + ex);
			
		}
		
		
		
		
		
	}

}
