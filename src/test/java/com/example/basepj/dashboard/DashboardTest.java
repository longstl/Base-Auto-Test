package com.example.basepj.dashboard;

import com.codeborne.selenide.SelenideElement;
import com.example.basepj.helper.ConstHelper;
import com.example.basepj.helper.ConstKeySendHelper;
import com.example.basepj.helper.UrlHelper;
import com.example.basepj.helper.Utils;
import com.example.basepj.helper.constant.ImagePath;
import com.example.basepj.image.ImageElementTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;
import static com.example.basepj.helper.BrowserHelper.setupWebDriver;

public class DashboardTest {
    DashboardElementTest dashboardElementTest = new DashboardElementTest();
    ImageElementTest imageElementTest = new ImageElementTest();

    @BeforeMethod
    public void setUp() {
        String browser = System.getProperty(ConstHelper.KEY_BROWSER, ConstHelper.BROWSER_CHROME);
        setupWebDriver(browser, ConstHelper.SETTING_BROWSER_SIZE_1920_x_1080, ConstHelper.SETTING_FALSE);
        open(Utils.getFullUrl() + UrlHelper.LOGIN_URI);
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    public void test_Go_To_Dashboard() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_Show_Customer_Tab_On_Dashboard() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_Show_All_Button_On_Dashboard() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonPathProvider.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonPathAgent.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonPathCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonShowWarehouse.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonPathProductList.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonAddCombo.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonMarketingChanel.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonPathCampaignEffective.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonPathListCampaign.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonPathOrder.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonSetting.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonBusinessProfile.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonPaymentMethod.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        Utils.openProfile();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonProfile.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        Utils.openProfile();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonChangePassword.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        Utils.openProfile();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonLogout.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void showImage() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.openProfile();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonProfile.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        imageElementTest.showImgPath.hover().click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void deleteImage() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.openProfile();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonProfile.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        imageElementTest.deleteImgPath.hover().click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        imageElementTest.btnUpdate.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void uploadWithOutImage() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.openProfile();
        sleep(ConstHelper.NUMBER_2000_MLS);
        dashboardElementTest.buttonProfile.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        imageElementTest.uploadImgPath.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        imageElementTest.btnUpdate.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }
}
