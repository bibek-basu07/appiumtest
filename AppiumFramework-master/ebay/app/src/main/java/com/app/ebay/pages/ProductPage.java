package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
   ProductPage has all the ui locators and actions performed in the Product screen in app
 */
public class ProductPage extends AppiumHelper {
    @FindBy(id = "com.ebay.mobile:id/textview_item_name")
    public MobileElement productDetailsName;

    @FindBy(id = "com.ebay.mobile:id/textview_item_price")
    public MobileElement productDetailsPrice;

    @FindBy(id = "com.ebay.mobile:id/button_add_to_cart")
    public MobileElement productDetailsAddToCart;

    @FindBy(id = "com.ebay.mobile:id/button_view_in_cart")
    public MobileElement productDetailsViewInCart;

    /** constructor */
    public ProductPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** 
	   getProdDetailsName method returns the name of the product in selected Product page
     */
    public String getProdDetailsName(){
        String prodName = productDetailsName.toString();
        return  prodName;
    }

    /** 
	  getProdDetailsPrice method returns price of the product in selected Product page
     */
    public String getProdDetailsPrice(){
        String prodPrice = productDetailsPrice.toString();
        return  prodPrice;
    }

    /** 
	   clickProductDetailsAddToCartBtn method performs click on the Add to Cart button
     */
    public void clickProductDetailsAddToCartBtn(){
        clickElement(productDetailsAddToCart);
    }

    /**  
	  clickProductDetailsViewInCartBtn method performs click on the View in Cart button
     */
    public void clickProductDetailsViewInCartBtn(){
        clickElement(productDetailsViewInCart);
    }

}
