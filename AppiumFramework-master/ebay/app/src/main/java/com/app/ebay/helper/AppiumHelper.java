package com.app.ebay.helper;

import com.app.ebay.logger.Log;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
/**
   AppiumHelper class provides methods that perform common actions performed on the mobile elements

 */
public class AppiumHelper {
        WebDriverWait wait = new WebDriverWait(AppiumController.instance.driver, 30);

    /** getPageSource method provides page source details
     */
    protected String getPageSource() {
        return AppiumController.instance.driver.getPageSource();
    }

    /** inputString method is used to enter text in the text elements
     */
    protected void inputString(MobileElement mobileElement, String stringToBeEntered) {
        mobileElement = waitTillElementVisible(mobileElement);
        mobileElement.sendKeys(stringToBeEntered);
        AppiumController.instance.driver.hideKeyboard();
    }
    /** clickElement method is used to perform click action on the element
     */
    protected void clickElement(MobileElement mobileElement) {
         mobileElement.click();
         mobileElement = waitTillElementVisible(mobileElement);
         mobileElement.click();
    }
    /** goBack method is used for performing back operation
     */
    protected void goBack() {
        AppiumController.instance.driver.navigate().back();
    }

    /** isVisible method checks the presence of the element and returns true/false
     */
    protected boolean isVisible(MobileElement mobileElement) {
        boolean status = false;
        try {
            mobileElement = waitTillElementVisible(mobileElement);
            status = true;
            Log.info(mobileElement.toString()+" Element is visible");
        } catch (Exception e) {
            Log.logError(getClass().getName(),"isVisible","Element is not visible");
        }
        return status;
    }
    /** waitTillElementVisible method returns the element once it is visible
     */
    private MobileElement waitTillElementVisible(MobileElement mobileElement) {
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(mobileElement));
    }
}