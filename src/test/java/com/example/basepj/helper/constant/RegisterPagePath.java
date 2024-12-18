package com.example.basepj.helper.constant;

public class RegisterPagePath {
    public static final String INPUT_EMAIL_ELEMENT = "//input[@id='email']";
    public static final String INPUT_PASSWORD_ELEMENT = "//input[@id='password']";
    public static final String INPUT_CONFIRM_PASSWORD_ELEMENT = "//input[@id='confirm']";
    public static final String CHECKBOX_ACCEPT_ELEMENT = "//input[@id='agreement']";
    public static final String BUTTON_REGISTER_ELEMENT = "//button[@type='submit']";
    public static final String PATH_LOGIN_NOW = "//a[contains(text(),'Đăng nhập ngay')]";
    public static final String PATH_TERM_AND_PRIVACY_POLICY = "//a[contains(text(),'điều khoản và chính sách bảo mật')]";
    public static final String ERROR_EMAIL_ELEMENT = "//div[@id='email_help']//div[1]";
    public static final String ERROR_PASSWORD_ELEMENT = "//div[@id='password_help']//div[1]";
    public static final String ERROR_CONFIRM_PASSWORD_ELEMENT = "//div[@id='confirm_help']//div[1]";
    public static final String ERROR_ACCEPT_TERM_AND_PRIVACY_POLICY_ELEMENT = "//div[@id='agreement_help']//div[1]";
    public static final String ERROR_OTP_AFTER_FIRST_STEP = "//p[@class='text-error text-sm']";
    public static final String INPUT_OTP_01 = "//*[@id='otp']//input[1]";
    public static final String INPUT_OTP_02 = "//*[@id='otp']//input[2]";
    public static final String INPUT_OTP_03 = "//*[@id='otp']//input[3]";
    public static final String INPUT_OTP_04 = "//*[@id='otp']//input[4]";
}
