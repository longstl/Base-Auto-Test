package com.example.basepj.forgot_password;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.example.basepj.helper.*;
import com.example.basepj.helper.constant.ForgotPasswordPath;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.example.basepj.helper.BrowserHelper.setupWebDriver;

public class ForgotPasswordTest {
    ForgotPasswordElementTest forgotPasswordElementTest = new ForgotPasswordElementTest();


    @BeforeMethod
    public void setUp() {
        String browser = System.getProperty(ConstHelper.KEY_BROWSER, ConstHelper.BROWSER_CHROME);
        setupWebDriver(browser, ConstHelper.SETTING_BROWSER_SIZE_1920_x_1080, ConstHelper.SETTING_FALSE);
        open(Utils.getFullUrl() + UrlHelper.FORGOT_PASSWORD_URI);
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    public void test_Input_Email_Invalid_Type() {
        Utils.forgotPassword(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL_INVALID_TYPE);
        $x(ForgotPasswordPath.ERROR_EMAIL_MESSAGE_ELEMENT).shouldHave(Condition.text(ConstantTextHelper.ERROR_EMAIL_FORMAT_2));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Blank_Email() {
        forgotPasswordElementTest.buttonSubmit.click();
        $x(ForgotPasswordPath.ERROR_EMAIL_MESSAGE_ELEMENT).shouldHave(Condition.text(ConstantTextHelper.ERROR_EMAIL_BLANK));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Input_Right_Email() {
        Utils.forgotPassword(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Input_Wrong_Otp() {
        Utils.forgotPassword(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        sleep(ConstHelper.NUMBER_2000_MLS);
        forgotPasswordElementTest.inputOtp01.sendKeys(ConstKeySendHelper.KEY_SEND_ONE);
        forgotPasswordElementTest.inputOtp02.sendKeys(ConstKeySendHelper.KEY_SEND_ONE);
        forgotPasswordElementTest.inputOtp03.sendKeys(ConstKeySendHelper.KEY_SEND_ONE);
        forgotPasswordElementTest.inputOtp04.sendKeys(ConstKeySendHelper.KEY_SEND_ONE);
        forgotPasswordElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        forgotPasswordElementTest.inputConfirmPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        forgotPasswordElementTest.buttonSubmit.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(ForgotPasswordPath.ERROR_OTP).shouldHave(Condition.text(ConstantTextHelper.ERROR_OTP));
        closeWindow();
    }

    @Test
    public void test_Blank_Password() {
        Utils.forgotPassword(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        sleep(ConstHelper.NUMBER_2000_MLS);
        forgotPasswordElementTest.buttonSubmit.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        forgotPasswordElementTest.cssErrorOtp.shouldHave(CollectionCondition.texts(ConstantTextHelper.ERROR_OTP_BLANK));
        $x(ForgotPasswordPath.ERROR_PASSWORD).shouldHave(Condition.text(ConstantTextHelper.ERROR_PASSWORD_BLANK));
        $x(ForgotPasswordPath.ERROR_CONFIRM_PASSWORD).shouldHave(Condition.text(ConstantTextHelper.ERROR_CONFIRM_PASSWORD_BLANK));
        closeWindow();
    }

    @Test
    public void test_Password_less_Than_6_Characters() {
        Utils.forgotPassword(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        forgotPasswordElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_FOUR_CHARACTERS_PASSWORD);
        $x(ForgotPasswordPath.ERROR_PASSWORD).shouldHave(Condition.text(ConstantTextHelper.ERROR_PASSWORD_LESS_THAN_6_CHARACTER));
        sleep(ConstHelper.NUMBER_2000_MLS);
        forgotPasswordElementTest.buttonSubmit.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Confirm_Password_Not_Match() {
        Utils.forgotPassword(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        forgotPasswordElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        forgotPasswordElementTest.inputConfirmPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_FOUR_CHARACTERS_PASSWORD);
        $x(ForgotPasswordPath.ERROR_CONFIRM_PASSWORD).shouldHave(Condition.text(ConstantTextHelper.ERROR_CONFIRM_PASSWORD_NOT_MATCH));
        sleep(ConstHelper.NUMBER_2000_MLS);
        forgotPasswordElementTest.buttonSubmit.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Change_Password_Done() {
        Utils.forgotPassword(ConstKeySendHelper.KEY_SEND_NOT_IN_SYSTEM_CORRECT_EMAIL);
        sleep(ConstHelper.NUMBER_5000_MLS);
        forgotPasswordElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        forgotPasswordElementTest.inputConfirmPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        sleep(ConstHelper.NUMBER_5000_MLS);
        forgotPasswordElementTest.buttonSubmit.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }
}
