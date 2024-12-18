package com.example.basepj.login;

import com.example.basepj.helper.*;
import com.example.basepj.helper.constant.LoginPagePath;
import com.example.basepj.helper.constant.RegisterPagePath;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.example.basepj.helper.BrowserHelper.setupWebDriver;

public class LoginTest {
    LoginElementTest loginElementTest = new LoginElementTest();

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
    public void test_Login_Blank() {
        loginElementTest.submitButtonElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(LoginPagePath.ERROR_EMAIL_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_EMAIL_BLANK));
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(LoginPagePath.ERROR_PASSWORD_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_PASSWORD_BLANK));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Login_Password_Blank() {
        loginElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        loginElementTest.submitButtonElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(LoginPagePath.ERROR_PASSWORD_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_PASSWORD_BLANK));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Login_Email_Blank() {
        loginElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        loginElementTest.submitButtonElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(LoginPagePath.ERROR_EMAIL_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_EMAIL_BLANK));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Login_Email_Invalid_Type() {
        loginElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL_INVALID_TYPE);
        loginElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        loginElementTest.submitButtonElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(LoginPagePath.ERROR_EMAIL_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_EMAIL_FORMAT_2));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Login_Password_Less_Than_6_Characters() {
        loginElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        loginElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_FOUR_CHARACTERS_PASSWORD);
        loginElementTest.submitButtonElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(LoginPagePath.ERROR_PASSWORD_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_PASSWORD_LESS_THAN_6_CHARACTER));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Login_Email_Not_In_The_System() {
        loginElementTest.inputEmailElement.sendKeys(ConstKeySendHelper.KEY_SEND_REGISTER_EMAIL);
        loginElementTest.inputPasswordElement.sendKeys(ConstKeySendHelper.KEY_SEND_SIX_CHARACTERS_PASSWORD);
        loginElementTest.submitButtonElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x(LoginPagePath.ERROR_PASSWORD_ELEMENT).shouldHave(text(ConstantTextHelper.ERROR_PASSWORD_LESS_THAN_6_CHARACTER));
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Login() {
        Utils.login();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Go_To_Register() {
        loginElementTest.registerPathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Go_To_Forgot_Password() {
        loginElementTest.forgotPasswordPathElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }
}
