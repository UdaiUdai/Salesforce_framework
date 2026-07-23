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

	public CreateLeadPage clickSalutation() {
		click(locateElement(Locators.XPATH, "//button[@name='salutation']"));
		reportStep("Click Salutation", "pass");
		return this;
	}

	public CreateLeadPage clickSalutationMr() {
		click(locateElement("Mr."));
		reportStep("Click Salutation Mr", "pass");
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

	public CreateLeadPage clickRating() {
		click(locateElement(Locators.XPATH, "//button[@aria-label='Rating']"));
		reportStep("Click Rating", "pass");
		return this;
	}

	public CreateLeadPage clickRatingHot() {
		click(locateElement("Hot"));
		reportStep("Click Rating Hot", "pass");
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

	public CreateLeadPage clickLeadSource() {
		click(locateElement(Locators.XPATH, "//button[@aria-label='Lead Source']"));
		reportStep("Click Lead Source", "pass");
		return this;
	}

	public CreateLeadPage clickLeadSourceWeb() {
		click(locateElement("Web"));
		reportStep("Click Lead Source Web", "pass");
		return this;
	}

	public CreateLeadPage clickIndustry() {
		click(locateElement(Locators.XPATH, "//button[@aria-label='Industry']"));
		reportStep("Click Industry", "pass");
		return this;
	}

	public CreateLeadPage clickIndustryEducation() {
		click(locateElement("Education"));
		reportStep("Click Industry Education", "pass");
		return this;
	}

	public CreateLeadPage typeAnnualRevenue(String annualRevenue) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='AnnualRevenue']"), annualRevenue);
		reportStep("Type Annual Revenue", "pass");
		return this;
	}

	public CreateLeadPage typeNoOfEmployees(String noOfEmployees) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='NumberOfEmployees']"), noOfEmployees);
		reportStep("Type No Of Employees", "pass");
		return this;
	}

	public CreateLeadPage clickSave() {
		click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
		reportStep("Click Save", "pass");
		return this;
	}

	public void verifyMrTestUserDisplayed() {
		verifyDisplayed(locateElement(Locators.XPATH, "//*[normalize-space()='Mr. Test User']"));
		reportStep("Verify Mr Test User Displayed", "pass");
	}
}
