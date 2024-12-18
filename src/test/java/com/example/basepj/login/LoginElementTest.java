package com.example.basepj.login;

import com.codeborne.selenide.SelenideElement;
import com.example.basepj.helper.constant.LoginPagePath;

import static com.codeborne.selenide.Selenide.$x;

public class LoginElementTest {
    public SelenideElement inputEmailElement = $x(LoginPagePath.INPUT_EMAIL_ELEMENT);
    public SelenideElement inputPasswordElement = $x(LoginPagePath.INPUT_PASSWORD_ELEMENT);
    public SelenideElement errorEmailElement = $x(LoginPagePath.ERROR_EMAIL_ELEMENT);
    public SelenideElement errorPasswordElement = $x(LoginPagePath.ERROR_PASSWORD_ELEMENT);
    public SelenideElement registerPathElement = $x(LoginPagePath.REGISTER_PATH_ELEMENT);
    public SelenideElement forgotPasswordPathElement = $x(LoginPagePath.FORGOT_PASSWORD_PATH_ELEMENT);
    public SelenideElement submitButtonElement = $x(LoginPagePath.BUTTON_SUBMIT_ELEMENT);
}
