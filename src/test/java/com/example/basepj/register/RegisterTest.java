package com.example.basepj.register;

import com.example.basepj.helper.ConstHelper;
import com.example.basepj.helper.ConstKeySendHelper;
import com.example.basepj.helper.ConstantTextHelper;
import com.example.basepj.helper.UrlHelper;
import com.example.basepj.helper.constant.RegisterPagePath;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.example.basepj.helper.BrowserHelper.setupWebDriver;
import static com.codeborne.selenide.Condition.*;

public class RegisterTest {
    RegisterElementTest registerElementTest = new RegisterElementTest();

    @BeforeMethod
    public void setUp() {
        String browser = System.getProperty(ConstHelper.KEY_BROWSER, ConstHelper.BROWSER_CHROME);
        setupWebDriver(browser, ConstHelper.SETTING_BROWSER_SIZE_1920_x_1080, ConstHelper.SETTING_FALSE);
        open(UrlHelper.HTTPS_PROTOCOL  + UrlHelper.BASE_URL_TA_CONNECT_TEST + UrlHelper.REGISTER_URI);
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    public void test_Go_To_Register_Page() {

    }

    @Test
    public void test_Blank_All_Fields() {
        registerElementTest.buttonRegisterElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(RegisterPagePath.ERROR_EMAIL_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_EMAIL_BLANK));
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(RegisterPagePath.ERROR_PASSWORD_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_PASSWORD_BLANK));
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(RegisterPagePath.ERROR_CONFIRM_PASSWORD_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_CONFIRM_PASSWORD_BLANK));
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(RegisterPagePath.ERROR_ACCEPT_TERM_AND_PRIVACY_POLICY_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_ACCEPT_NOT_CHECK_TERM_AND_PRIVACY_POLICY));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Password_Not_Enough_6_Character() {
        registerElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        registerElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_FOUR_CHARACTERS_PASSWORD);
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(RegisterPagePath.ERROR_PASSWORD_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_PASSWORD_LESS_THAN_6_CHARACTER));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Password_and_Confirm_Password_Not_Match() {
        registerElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        registerElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        registerElementTest.inputConfirmPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_FOUR_CHARACTERS_PASSWORD);
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(RegisterPagePath.ERROR_CONFIRM_PASSWORD_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_CONFIRM_PASSWORD_NOT_MATCH));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Full_Step_1_Register() {
        registerElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        registerElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        registerElementTest.inputConfirmPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        registerElementTest.inputAcceptCheckboxElement.click();
        registerElementTest.buttonRegisterElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Wrong_Otp() {
        registerElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        registerElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        registerElementTest.inputConfirmPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        registerElementTest.inputAcceptCheckboxElement.click();
        registerElementTest.buttonRegisterElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        registerElementTest.inputOtp01.sendKeys(ConstKeySendHelper.KEY_SEND_ONE);
        registerElementTest.inputOtp02.sendKeys(ConstKeySendHelper.KEY_SEND_ONE);
        registerElementTest.inputOtp03.sendKeys(ConstKeySendHelper.KEY_SEND_ONE);
        registerElementTest.inputOtp04.sendKeys(ConstKeySendHelper.KEY_SEND_ONE);
        registerElementTest.buttonRegisterElement.click();
        $x(RegisterPagePath.ERROR_OTP_AFTER_FIRST_STEP).shouldHave(text(ConstantTextHelper.ERROR_OTP));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Tester_Input_Otp() {
        registerElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        registerElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        registerElementTest.inputConfirmPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        registerElementTest.inputAcceptCheckboxElement.click();
        registerElementTest.buttonRegisterElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        registerElementTest.buttonRegisterElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }
}
