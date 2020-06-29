package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import com.app.ebay.logger.Log;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
   SignInPage has all the ui locators and actions performed in the Sininpage screen in app
 */
public class SignInPage extends AppiumHelper {
    @FindBy(id = "com.ebay.mobile:id/edit_text_username")
    public MobileElement userName;

    @FindBy(id = "com.ebay.mobile:id/et_temp")
    public MobileElement password;

    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    public MobileElement signInButton;

    @FindBy(id = "com.ebay.mobile:id/button_google_deny")
    public MobileElement noThanksButton;


    public SignInPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** 
	  enterUserName method is used to enter the given user name in the mobile element field
     */
    public void enterUserName(String uName){
        try{
            if(uName != null){
                inputString(userName,uName);
                Log.info("User Name entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterUserName","Text is not entered in user name field");
        }
    }

    /**
	   enterPassword method is used to  enter the password
     */
    public void enterPassword(String pwd){
        try{
            if(pwd != null){
                inputString(password,pwd);
                Log.info("Password entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterPassword","Text is not enetered in Password");
        }
    }

    /** 
	  pressSignInButton method is used to perform click on the Sign in button
     */
    public void pressSignInButton(){
        clickElement(signInButton);
    }

    /** 
	  pressNoThanksBtn method is used to performs click on the No Thanks button

     */
    public void pressNoThanksBtn(){
        clickElement(noThanksButton);
    }
}