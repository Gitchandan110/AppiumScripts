package com.appium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_IncidentScreenPO extends Base {

	public MobileElement btnEndIncident() {

		By EndIncident = By.id("com.safety.armourgrid:id/streaming_ongoing_end");
		return driver.findElement(EndIncident);

	}
	
	public MobileElement btnEndPicIncident() {

		By EndIncident = By.id("com.safety.armourgrid:id/incident_ongoing_end");
		return driver.findElement(EndIncident);

	}
	

	public MobileElement btnChat() {
		By Chat = By.id("com.safety.armourgrid:id/incident_ongoing_chat");
		return driver.findElement(Chat);

	}
	
	public MobileElement txtEditChat() {
	//	By EditChat = By.id("com.safety.armourgrid:id/chat_edit");
		By EditChat = By.xpath("//android.widget.EditText[@text=\"Message\"]");
		return driver.findElement(EditChat);
	}
	
	public MobileElement txtYesChat() {
		//	By Yes = By.id("com.safety.armourgrid:id/chat_yes");
			By Yes = By.xpath("//android.widget.TextView[@text=\"Yes\"]");
			return driver.findElement(Yes);
		}	
	
	public MobileElement txtNoChat() {
		//	By No = By.id("com.safety.armourgrid:id/chat_no");
			By No = By.xpath("//android.widget.TextView[@text=\"No\"]");
			return driver.findElement(No);
		}	
	
	
	public MobileElement txtMaybeChat() {
		//	By Maybe = By.id("com.safety.armourgrid:id/chat_maybe");
			By Maybe = By.xpath("//android.widget.TextView[@text=\"Maybe\"]");
			return driver.findElement(Maybe);
		}	
	
	
	
	public MobileElement btnCloseChat() {
	//	By CloseChat = By.id("com.safety.armourgrid:id/chat_close");
		
		By CloseChat = By.xpath("//android.widget.Button[@text=\"CLOSE\"]");
		return driver.findElement(CloseChat);

	}
	
	

	public MobileElement btnHideScreen() {
		By Hide = By.linkText("Hide");
		return driver.findElement(Hide);

	}
	
	
	public MobileElement btnHide() {
		By Hide = By.id("com.safety.armourgrid:id/incident_ongoing_hide");
		return driver.findElement(Hide);

	}

	public MobileElement reasonEndIncident() {
	

	//    By Reason = By.xpath("//android.widget.TextView[@text='Call Me']");
	//   By Reason = By.xpath("//android.widget.TextView[contains(@resource-id,'android:id/text1')]");
	    By Reason = By.xpath("//android.widget.TextView[@text='Call Me' and @index='2']");
		return driver.findElement(Reason);

	}

}
