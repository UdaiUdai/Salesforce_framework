package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;

public class LeadsPage extends ProjectSpecificMethods {

	public LeadsPage typeSearchThisList(String searchThisList) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='Lead-search-input']"), searchThisList);
		reportStep("Type Search This List", "pass");
		return this;
	}

	public LeadsPage pressEnterInSearchList(String key) {
		clearAndType(locateElement(Locators.XPATH, "//button[normalize-space()='Salesforce Help']"), key);
		reportStep("Press Enter In Search List", "pass");
		return this;
	}
}
