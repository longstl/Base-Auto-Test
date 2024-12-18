package com.example.basepj.dashboard;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.example.basepj.helper.constant.DashboardPath.*;

public class DashboardElementTest {
    public SelenideElement buttonShowHideSideBar = $x(BUTTON_SHOW_SIDE_BAR);
    public SelenideElement buttonShowInfo = $x(BUTTON_SHOW_INFO);
    public SelenideElement buttonShowCustomer = $x(BUTTON_SHOW_CUSTOMER);
    public SelenideElement buttonPathProvider = $x(BUTTON_PATH_PROVIDER);
    public SelenideElement buttonPathAgent = $x(BUTTON_PATH_AGENCIES);
    public SelenideElement buttonPathCustomer = $x(BUTTON_PATH_CUSTOMER);
    public SelenideElement buttonShowWarehouse = $x(BUTTON_SHOW_WAREHOUSE);
    public SelenideElement buttonPathProductList = $x(BUTTON_PATH_PRODUCT_LIST);
    public SelenideElement buttonAddCombo = $x(BUTTON_PATH_ADD_COMBO);
    public SelenideElement buttonMarketingChanel = $x(BUTTON_PATH_MARKETING_CHANNEL);
    public SelenideElement buttonPathCampaignEffective = $x(BUTTON_PATH_CAMPAIGN_EFFECTIVE);
    public SelenideElement buttonPathListCampaign = $x(BUTTON_PATH_LIST_CAMPAIGN);
    public SelenideElement buttonPathOrder = $x(BUTTON_PATH_ORDER);
    public SelenideElement buttonSetting = $x(BUTTON_SETTING);
    public SelenideElement buttonBusinessProfile = $x(BUTTON_BUSINESS_PROFILE);
    public SelenideElement buttonPaymentMethod = $x(BUTTON_PAYMENT_METHOD);
    public SelenideElement buttonProfilePath = $x(BUTTON_PATH_PROFILE);
    public SelenideElement buttonProfile = $x(BUTTON_PROFILE);
    public SelenideElement buttonChangePassword = $x(BUTTON_CHANGE_PASSWORD);
    public SelenideElement buttonLogout = $x(BUTTON_LOGOUT);
    public SelenideElement buttonCloseSkipTour = $x(CLOSE_SKIP_TOUR);
}
