package com.example.basepj.customer;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.example.basepj.helper.constant.CustomerPath.*;
import static com.example.basepj.helper.constant.DashboardPath.*;

public class CustomerElementTest {
    public SelenideElement pathCustomerElement = $x(BUTTON_SHOW_CUSTOMER);
    public SelenideElement pathProviderChildElement = $x(BUTTON_PATH_PROVIDER);
    public SelenideElement pathAgencyChildElement = $x(BUTTON_PATH_AGENCIES);
    public SelenideElement pathCustomerChildElement = $x(BUTTON_PATH_CUSTOMER);
    public SelenideElement pathAddAgencyElement = $x(ADD_AGENCY);
    public SelenideElement pathAddCustomerElement = $x(ADD_CUSTOMER);
    public SelenideElement showItemElement = $x(SHOW_ITEM);
    public SelenideElement showMoreActionElement = $x(SHOW_MORE_ACTION);
    public SelenideElement editAgencyElement = $x(EDIT_AGENCY);
    public SelenideElement deleteAgencyElement = $x(DELETE_AGENCY);
    public SelenideElement editCustomerElement = $x(EDIT_CUSTOMER);
    public SelenideElement deleteCustomerElement = $x(DELETE_CUSTOMER);
    public SelenideElement inputSearchPath = $x(INPUT_SEARCH);
    public SelenideElement btnSearchPath = $x(BTN_SEARCH);
}
