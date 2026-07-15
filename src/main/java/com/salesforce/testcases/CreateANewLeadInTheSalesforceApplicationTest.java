package com.salesforce.testcases;

import org.testng.annotations.Test;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.WelcomePage;
import com.salesforce.pages.CreateLeadPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class CreateANewLeadInTheSalesforceApplicationTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "Login";
		testcaseName = "Create a new Lead in the  salesforce application";
		testDescription = "Create a new Lead in the  salesforce application";
		authors = "saran";
		category = "smoke";
	}

	@Test
	public void generatedTest() {
			new LoginPage()
				.enterUname("dilipkumar.rajendran@testleaf.com")
				.enterPwd("TestLeaf@2025")
				.clickLogin();
			new WelcomePage()
				.verifyPageTitle("Home | Salesforce")
				.clickAppLauncherIcon()
				.typeInAppLauncherSearch("Leads")
				.clickLeadsApp();
			new CreateLeadPage()
				.clickNewButton()
				.clickSalutationDropdown()
				.selectSalutationOption("Mr.")
				.enterFirstName("Test")
				.enterLastName("User")
				.enterCompany("Testleaf")
				.enterTitle("SDET")
				.clickRatingDropdown()
				.selectRatingOption("Hot")
				.enterCity("Chennai")
				.enterStreet("Adyar")
				.enterZipPostalCode("600020")
				.clickLeadSourceDropdown()
				.selectLeadSourceOption("Web")
				.clickIndustryDropdown()
				.selectIndustryOption("Education")
				.enterAnnualRevenue("500000")
				.enterNumberOfEmployees("150")
				.clickSaveButton()
				.verifyCreatedLeadName("Mr. Test User");
	}
}
