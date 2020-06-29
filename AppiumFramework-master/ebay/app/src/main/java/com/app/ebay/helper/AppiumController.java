package com.app.ebay.helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
/**
   AppiumController class is used for defining desired capabilities and creating the driver
    */
public class AppiumController {
    public static platform executionPlatform = platform.ANDROID;
    public enum platform{
        ANDROID
    }
    public static AppiumController instance = new AppiumController();
    public AppiumDriver<?> driver;
    /** Method : start
     *  Description: Method to define desired capabilities and creation of driver
     *  @return:  None
     */
    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch (executionPlatform) {
            case ANDROID:
                File classpathRoot = new File(System.getProperty("user.dir"));
                File appDir = new File(classpathRoot, "/app/Android");
                File app = new File(appDir, "eBay.apk");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", AppiumConstants.PLATFORM_NAME);
                capabilities.setCapability("deviceName", AppiumConstants.DEVICE_NAME);
                capabilities.setCapability("app", app.getAbsolutePath());
                capabilities.setCapability("appPackage", AppiumConstants.APP_PACKAGE);
                capabilities.setCapability("automationName","uiautomator2");
                capabilities.setCapability("appActivity", AppiumConstants.APP_ACTIVITY);
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
         
        }
    }


    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}