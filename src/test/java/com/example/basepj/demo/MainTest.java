package com.example.basepj.demo;

import com.example.basepj.helper.ConstHelper;
import com.example.basepj.helper.UrlHelper;
import com.example.basepj.helper.Utils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.example.basepj.helper.BrowserHelper.setupWebDriver;

public class MainTest {
    MainElementTest mainElementTest = new MainElementTest();

    @BeforeMethod
    public void setUp() {
        String browser = System.getProperty(ConstHelper.KEY_BROWSER, ConstHelper.BROWSER_CHROME);
        setupWebDriver(browser, ConstHelper.SETTING_BROWSER_SIZE_1920_x_1080, ConstHelper.SETTING_FALSE);
        open(UrlHelper.BASE_URL);
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    public void search() {
        mainElementTest.searchBoxElement.click();
        mainElementTest.searchBoxElement.sendKeys("Test Selenium");
        sleep(2000);
        mainElementTest.searchBoxElement.pressEnter();
        sleep(2000);
        closeWindow();
    }

    @Test
    public void selectFirstResult() {

    }

    @Test
    public void test_File() {
        Utils.readFile("province.json");
        sleep(10000);
        closeWindow();
    }
}
