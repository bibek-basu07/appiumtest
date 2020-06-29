package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * ShoppingCartPage has all the ui locators and actions performed in the ShoppingCartPage screen in app
 */
public class ShoppingCartPage extends AppiumHelper {
    @FindBy(id = "com.ebay.mobile:id/title")
    public MobileElement cartProductName;

    @FindBy(id = "com.ebay.mobile:id/item_price")
    public MobileElement cartProductPrice;

    @FindBy(id = "com.ebay.mobile:id/remove_from_cart_button")
    public MobileElement cartRemoveProduct;

    @FindBy(id = "android:id/button1")
    public MobileElement removeConfirmation;


    public ShoppingCartPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** 
	  getCartProdName method returns the product name on the Shopping cart page
     */
    public String getCartProdName(){
        String prodName = cartProductName.toString();
        return  prodName;
    }

    /** 
	  getCartProdPrice method returns the product price on the Shopping cart page
     */
    public String getCartProdPrice(){
        String prodPrice = cartProductPrice.toString();
        return  prodPrice;
    }

    /** 
	  clickOnCartRemoveProduct method clicks on cart remove product element
     */
    public void clickOnCartRemoveProduct(){
        clickElement(cartRemoveProduct);
    }

    /** 
	  clickOnCartRemoveConfirmation method clicks on remove confirmation
     */
    public void clickOnCartRemoveConfirmation(){
        clickElement(removeConfirmation);
    }
}