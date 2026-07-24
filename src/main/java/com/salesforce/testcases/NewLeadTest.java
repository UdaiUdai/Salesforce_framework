package com.salesforce.testcases;

import org.testng.annotations.Test;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.WelcomePage;
import com.salesforce.pages.CreateLeadPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class NewLeadTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "NewLead";
		testcaseName = "Create New Lead";
		testDescription = "Create New Lead";
		authors = "saran";
		category = "smoke";
	}

	// TODO: data-driven test — add one row to this framework's Excel data source
	// (see excelFileName above) with header row: username, password, expectedTitle, searchAppsAndItems, firstName, lastName, company, title, city, street, zipPostalCode, annualRevenue, numberOfEmployees
	// Values captured from this scenario: "dilipkumar.rajendran@testleaf.com", "TestLeaf@2025", "Home | Salesforce", "Leads", "Test", "User", "Testleaf", "SDET", "Chennai", "Adyar", "600020", "500000", "150"
	@Test(dataProvider="fetchData")
	public void verifyNavigationToCreateLead(String username, String password, String expectedTitle, String searchAppsAndItems, String firstName, String lastName, String company, String title, String city, String street, String zipPostalCode, String annualRevenue, String numberOfEmployees) {
			new LoginPage()
				.enterUname(username)
				.enterPwd(password)
				.clickLogin();
			new WelcomePage()
				.verifyPageTitle(expectedTitle)
				.clickAppLauncher()
				.typeSearchAppsAndItems(searchAppsAndItems)
				.clickLeads();
			new CreateLeadPage()
				.clickNew()
				.clickSalutationDropdown()
				.selectSalutationMr()
				.typeFirstName(firstName)
				.typeLastName(lastName)
				.typeCompany(company)
				.typeTitle(title)
				.clickRatingDropdown()
				.selectRatingHot()
				.typeCity(city)
				.typeStreet(street)
				.typeZipPostalCode(zipPostalCode)
				.clickLeadSourceDropdown()
				.selectLeadSourceWeb()
				.clickIndustryDropdown()
				.selectIndustryEducation()
				.typeAnnualRevenue(annualRevenue)
				.typeNumberOfEmployees(numberOfEmployees)
				.clickSave()
				.verifyLeadNameDisplayed();
	}
}
