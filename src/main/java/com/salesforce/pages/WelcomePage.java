package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.selenium.api.design.Locators;

public class WelcomePage extends ProjectSpecificMethods {


public void verifyPageTitle(String expectedTitle) {
		verifyTitle(expectedTitle);
		reportStep("Verify Page Title", "pass");
	}

public WelcomePage clickAppLauncher() {
		click(locateElement(Locators.XPATH, "//button[@title='App Launcher']"));
		reportStep("Click App Launcher", "pass");
		return this;
	}

public WelcomePage typeSearchAppsAndItems(String searchAppsAndItems) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search apps and items...']"), searchAppsAndItems);
		reportStep("Type Search Apps And Items", "pass");
		return this;
	}

public WelcomePage clickLeads() {
		click(locateElement(Locators.XPATH, "//a[@title='Leads']"));
		reportStep("Click Leads", "pass");
		return this;
	}
}
