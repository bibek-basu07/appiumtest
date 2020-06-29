package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import com.app.ebay.logger.Log;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
   PersonalAccRegPage has all the ui locators and actions performed in the Personal account Registration screen in app
 */
 
public class PersonalAccRegistrationPage extends AppiumHelper {

    @FindBy(xpath = "//*[@text='Personal account']")
    public MobileElement personalAcc;

    @FindBy(id = "firstname")
    public MobileElement firstName;

    @FindBy(id = "lastname")
    public MobileElement lastName;

    @FindBy(id = "email")
    public MobileElement email;

    @FindBy(id = "PASSWORD")
    public MobileElement password;

    @FindBy(id = "ppaFormSbtBtn")
    public MobileElement personalAccRegister;

    /** constructor */
    public PersonalAccRegistrationPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** 
	  selectPersonalAccRadioBtn method is used to select personal account radio button
     */
    public void selectPersonalAccRadioBtn(){
        clickElement(personalAcc);
    }

    /** 
	  enterFirstName method is used to enter text in first name field
     */
    public void enterFirstName(String txt){
       try{
           if(txt != null){
               inputString(firstName,txt);
               Log.info("First Name entered");
           }
       }catch(Exception e){
           Log.logError(getClass().getName(),"enterFirstName","Text is not enetered in first name field");
       }
    }
    /** 
	  enterLastName method is used to enter text in last name field
     */
    public void enterLastName(String txt){
         try{
            if(uName != null){
                inputString(lastName,txt);
                Log.info("Last Name entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterLastName","Text is not entered in last name field");
        }
    }

    /** 
	  enterEmail method is used to enter email in email field
     */
    public void enterEmail(String txt){
        try{
            if(uName != null){
                inputString(email,txt);
                Log.info("email entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterEmail","Text is not entered in ename field");
        }
    }

    /** 
	  enterPwd method is used to enter password in password field
     */
    public void enterPwd(String txt){
        try{
            if(uName != null){
                inputString(password,txt);
                Log.info("password entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterPwd","Text is not entered in password field");
        }
    }

    /** 
	  registerPersonalUser method is used to performs click action on personal User Register element
     */
    public void registerPersonalUser() {
        clickElement(personalAccRegister);
    }
}
