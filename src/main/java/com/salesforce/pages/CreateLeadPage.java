package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage clickNew() {
		click(locateElement(Locators.XPATH, "//a[@title='New']"));
		reportStep("Click New", "pass");
		return this;
	}

	public CreateLeadPage clickSalutationDropdown() {
		click(locateElement(Locators.XPATH, "//button[@name='salutation']"));
		reportStep("Click Salutation Dropdown", "pass");
		return this;
	}

	public CreateLeadPage selectSalutationMr() {
		click(locateElement("Mr."));
		reportStep("Select Salutation Mr", "pass");
		return this;
	}

	public CreateLeadPage typeFirstName(String firstName) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='firstName']"), firstName);
		reportStep("Type First Name", "pass");
		return this;
	}

	public CreateLeadPage typeLastName(String lastName) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='lastName']"), lastName);
		reportStep("Type Last Name", "pass");
		return this;
	}

	public CreateLeadPage typeCompany(String company) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='Company']"), company);
		reportStep("Type Company", "pass");
		return this;
	}

	public CreateLeadPage typeTitle(String title) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='Title']"), title);
		reportStep("Type Title", "pass");
		return this;
	}

	public CreateLeadPage clickRatingDropdown() {
		click(locateElement(Locators.XPATH, "//button[@aria-label='Rating']"));
		reportStep("Click Rating Dropdown", "pass");
		return this;
	}

	public CreateLeadPage selectRatingHot() {
		click(locateElement("Hot"));
		reportStep("Select Rating Hot", "pass");
		return this;
	}

	public CreateLeadPage typeCity(String city) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='city']"), city);
		reportStep("Type City", "pass");
		return this;
	}

	public CreateLeadPage typeStreet(String street) {
		clearAndType(locateElement(Locators.XPATH, "//textarea[@name='street']"), street);
		reportStep("Type Street", "pass");
		return this;
	}

	public CreateLeadPage typeZipPostalCode(String zipPostalCode) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='postalCode']"), zipPostalCode);
		reportStep("Type Zip Postal Code", "pass");
		return this;
	}

	public CreateLeadPage clickLeadSourceDropdown() {
		click(locateElement(Locators.XPATH, "//button[@aria-label='Lead Source']"));
		reportStep("Click Lead Source Dropdown", "pass");
		return this;
	}

	public CreateLeadPage selectLeadSourceWeb() {
		click(locateElement("Web"));
		reportStep("Select Lead Source Web", "pass");
		return this;
	}

	public CreateLeadPage clickIndustryDropdown() {
		click(locateElement(Locators.XPATH, "//button[@aria-label='Industry']"));
		reportStep("Click Industry Dropdown", "pass");
		return this;
	}

	public CreateLeadPage selectIndustryEducation() {
		click(locateElement("Education"));
		reportStep("Select Industry Education", "pass");
		return this;
	}

	public CreateLeadPage typeAnnualRevenue(String annualRevenue) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='AnnualRevenue']"), annualRevenue);
		reportStep("Type Annual Revenue", "pass");
		return this;
	}

	public CreateLeadPage typeNumberOfEmployees(String numberOfEmployees) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='NumberOfEmployees']"), numberOfEmployees);
		reportStep("Type Number Of Employees", "pass");
		return this;
	}

	public CreateLeadPage clickSave() {
		click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
		reportStep("Click Save", "pass");
		return this;
	}

	public void verifyLeadNameDisplayed() {
		verifyDisplayed(locateElement(Locators.XPATH, "//*[normalize-space()='Mr. Test User']"));
		reportStep("Verify Lead Name Displayed", "pass");
	}

public CreateLeadPage typeEmail(String email) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='Email']"), email);
		reportStep("Type Email", "pass");
		return this;
	}

public CreateLeadPage selectRatingWarm() {
		click(locateElement("Warm"));
		reportStep("Select Rating Warm", "pass");
		return this;
	}
}
