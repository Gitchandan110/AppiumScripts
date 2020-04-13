package com.appium.bussinessLogic;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import com.appium.commonutils.Base;
import com.appium.pageobject.SK_MAP_PO;

import io.appium.java_client.MobileElement;

public class SK_MapBL extends SK_MAP_PO {

	public void selectMAP() throws InterruptedException, IOException {

		try {
			int totalMap = listMap().size();
			System.out.println("Number of Map(s) is : " + totalMap);

			for (int i = 0; i < totalMap; i++) {

				String MapName = listMap().get(i).getText();
				System.out.println("Map " + i + " is : " + MapName);
				String requiredMap = "Netsutra";
				if (MapName.equalsIgnoreCase(requiredMap)) {
					listMap().get(i).click();
					Thread.sleep(5000);
					Base.takeScreenShot("Map Screen");
                    break;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickPOIList() {

		try {

			if (menuPOIList() != null && menuPOIList().isDisplayed()) {

				menuPOIList().click();
				Thread.sleep(5000);
				Base.takeScreenShot("Map Screen");
				System.out.println("menuPOIList() clicked");

			} else {

				System.out.println("menuPOIList() not found");
			}

		} catch (Exception ex) {

			System.out.println("Exception in POIList() is : " + ex);
		}

	}

	public void getPOIList() throws InterruptedException {

		int roomCount = roomList().size();

		System.out.println("Room Count is :" + roomCount);

		for (int i = 0; i < roomCount; i++) {

			String RoomName = roomList().get(i).getText();
			System.out.println("Room Name is : " + RoomName);
			roomList().get(i).click();
			Thread.sleep(2000);
			clickPOIList();

			/*
			 * List<MobileElement>
			 * roomList=driver.findElements(By.id("com.safety.armourgrid:id/feature_title"))
			 * ;
			 * 
			 * for (MobileElement room : roomList) { System.out.println(room.getText());
			 * room.click(); Thread.sleep(5000); clickPOIList();
			 */
		}

	}

}
