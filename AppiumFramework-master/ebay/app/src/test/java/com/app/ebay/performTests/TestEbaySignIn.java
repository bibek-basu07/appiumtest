package com.app.ebay.performTests;

import org.testng.annotations.Test;

public class TestEbaySignIn extends BaseTestClass {

    @Test
    public void signInTest(){
        try{
             firstInteractionPage.pressSignIn();
             signInPage.enterUserName(testDataProvider.getUsr());
             signInPage.enterPassword(testDataProvider.getPwd());
             signInPage.pressSignInButton();
        }catch (Exception e){
           Log.logError(getClass().getName(), "signInTest", "Sign In Unsuccessful");
        }
    }
}
