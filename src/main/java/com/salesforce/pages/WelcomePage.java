package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.selenium.api.design.Locators;

public class WelcomePage extends ProjectSpecificMethods {


public void verifyPageTitle(String expectedTitle) {
		verifyTitle(expectedTitle);
		reportStep("Verify Page Title", "pass");
	}

public WelcomePage clickAppLauncherIcon() {
		click(locateElement(Locators.XPATH, "//button[normalize-space()='App Launcher']"));
		reportStep("Click App Launcher Icon", "pass");
		return this;
	}

public WelcomePage typeInAppLauncherSearch(String searchText) {
		clearAndType(locateElement(Locators.CSS, "input[placeholder='Search apps and items...']"), searchText);
		reportStep("Type In App Launcher Search", "pass");
		return this;
	}

public WelcomePage clickLeadsApp() {
		click(locateElement(Locators.XPATH, "//a[normalize-space()='Leads']"));
		reportStep("Click Leads App", "pass");
		return this;
	}
}
