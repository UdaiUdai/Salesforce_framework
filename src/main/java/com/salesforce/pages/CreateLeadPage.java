package com.salesforce.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage clickNewButton() {
		click(locateElement(Locators.XPATH, "//div[@title='New']"));
		reportStep("Click New Button", "pass");
		return this;
	}

	public CreateLeadPage clickSalutationDropdown() {
		click(locateElement("combobox-button-1026"));
		reportStep("Click Salutation Dropdown", "pass");
		return this;
	}

	public CreateLeadPage selectSalutationOption(String option) {
		click(locateElement("Mr."));
		reportStep("Select Salutation Option", "pass");
		return this;
	}

	public CreateLeadPage enterFirstName(String firstName) {
		clearAndType(locateElement(Locators.CSS, "input[name='FirstName']"), firstName);
		reportStep("Enter First Name", "pass");
		return this;
	}

	public CreateLeadPage enterLastName(String lastName) {
		clearAndType(locateElement("input-1032"), lastName);
		reportStep("Enter Last Name", "pass");
		return this;
	}

	public CreateLeadPage enterCompany(String company) {
		clearAndType(locateElement("input-1040"), company);
		reportStep("Enter Company", "pass");
		return this;
	}

	public CreateLeadPage enterTitle(String title) {
		clearAndType(locateElement("input-1048"), title);
		reportStep("Enter Title", "pass");
		return this;
	}

	public CreateLeadPage clickRatingDropdown() {
		click(locateElement("combobox-button-1054"));
		reportStep("Click Rating Dropdown", "pass");
		return this;
	}

	public CreateLeadPage selectRatingOption(String option) {
		click(locateElement("Hot"));
		reportStep("Select Rating Option", "pass");
		return this;
	}

	public CreateLeadPage enterCity(String city) {
		clearAndType(locateElement(Locators.CSS, "input[name='City']"), city);
		reportStep("Enter City", "pass");
		return this;
	}

	public CreateLeadPage enterStreet(String street) {
		clearAndType(locateElement(Locators.CSS, "input[name='Street']"), street);
		reportStep("Enter Street", "pass");
		return this;
	}

	public CreateLeadPage enterZipPostalCode(String zipCode) {
		clearAndType(locateElement(Locators.CSS, "input[name='PostalCode']"), zipCode);
		reportStep("Enter Zip Postal Code", "pass");
		return this;
	}

	public CreateLeadPage clickLeadSourceDropdown() {
		click(locateElement("combobox-button-1086"));
		reportStep("Click Lead Source Dropdown", "pass");
		return this;
	}

	public CreateLeadPage selectLeadSourceOption(String option) {
		click(locateElement("input-1072"));
		reportStep("Select Lead Source Option", "pass");
		return this;
	}

	public CreateLeadPage clickIndustryDropdown() {
		click(locateElement("combobox-button-1099"));
		reportStep("Click Industry Dropdown", "pass");
		return this;
	}

	public CreateLeadPage selectIndustryOption(String option) {
		click(locateElement("Education"));
		reportStep("Select Industry Option", "pass");
		return this;
	}

	public CreateLeadPage enterAnnualRevenue(String annualRevenue) {
		clearAndType(locateElement(Locators.CSS, "input[name='AnnualRevenue']"), annualRevenue);
		reportStep("Enter Annual Revenue", "pass");
		return this;
	}

	public CreateLeadPage enterNumberOfEmployees(String numberOfEmployees) {
		clearAndType(locateElement(Locators.CSS, "input[name='NumberOfEmployees']"), numberOfEmployees);
		reportStep("Enter Number Of Employees", "pass");
		return this;
	}

	public CreateLeadPage clickSaveButton() {
		click(locateElement(Locators.XPATH, "//button[@title='Save']"));
		reportStep("Click Save Button", "pass");
		return this;
	}

	public void verifyCreatedLeadName(String expectedText) {
		verifyExactText(locateElement(Locators.XPATH, "//span[contains(text(),'Mr. Test User')]"), expectedText);
		reportStep("Verify Created Lead Name", "pass");
	}
}
