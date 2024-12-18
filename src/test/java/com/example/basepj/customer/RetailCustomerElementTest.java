package com.example.basepj.customer;

import com.codeborne.selenide.SelenideElement;
import com.example.basepj.helper.constant.CustomerInputPath;

import static com.codeborne.selenide.Selenide.$x;

public class RetailCustomerElementTest {
    public static SelenideElement inputFullNameElement = $x(CustomerInputPath.CUSTOMER_FULL_NAME);
    public static SelenideElement inputDoBElement = $x(CustomerInputPath.CUSTOMER_DATE_OF_BIRTH);
    public static SelenideElement inputGenderElement = $x(CustomerInputPath.CUSTOMER_GENDER);
    public static SelenideElement inputPhoneElement = $x(CustomerInputPath.CUSTOMER_PHONE);
    public static SelenideElement inputEmailElement = $x(CustomerInputPath.CUSTOMER_EMAIL);
    public static SelenideElement inputAddressElement = $x(CustomerInputPath.CUSTOMER_ADDRESS);
    public static SelenideElement inputProvinceCodeElement = $x(CustomerInputPath.CUSTOMER_PROVINCE_CODE);
    public static SelenideElement inputDistrictCodeElement = $x(CustomerInputPath.CUSTOMER_DISTRICT_CODE);
    public static SelenideElement inputWardCodeElement = $x(CustomerInputPath.CUSTOMER_WARD_CODE);
    public static SelenideElement inputErrorCustomerNameElement = $x(CustomerInputPath.ERROR_CUSTOMER_NAME);
    public static SelenideElement btnSaveCustomer = $x(CustomerInputPath.BTN_SAVE);

    public static SelenideElement inputFullNameElementUpdate = $x(CustomerInputPath.CUSTOMER_FULL_NAME);
    public static SelenideElement inputDoBElementUpdate = $x(CustomerInputPath.CUSTOMER_DATE_OF_BIRTH);
    public static SelenideElement inputGenderElementUpdate = $x(CustomerInputPath.CUSTOMER_GENDER);
    public static SelenideElement inputPhoneElementUpdate = $x(CustomerInputPath.CUSTOMER_PHONE);
    public static SelenideElement inputEmailElementUpdate = $x(CustomerInputPath.CUSTOMER_EMAIL);
    public static SelenideElement inputAddressElementUpdate = $x(CustomerInputPath.CUSTOMER_ADDRESS);
    public static SelenideElement inputProvinceCodeElementUpdate = $x(CustomerInputPath.CUSTOMER_PROVINCE_CODE);
    public static SelenideElement inputDistrictCodeElementUpdate = $x(CustomerInputPath.CUSTOMER_DISTRICT_CODE);
    public static SelenideElement inputWardCodeElementUpdate = $x(CustomerInputPath.CUSTOMER_WARD_CODE);
    public static SelenideElement inputErrorCustomerNameElementUpdate = $x(CustomerInputPath.ERROR_CUSTOMER_NAME);
    public static SelenideElement btnSaveCustomerUpdate = $x(CustomerInputPath.BTN_SAVE);
}
