package com.example.basepj.customer;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.example.basepj.helper.constant.AgencyInputPath.*;

public class AgencyElementTest {
    public static final SelenideElement agencyNameElement = $x(AGENCY_NAME_ELEMENT);
    public static final SelenideElement agencyTaxElement = $x(AGENCY_TAX_CODE_ELEMENT);
    public static final SelenideElement agencyUploadLogoElement = $x(AGENCY_UPLOAD_LOGO);
    public static final SelenideElement agencyBusinessLicenseElement = $x(AGENCY_UPLOAD_BUSINESS_LICENSE);
    public static final SelenideElement agencyEmailElement = $x(AGENCY_EMAIL);
    public static final SelenideElement agencyCharacterCapitalElement = $x(AGENCY_CHARACTER_CAPITAL);
    //sizes
    public static final SelenideElement agencyCompanySizesElement = $x(AGENCY_COMPANY_SIZE);
    public static final SelenideElement agencyCompanySizeOption0To50Element = $x(AGENCY_COMPANY_SIZE_OPTION_0_TO_50);
    public static final SelenideElement agencyCompanySizeOption50To100Element = $x(AGENCY_COMPANY_SIZE_OPTION_50_TO_100);
    public static final SelenideElement agencyCompanySizeOptionOver100Element = $x(AGENCY_COMPANY_SIZE_OPTION_OVER_100);
    // sectors
    public static final SelenideElement agencyBusinessSectorsElement = $x(AGENCY_BUSINESS_SECTORS);
    public static final SelenideElement agencyBusinessSectorElectronicEngineeringElement = $x(AGENCY_BUSINESS_SECTOR_ELECTRONIC_ENGINEERING);
    public static final SelenideElement agencyBusinessSectorProcessFoodElement = $x(AGENCY_BUSINESS_SECTOR_PROCESS_FOOD);
    public static final SelenideElement agencyBusinessSectorConstructElement = $x(AGENCY_BUSINESS_SECTOR_CONSTRUCT);
    public static final SelenideElement agencyBusinessSectorTravelAndServiceElement = $x(AGENCY_BUSINESS_SECTOR_TRAVEL_AND_SERVICE);
    public static final SelenideElement agencyBusinessSectorBankingFinanceElement = $x(AGENCY_BUSINESS_SECTOR_BANKING_FINANCE);
    public static final SelenideElement agencyHeadQuarterElement = $x(AGENCY_HEAD_QUARTER);
    public static final SelenideElement agencyWebsiteElement = $x(AGENCY_WEBSITE);
    // legal
    public static final SelenideElement agencyLegalRepresentationNameElement = $x(AGENCY_LEGAL_REPRESENTATION_NAME);
    public static final SelenideElement agencyLegalRepresentationPositionElement = $x(AGENCY_LEGAL_REPRESENTATION_POSITION);
    public static final SelenideElement agencyLegalRepresentationPhoneElement = $x(AGENCY_LEGAL_REPRESENTATION_PHONE);
    public static final SelenideElement agencyLegalRepresentationEmailElement = $x(AGENCY_LEGAL_REPRESENTATION_EMAIL);
    // contact
    public static final SelenideElement agencyContactNameElement = $x(AGENCY_CONTACT_NAME);
    public static final SelenideElement agencyContactPositionElement = $x(AGENCY_CONTACT_POSITION);
    public static final SelenideElement agencyContactPhoneElement = $x(AGENCY_CONTACT_PHONE);
    public static final SelenideElement agencyContactEmailElement = $x(AGENCY_CONTACT_EMAIL);
    // button
    public static final SelenideElement agencySaveButtonElement = $x(AGENCY_SAVE_BUTTON);
    // error
    public static final SelenideElement agencyErrorAgencyImageExtensionElement = $x(ERROR_AGENCY_IMAGE_EXTENSION);
    public static final SelenideElement agencyErrorNameElement = $x(ERROR_AGENCY_NAME);
    public static final SelenideElement agencyErrorTaxElement = $x(ERROR_AGENCY_TAX);
    // update
    public static final SelenideElement agencyUpdateNameElement = $x(AGENCY_NAME_ELEMENT);
    public static final SelenideElement agencyUpdateTaxElement = $x(AGENCY_TAX_CODE_ELEMENT);
    public static final SelenideElement agencyUpdateUploadLogoElement = $x(AGENCY_UPLOAD_LOGO);
    public static final SelenideElement agencyUpdateUploadLogoWhenLogoExistElement = $x(AGENCY_UPLOAD_LOGO_WHEN_HAS_LOGO);
    public static final SelenideElement agencyUpdateBusinessLicenseElement = $x(AGENCY_UPLOAD_BUSINESS_LICENSE);
    public static final SelenideElement agencyUpdateEmailElement = $x(AGENCY_EMAIL);
    public static final SelenideElement agencyUpdateCharacterCapitalElement = $x(AGENCY_CHARACTER_CAPITAL);
    //sizes
    public static final SelenideElement agencyUpdateCompanySizesElement = $x(AGENCY_COMPANY_SIZE);
    public static final SelenideElement agencyUpdateCompanySizeOption0To50Element = $x(AGENCY_COMPANY_SIZE_OPTION_0_TO_50);
    public static final SelenideElement agencyUpdateCompanySizeOption50To100Element = $x(AGENCY_COMPANY_SIZE_OPTION_50_TO_100);
    public static final SelenideElement agencyUpdateCompanySizeOptionOver100Element = $x(AGENCY_COMPANY_SIZE_OPTION_OVER_100);
    // sectors
    public static final SelenideElement agencyUpdateBusinessSectorsElement = $x(AGENCY_BUSINESS_SECTORS);
    public static final SelenideElement agencyUpdateBusinessSectorElectronicEngineeringElement = $x(AGENCY_BUSINESS_SECTOR_ELECTRONIC_ENGINEERING);
    public static final SelenideElement agencyUpdateBusinessSectorProcessFoodElement = $x(AGENCY_BUSINESS_SECTOR_PROCESS_FOOD);
    public static final SelenideElement agencyUpdateBusinessSectorConstructElement = $x(AGENCY_BUSINESS_SECTOR_CONSTRUCT);
    public static final SelenideElement agencyUpdateBusinessSectorTravelAndServiceElement = $x(AGENCY_BUSINESS_SECTOR_TRAVEL_AND_SERVICE);
    public static final SelenideElement agencyUpdateBusinessSectorBankingFinanceElement = $x(AGENCY_BUSINESS_SECTOR_BANKING_FINANCE);
    public static final SelenideElement agencyUpdateHeadQuarterElement = $x(AGENCY_HEAD_QUARTER);
    public static final SelenideElement agencyUpdateWebsiteElement = $x(AGENCY_WEBSITE);
    // legal
    public static final SelenideElement agencyUpdateLegalRepresentationNameElement = $x(AGENCY_LEGAL_REPRESENTATION_NAME);
    public static final SelenideElement agencyUpdateLegalRepresentationPositionElement = $x(AGENCY_LEGAL_REPRESENTATION_POSITION);
    public static final SelenideElement agencyUpdateLegalRepresentationPhoneElement = $x(AGENCY_LEGAL_REPRESENTATION_PHONE);
    public static final SelenideElement agencyUpdateLegalRepresentationEmailElement = $x(AGENCY_LEGAL_REPRESENTATION_EMAIL);
    // contact
    public static final SelenideElement agencyUpdateContactNameElement = $x(AGENCY_CONTACT_NAME);
    public static final SelenideElement agencyUpdateContactPositionElement = $x(AGENCY_CONTACT_POSITION);
    public static final SelenideElement agencyUpdateContactPhoneElement = $x(AGENCY_CONTACT_PHONE);
    public static final SelenideElement agencyUpdateContactEmailElement = $x(AGENCY_CONTACT_EMAIL);
    // button
    public static final SelenideElement agencyUpdateSaveButtonElement = $x(AGENCY_SAVE_BUTTON);
    // error
    public static final SelenideElement agencyUpdateErrorAgencyImageExtensionElement = $x(ERROR_AGENCY_IMAGE_EXTENSION);
    public static final SelenideElement agencyUpdateErrorNameElement = $x(ERROR_AGENCY_NAME);
    public static final SelenideElement agencyUpdateErrorTaxElement = $x(ERROR_AGENCY_TAX);
}
