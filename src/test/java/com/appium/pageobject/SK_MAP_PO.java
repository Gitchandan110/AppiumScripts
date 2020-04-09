package com.appium.pageobject;

import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;

import io.appium.java_client.MobileElement;

public class SK_MAP_PO extends Base {

	public List<MobileElement> listMap() {

		try {

			By Maps = By.id("com.safety.armourgrid:id/list_map_name");

			return driver.findElements(Maps);

		} catch (Exception ex) {

			System.out.println("Exception in Map Locator:" + ex);
		}
		return null;

	}

	public MobileElement openCKMap() {

		try {

			By ckMaps = By.xpath("//android.widget.TextView[@text=\"ckMap\"]");

			return driver.findElement(ckMaps);

		} catch (Exception ex) {

			System.out.println("Exception in ckMap Locator:" + ex);
		}
		return null;

	}

	public MobileElement openNetsutraMap() {

		try {

			By ckMaps = By.xpath("//android.widget.TextView[@text=\"Netsutra\"]");

			return driver.findElement(ckMaps);

		} catch (Exception ex) {

			System.out.println("Exception in ckMap Locator:" + ex);
		}
		return null;

	}

	public MobileElement btnMapNavigateUP() {

		By BtnNavigate = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
		return driver.findElement(BtnNavigate);

	}
	
	public MobileElement menuPOIList() {
		
//	By POI=By.id("com.safety.armourgrid:id/meta_loader_fragment");	
		
		By POI=By.xpath("//android.widget.TextView[@content-desc=\"POI List\"]");
		return driver.findElement(POI);
		
		
	}
	
	public List<MobileElement> roomList(){
		
	By Room=By.id("com.safety.armourgrid:id/feature_title");
	
	return driver.findElements(Room);
		
		
	}
	

}
