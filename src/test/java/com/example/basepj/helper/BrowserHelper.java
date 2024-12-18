package com.example.basepj.helper;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;

public class BrowserHelper {
    public static WebDriverManager setupWebDriver(String browser, String browserSize, boolean isHeadless) {
        WebDriverManager driverManager = null;
        switch (browser.toLowerCase()) {
            case ConstHelper.BROWSER_CHROME:
                driverManager = WebDriverManager.chromedriver();
                driverManager.setup();
                Configuration.browser = ConstHelper.BROWSER_CHROME;
                Configuration.browserSize = browserSize;
                Configuration.headless = isHeadless;
                SelenideLogger.addListener(ConstHelper.NAME_ALLURE, new AllureSelenide());
                break;

            case ConstHelper.BROWSER_FIREFOX:
                driverManager = WebDriverManager.firefoxdriver();
                driverManager.setup();
                Configuration.browser = ConstHelper.BROWSER_FIREFOX;
                Configuration.headless = isHeadless;
                SelenideLogger.addListener(ConstHelper.NAME_ALLURE, new AllureSelenide());
                break;

            case ConstHelper.BROWSER_IE:
                driverManager = WebDriverManager.iedriver();
                driverManager.setup();
                Configuration.browser = ConstHelper.BROWSER_IE;
                Configuration.headless = isHeadless;
                SelenideLogger.addListener(ConstHelper.NAME_ALLURE, new AllureSelenide());
                break;
            default:
                throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        return driverManager;
    }
}
