package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
   HomePage has all the ui locators and actions performed in the home screen in app
 */
public class HomePage extends AppiumHelper {
    @FindBy(id = "com.ebay.mobile:id/search_box")
    public MobileElement homePageSearchBox;

    @FindBy(id = "com.ebay.mobile:id/cell_collection_item")
    public MobileElement productList;

    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    /** 
	  enterTextInSearchField method is used to enter given text in the mobile element field
     */
    public void enterTextInSearchField(String txt){
        inputString(homePageSearchBox,txt);
    }
    /** 
	  selectProdFromList method is used to perform click action on product list element
     */
    public void selectProdFromList(){
        clickElement(productList);
    }
}