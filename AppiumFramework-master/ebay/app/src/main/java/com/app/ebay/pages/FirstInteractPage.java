package com.app.ebay.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.app.ebay.helper.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * 
  FirstInteractPage has all the ui locators and actions performed in the First screen in app

 */
public class FirstInteractionPage extends AppiumHelper {

    @FindBy(id = "com.ebay.mobile:id/home")
    public MobileElement homeNavMenu;

    @FindBy(id = "com.ebay.mobile:id/menu_cart")
    public MobileElement menuCart;

    @FindBy(id = "com.ebay.mobile:id/capsule_selling")
    public MobileElement sellingCapsule;

    @FindBy(id = "com.ebay.mobile:id/capsule_deals")
    public MobileElement dealsCapsule;

    @FindBy(id = "com.ebay.mobile:id/capsule_categories")
    public MobileElement categoriesCapsule;

    @FindBy(id = "com.ebay.mobile:id/button_register")
    public MobileElement registerPage;

    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    public MobileElement signin;

    @FindBy(id = "com.ebay.mobile:id/search_box")
    public MobileElement searchBox;

    public FirstInteractionPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** 
	   registerUser method performs click action on register page button
     */
    public void registerUser() {
        clickElement(registerPage);
    }

    /** 
	   pressSignIn performs click action on sign in button
     */
    public void pressSignIn(){
        clickElement(signin);
    }
}