package com.app.ebay.performTests;

import org.testng.annotations.Test;
import static junit.framework.TestCase.assertTrue;


public class TestEbayProductPurchaseWorkflow extends BaseTestClass {

     @Test
     public void placeOrderWorkFlow(){
         try{                  
                firstInteractionPage.pressSignIn();
                signInPage.enterUserName(testDataProvider.getUsr());
                signInPage.enterPassword(testDataProvider.getPwd());
                signInPage.pressSignInButton();
                signInPage.pressNoThanksBtn();
                homePage.enterTextInSearchField(testDataProvider.getProduct());
                homePage.selectProdFromList();
                productPage.clickProductDetailsAddToCartBtn();
                assertTrue(verifyCartAndCheckoutProdDetails());
                checkoutPage.clickPayConfirmBtn();
         }catch (Exception e){
           Log.logError(getClass().getName(), "placeOrderWorkFlow", "Unable to purchase the product");
        }
    }


    private boolean verifyCartAndCheckoutProdDetails(){
       boolean prodNameFlag = productPage.getProdDetailsName().equals(checkoutPage.getCheckoutProdDetailsName());
       boolean prodPriceFlag = productPage.getProdDetailsPrice().equals(checkoutPage.getCheckoutProdDetailsPrice());
       return (prodNameFlag && prodPriceFlag);
    }
}
