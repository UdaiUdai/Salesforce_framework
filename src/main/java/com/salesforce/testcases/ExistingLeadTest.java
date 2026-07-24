package com.salesforce.testcases;

import org.testng.annotations.Test;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.WelcomePage;
import com.salesforce.pages.LeadsPage;
import com.salesforce.pages.LeadDetailsPage;
import com.salesforce.pages.CreateLeadPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class ExistingLeadTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "ExistingLead";
		testcaseName = "Edit Existing Lead";
		testDescription = "Edit Existing Lead";
		authors = "saran";
		category = "smoke";
	}

	// TODO: data-driven test — add one row to this framework's Excel data source
	// (see excelFileName above) with header row: username, password, expectedTitle, searchAppsAndItems, searchThisList, key, title, company, email, numberOfEmployees
	// Values captured from this scenario: "dilipkumar.rajendran@testleaf.com", "TestLeaf@2025", "Home | Salesforce", "Leads", "Test User", "Enter", "Sr. SDET", "Qeagle", "test@testleaf.com", "200"
	@Test(dataProvider="fetchData")
	public void verifyNavigationToCreateLead(String username, String password, String expectedTitle, String searchAppsAndItems, String searchThisList, String key, String title, String company, String email, String numberOfEmployees) {
			new LoginPage()
				.enterUname(username)
				.enterPwd(password)
				.clickLogin();
			new WelcomePage()
				.verifyPageTitle(expectedTitle)
				.clickAppLauncher()
				.typeSearchAppsAndItems(searchAppsAndItems)
				.clickLeads();
			new LeadsPage()
				.typeSearchThisList(searchThisList)
				.pressEnterInSearchList(key);
			new LeadDetailsPage()
				.clickLeadName()
				.clickEdit();
			new CreateLeadPage()
				.typeTitle(title)
				.typeCompany(company)
				.typeEmail(email)
				.clickRatingDropdown()
				.selectRatingWarm()
				.typeNumberOfEmployees(numberOfEmployees)
				.clickSave()
				.verifyLeadNameDisplayed();
	}
}
