package com.example.basepj.forgot_password;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.example.basepj.helper.constant.ForgotPasswordPath;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class ForgotPasswordElementTest {
    public SelenideElement inputEmailElement = $x(ForgotPasswordPath.INPUT_EMAIL_FORGOT_PASSWORD_ELEMENT);
    public SelenideElement inputPasswordElement = $x(ForgotPasswordPath.INPUT_PASSWORD_ELEMENT);
    public SelenideElement inputConfirmPasswordElement = $x(ForgotPasswordPath.INPUT_CONFIRM_PASSWORD_ELEMENT);
    public SelenideElement inputOtp01 = $x(ForgotPasswordPath.INPUT_OTP_01);
    public SelenideElement inputOtp02 = $x(ForgotPasswordPath.INPUT_OTP_02);
    public SelenideElement inputOtp03 = $x(ForgotPasswordPath.INPUT_OTP_03);
    public SelenideElement inputOtp04 = $x(ForgotPasswordPath.INPUT_OTP_04);
    public SelenideElement buttonSubmit = $x(ForgotPasswordPath.BUTTON_SUBMIT_ELEMENT);
    public ElementsCollection cssErrorOtp = $$(ForgotPasswordPath.CSS_ERROR_OTP);
}
