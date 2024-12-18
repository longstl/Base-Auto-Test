package com.example.basepj.main_landing;

import com.codeborne.selenide.Condition;
import com.example.basepj.helper.ConstHelper;
import com.example.basepj.helper.UrlHelper;
import com.example.basepj.helper.Utils;
import com.example.basepj.helper.constant.MainLandingPagePath;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.example.basepj.helper.BrowserHelper.setupWebDriver;

public class MainLandingTest {
    MainLandingElementTest mainLandingElementTest = new MainLandingElementTest();

    @BeforeMethod
    public void setUp() {
        String browser = System.getProperty(ConstHelper.KEY_BROWSER, ConstHelper.BROWSER_CHROME);
        setupWebDriver(browser, ConstHelper.SETTING_BROWSER_SIZE_1920_x_1080, ConstHelper.SETTING_FALSE);
        open(UrlHelper.BASE_URL_TA_CONNECT_PROD);
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    public void test_Go_Home_Path() {
        mainLandingElementTest.homePathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Go_Product_Path() {
        mainLandingElementTest.productPathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Go_Contact_Path() {
        mainLandingElementTest.contactPathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    // footer
    @Test
    public void test_Go_Product_Info_Path() {
        Utils.scrollToElement(MainLandingPagePath.ELEMENT_FOOTER);
        mainLandingElementTest.productInfoPathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Go_Turn_Of_Service_Path() {
        Utils.scrollToElement(MainLandingPagePath.ELEMENT_FOOTER);
        mainLandingElementTest.turnOfServicePathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Go_Platform_Solution_Path() {
        Utils.scrollToElement(MainLandingPagePath.ELEMENT_FOOTER);
        mainLandingElementTest.platformSolutionPathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Go_Document_Path() {
        Utils.scrollToElement(MainLandingPagePath.ELEMENT_FOOTER);
        mainLandingElementTest.documentPathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }
}
