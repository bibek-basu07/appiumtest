package com.app.ebay.performTests;


import com.app.ebay.helper.AppiumBase;
import com.app.ebay.helper.AppiumController;
import com.app.ebay.pages.CheckoutPage;
import com.app.ebay.pages.FirstInteractionPage;
import com.app.ebay.pages.HomePage;
import com.app.ebay.pages.PersonalAccRegistrationPage;
import com.app.ebay.pages.ProductPage;
import com.app.ebay.pages.ShoppingCartPage;
import com.app.ebay.pages.SignInPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.TouchAction;

/**
 * BaseTestClass class performs basic startup of the test framework and initalizes all the page classes

 */
public class BaseTestClass extends AppiumBase {
    public FirstInteractPage firstInteractPage;
    public PersonalAccRegistrationPage personalUserRegisterPage;
    public HomePage homePage;
    public ProductPage productPage;
    public ShoppingCartPage shoppingCartPage;
    public SignInPage signInPage;
    public CheckoutPage checkoutPage;
    public TestDataProvider testDataProvider;
    public TouchAction touchObj;


    @BeforeSuite
    public void setUp() throws Exception {
        AppiumController.instance.start();
            switch (AppiumController.executionPlatform) {
            case ANDROID: {
                firstInteractPage = new FirstInteractPage(driver());
                personalUserRegisterPage = new PersonalAccRegistrationPage(driver());
                homePage = new HomePage(driver());
                productPage = new ProductPage(driver());
                shoppingCartPage =new ShoppingCartPage(driver());
                signInPage = new SignInPage(driver());
                checkoutPage = new CheckoutPage(driver());
                touchObj = new TouchAction(driver());
                testDataProvider = new TestDataProvider();
                driver().rotate(testDataProvider.getScreenOrientation());
                driver().manage().window().setSize(testDataProvider.getTargetSize());
                break;
            }
        }
    }


     @AfterSuite
    public void tearDown() {
        AppiumController.instance.stop();
    }
}