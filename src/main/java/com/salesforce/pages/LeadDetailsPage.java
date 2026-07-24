package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;

public class LeadDetailsPage extends ProjectSpecificMethods {

	public LeadDetailsPage clickLeadName() {
		click(locateElement(Locators.XPATH, "//a[@title='Test User']"));
		reportStep("Click Lead Name", "pass");
		return this;
	}

	public LeadDetailsPage clickEdit() {
		click(locateElement(Locators.XPATH, "//button[@name='Edit']"));
		reportStep("Click Edit", "pass");
		return this;
	}
}
