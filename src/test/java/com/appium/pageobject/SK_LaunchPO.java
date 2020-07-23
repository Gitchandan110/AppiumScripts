package com.appium.pageobject;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_LaunchPO extends Base {

	public MobileElement BtnSignIn() {

		By btnSignIn = By.id("com.safety.armourgrid:id/splash_login");
		return driver.findElement(btnSignIn);

	}

	public MobileElement BtnNewAccount() {

	//	By btnNewAccount = By.id("com.safety.armourgrid:id/splash_register");
		
		By btnNewAccount = By.xpath("//android.widget.Button[@text=\"NEW ACCOUNT]\"]");
		return driver.findElement(btnNewAccount);

	}
	
	
	public MobileElement titleSafetyKuvrr() {
		
		By Title= By.xpath("//android.widget.TextView[@text=\"Safety Kuvrr\"]");
		return driver.findElement(Title);
		
}
	public MobileElement KuvrrImage() {

		By KuvrrImage = By.id("com.safety.armourgrid:id/intro_image");
		return driver.findElement(KuvrrImage);

	}
	

}
