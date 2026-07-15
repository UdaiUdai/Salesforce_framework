package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUname(String uName) {
		
		WebElement user = locateElement(Locators.XPATH, "//input[@id='username']");
		clearAndType(user, uName);
		reportStep("uName entered successfully","pass");
		return this;
		
	}
	
	public LoginPage enterPwd(String pwd) {
		WebElement pass = locateElement("password");
		clearAndType(pass, pwd);
		reportStep("pwd entered successfully","pass");
		return this;
		
	}
	
	public WelcomePage clickLogin() {
		
		click(locateElement("Login"));
		reportStep("logged in successfully","pass");
		
		return new WelcomePage();
		
	}

}
