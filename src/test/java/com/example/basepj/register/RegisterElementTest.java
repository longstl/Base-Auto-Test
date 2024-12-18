package com.example.basepj.register;

import com.codeborne.selenide.SelenideElement;
import com.example.basepj.helper.constant.RegisterPagePath;

import static com.codeborne.selenide.Selenide.$x;

public class RegisterElementTest {
    public SelenideElement inputEmailElement = $x(RegisterPagePath.INPUT_EMAIL_ELEMENT);
    public SelenideElement inputPasswordElement = $x(RegisterPagePath.INPUT_PASSWORD_ELEMENT);
    public SelenideElement inputConfirmPasswordElement = $x(RegisterPagePath.INPUT_CONFIRM_PASSWORD_ELEMENT);
    public SelenideElement inputAcceptCheckboxElement = $x(RegisterPagePath.CHECKBOX_ACCEPT_ELEMENT);
    public SelenideElement buttonRegisterElement = $x(RegisterPagePath.BUTTON_REGISTER_ELEMENT);
    public SelenideElement loginNowPathElement = $x(RegisterPagePath.PATH_LOGIN_NOW);
    public SelenideElement pathTermAndPrivacyPolicyElement = $x(RegisterPagePath.PATH_TERM_AND_PRIVACY_POLICY);
    public SelenideElement errorEmailElement = $x(RegisterPagePath.ERROR_EMAIL_ELEMENT);
    public SelenideElement errorPasswordElement = $x(RegisterPagePath.ERROR_PASSWORD_ELEMENT);
    public SelenideElement errorConfirmPasswordElement = $x(RegisterPagePath.ERROR_CONFIRM_PASSWORD_ELEMENT);
    public SelenideElement errorAcceptTermAndPrivacyPolicyElement = $x(RegisterPagePath.ERROR_ACCEPT_TERM_AND_PRIVACY_POLICY_ELEMENT);
    public SelenideElement inputOtp01 = $x(RegisterPagePath.INPUT_OTP_01);
    public SelenideElement inputOtp02 = $x(RegisterPagePath.INPUT_OTP_02);
    public SelenideElement inputOtp03 = $x(RegisterPagePath.INPUT_OTP_03);
    public SelenideElement inputOtp04 = $x(RegisterPagePath.INPUT_OTP_04);
    public SelenideElement errorInputOtpIncorrect = $x(RegisterPagePath.ERROR_OTP_AFTER_FIRST_STEP);
}
