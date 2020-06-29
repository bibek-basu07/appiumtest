package com.app.ebay.performTests;

import com.app.ebay.pages.PersonalAccRegistrationPage;

import org.testng.annotations.Test;


public class TestEbayPersonalUserRegistration extends BaseTestClass{

    @Test
    public void registerPersonalUserWorkFlow() {
        try{
            firstInteractionPage.registerUser();
            personalUserRegisterPage.selectPersonalAccRadioBtn();
            personalUserRegisterPage.enterFirstName(testDataProvider.getFirstName());
            personalUserRegisterPage.enterLastName(testDataProvider.getLastName());
            personalUserRegisterPage.enterEmail(testDataProvider.getUserEmail);
            personalUserRegisterPage.enterPwd(testDataProvider.getUserPassword);
            personalUserRegisterPage.registerPersonalUser();

        }catch (Exception e){
           Log.logError(getClass().getName(), "registerPersonalUserWorkFlow", "Unable to Register successfully");
        }
    }
}
