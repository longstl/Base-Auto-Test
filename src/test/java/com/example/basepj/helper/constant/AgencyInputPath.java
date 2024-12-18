package com.example.basepj.helper.constant;

public class AgencyInputPath {
    public static final String AGENCY_NAME_ELEMENT = "//input[@id='name']";
    public static final String AGENCY_TAX_CODE_ELEMENT = "//input[@id='taxCode']";
    public static final String AGENCY_UPLOAD_BUSINESS_LICENSE = "//span[contains(text(),'Tải lên')]";
    public static final String AGENCY_EMAIL = "//input[@id='email']";
    public static final String AGENCY_UPLOAD_LOGO = "//div[contains(text(),'Upload')]";
    public static final String AGENCY_CHARACTER_CAPITAL = "//input[@id='charterCapital']";
    public static final String AGENCY_COMPANY_SIZE = "//input[@id='size']";
    public static final String AGENCY_COMPANY_SIZE_OPTION_0_TO_50 = "//div[contains(text(),'0 - 50 nhân viên')]";
    public static final String AGENCY_COMPANY_SIZE_OPTION_50_TO_100 = "//div[contains(text(),'50 - 100 nhân viên')]";
    public static final String AGENCY_COMPANY_SIZE_OPTION_OVER_100 = "//div[contains(text(),'100++ nhân viên')]";
    public static final String AGENCY_BUSINESS_SECTORS = "//input[@id='businessSectors']";
    public static final String AGENCY_BUSINESS_SECTOR_ELECTRONIC_ENGINEERING = "//div[@title='Kỹ thuật điện tử']//div[1]";
    public static final String AGENCY_BUSINESS_SECTOR_PROCESS_FOOD = "//div[@title='Chế biến thực phẩm']//div[1]";
    public static final String AGENCY_BUSINESS_SECTOR_CONSTRUCT = "//div[@title='Xây dựng']//div[1]";
    public static final String AGENCY_BUSINESS_SECTOR_TRAVEL_AND_SERVICE = "//div[@title='Dịch vụ & du lịch']//div[1]";
    public static final String AGENCY_BUSINESS_SECTOR_BANKING_FINANCE = "//div[@title='Tài chính – Ngân hàng']//div[1]";
    public static final String AGENCY_HEAD_QUARTER = "//input[@id='headquarters']";
    public static final String AGENCY_WEBSITE = "//input[@id='website']";
    public static final String AGENCY_LEGAL_REPRESENTATION_NAME = "//input[@id='legalRepresentationName']";
    public static final String AGENCY_LEGAL_REPRESENTATION_POSITION = "//input[@id='legalRepresentationPosition']";
    public static final String AGENCY_LEGAL_REPRESENTATION_PHONE = "//input[@id='legalRepresentationPhone']";
    public static final String AGENCY_LEGAL_REPRESENTATION_EMAIL = "//input[@id='legalRepresentationEmail']";
    public static final String AGENCY_CONTACT_NAME = "//input[@id='contactName']";
    public static final String AGENCY_CONTACT_POSITION = "//input[@id='contactPosition']";
    public static final String AGENCY_CONTACT_PHONE = "//input[@id='contactPhone']";
    public static final String AGENCY_CONTACT_EMAIL = "//input[@id='contactEmail']";
    // button submit
    public static final String AGENCY_SAVE_BUTTON = "//button[@type='submit']";
    // error
    public static final String ERROR_AGENCY_IMAGE_EXTENSION = "//div[@class='ant-message-notice-content']";
    public static final String ERROR_AGENCY_NAME = "//div[@id='name_help']//div[1]";
    public static final String ERROR_AGENCY_TAX = "//div[@id='taxCode_help']//div[1]";
    // edit
    public static final String AGENCY_UPLOAD_LOGO_WHEN_HAS_LOGO = "//span[@class='ant-upload-wrapper picture-card-uploader css-1l93uv0 ant-upload-picture-card-wrapper']//span[@role='button']";
    public static final String AGENCY_UPDATE_SIZE_LIST = "//*[@id='size_list']";
    public static final String AGENCY_UPDATE_SECTOR_LIST = "//*[@id='businessSectors_list']";
}
