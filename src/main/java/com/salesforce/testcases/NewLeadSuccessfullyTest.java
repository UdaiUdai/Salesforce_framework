package com.salesforce.testcases;

import org.testng.annotations.Test;
import com.salesforce.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class NewLeadSuccessfullyTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "Login";
		testcaseName = "Create a new lead successfully";
		testDescription = "Create a new lead successfully";
		authors = "saran";
		category = "smoke";
	}

	@Test
	public void runNewLeadSuccessfully() {
			new LoginPage()
				.enterUname("DemoCSR2")
				.enterPwd("crmsfa")
				.clickLogin();
	}
}
