package com.app.ebay.helper;


import io.appium.java_client.AppiumDriver;

/**
  AppiumBase abstract class provides method that return a driver instance
 */
public abstract class AppiumBase {

    protected AppiumDriver<?> driver() {
        return AppiumController.instance.driver;
    }
}