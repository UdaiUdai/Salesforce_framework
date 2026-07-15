package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC_01 extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		testcaseName="Login for salesforce application";
		testDescription="Login with positive credentials";
		authors="saran";
		category="smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String uName,String pwd) {
		
		LoginPage lp=new LoginPage();
		lp.enterUname(uName).enterPwd(pwd).clickLogin();
		
	}

}
