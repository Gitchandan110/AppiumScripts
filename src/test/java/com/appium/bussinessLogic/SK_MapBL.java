package com.appium.bussinessLogic;

import com.appium.pageobject.SK_MAP_PO;

public class SK_MapBL extends SK_MAP_PO {

	public void selectMAP() throws InterruptedException {

		int totalMap = listMap().size();
		System.out.println("Number of Map(s) is : " + totalMap);

		for (int i = 0; i < totalMap; i++) {

			String MapName = listMap().get(i).getText();

			System.out.println("Map " + i + " is : " + MapName);

			String requiredMap = "Netsutra";

			if (MapName.equalsIgnoreCase(requiredMap)) {

				listMap().get(i).click();

			}

		}
		Thread.sleep(5000);

	}

	public void clickPOIList() {

		try {

			if (menuPOIList() != null && menuPOIList().isDisplayed()) {

				menuPOIList().click();
				Thread.sleep(2000);

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

		}

	}

}
