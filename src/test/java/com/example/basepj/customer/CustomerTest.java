package com.example.basepj.customer;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.example.basepj.dashboard.DashboardElementTest;
import com.example.basepj.helper.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static com.example.basepj.customer.AgencyElementTest.*;
import static com.example.basepj.customer.RetailCustomerElementTest.*;
import static com.example.basepj.customer.RetailCustomerElementTest.inputEmailElementUpdate;
import static com.example.basepj.helper.AntDesignClass.ANT_DESIGN_SELECT_DROPDOWN_MENU_ITEM;
import static com.example.basepj.helper.BrowserHelper.setupWebDriver;
import static com.example.basepj.helper.ConstKeySendHelper.*;
import static com.example.basepj.helper.Utils.*;

public class CustomerTest {
    CustomerElementTest customerElementTest = new CustomerElementTest();
    DashboardElementTest dashboardElementTest = new DashboardElementTest();

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
    public void test_View_List_Agency() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathAgent.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Create_Agency() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathAgent.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        customerElementTest.pathAddAgencyElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        agencyNameElement.sendKeys(KEY_SEND_AGENCY_NAME_CREATE);
        agencyTaxElement.sendKeys(KEY_SEND_AGENCY_TAX_CREATE);
        agencyUploadLogoElement.hover().click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyBusinessLicenseElement.hover().click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyEmailElement.sendKeys(KEY_SEND_AGENCY_EMAIL_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyCharacterCapitalElement.sendKeys(KEY_SEND_AGENCY_CHARACTER_CAPITAL_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyCompanySizesElement.click();
        $$(ANT_DESIGN_SELECT_DROPDOWN_MENU_ITEM).find(text(getRandomText(listSize))).click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyBusinessSectorsElement.click();
        $$(ANT_DESIGN_SELECT_DROPDOWN_MENU_ITEM).find(text(getRandomText(listSector))).click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyHeadQuarterElement.sendKeys(KEY_SEND_AGENCY_HEAD_QUARTER_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyWebsiteElement.sendKeys(KEY_SEND_AGENCY_WEBSITE_CREATE);
        // legal
        agencyLegalRepresentationNameElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_NAME_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyLegalRepresentationPositionElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_POSITION_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyLegalRepresentationEmailElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_EMAIL_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyLegalRepresentationPhoneElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_PHONE_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        // contact
        agencyContactNameElement.sendKeys(KEY_SEND_AGENCY_CONTACT_NAME_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyContactPositionElement.sendKeys(KEY_SEND_AGENCY_CONTACT_POSITION_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyContactEmailElement.sendKeys(KEY_SEND_AGENCY_CONTACT_EMAIL_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencyContactPhoneElement.sendKeys(KEY_SEND_AGENCY_CONTACT_PHONE_CREATE);
        sleep(ConstHelper.NUMBER_5000_MLS);
        agencySaveButtonElement.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_Hover_First_Row_Agency() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathAgent.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        $$(".ant-table-row-level-0[data-row-key='109']").forEach(cell -> {
            String cellValue = cell.text();
            System.out.print(cellValue + "\n");
        });
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_View_Detail_Agency() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathAgent.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x("/html/body/div/div/div/div/main/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[7]/div/div[1]/button/span/span").click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_Edit_When_On_Agency_Detail() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathAgent.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x("/html/body/div/div/div/div/main/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[7]/div/div[1]/button/span/span").click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        String buttonSelector = "//span[contains(text(),'Chỉnh sửa đại lý')]";
        $x(buttonSelector).shouldBe(visible).click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        deleteValue(agencyUpdateNameElement);
        agencyUpdateNameElement.setValue(KEY_SEND_AGENCY_NAME_UPDATE);
        deleteValue(agencyUpdateTaxElement);
        agencyUpdateTaxElement.setValue(KEY_SEND_AGENCY_TAX_UPDATE);
        boolean isExist = agencyUpdateUploadLogoElement.exists();
        if (isExist) {
            agencyUpdateUploadLogoElement.click();
            sleep(ConstHelper.NUMBER_10000_MLS);
        } else {
            boolean existLogo = agencyUpdateUploadLogoWhenLogoExistElement.exists();
            if (existLogo) {
                agencyUpdateUploadLogoWhenLogoExistElement.click();
                sleep(ConstHelper.NUMBER_10000_MLS);
            }
        }
        agencyUpdateBusinessLicenseElement.shouldBe(visible).click();
        sleep(ConstHelper.NUMBER_10000_MLS);
        deleteValue(agencyUpdateEmailElement);
        agencyUpdateEmailElement.sendKeys(KEY_SEND_AGENCY_EMAIL_UPDATE);
        deleteValue(agencyUpdateCharacterCapitalElement);
        agencyUpdateCharacterCapitalElement.sendKeys(KEY_SEND_AGENCY_CHARACTER_CAPITAL_UPDATE);
        $x("//div[@class='ant-select-selector'][.//*[@id='size']]").click();
        String sizeText = getRandomText(listSize);
        System.out.println(sizeText);
        $$(ANT_DESIGN_SELECT_DROPDOWN_MENU_ITEM).find(text(sizeText)).click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        String sectorText = getRandomText(listSector);
        System.out.println(sectorText);
        $x("//div[@class='ant-select-selector'][.//*[@id='businessSectors']]").click();
        $$(ANT_DESIGN_SELECT_DROPDOWN_MENU_ITEM).find(text(sectorText)).click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        deleteValue(agencyUpdateHeadQuarterElement);
        agencyUpdateHeadQuarterElement.sendKeys(KEY_SEND_AGENCY_HEAD_QUARTER_UPDATE);
        deleteValue(agencyLegalRepresentationPositionElement);
        // legal
        deleteValue(agencyLegalRepresentationNameElement);
        agencyLegalRepresentationNameElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_NAME_UPDATE);
        agencyLegalRepresentationPositionElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_POSITION_UPDATE);
        deleteValue(agencyLegalRepresentationPhoneElement);
        agencyLegalRepresentationPhoneElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_PHONE_UPDATE);
        deleteValue(agencyLegalRepresentationEmailElement);
        agencyLegalRepresentationEmailElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_EMAIL_UPDATE);
        // contact
        deleteValue(agencyContactNameElement);
        agencyContactNameElement.sendKeys(KEY_SEND_AGENCY_CONTACT_NAME_UPDATE);
        agencyContactPositionElement.sendKeys(KEY_SEND_AGENCY_CONTACT_POSITION_UPDATE);
        deleteValue(agencyContactPhoneElement);
        agencyContactPhoneElement.sendKeys(KEY_SEND_AGENCY_CONTACT_PHONE_UPDATE);
        deleteValue(agencyContactEmailElement);
        agencyContactEmailElement.sendKeys(KEY_SEND_AGENCY_CONTACT_EMAIL_UPDATE);
        agencyUpdateSaveButtonElement.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_Edit_Agency() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathAgent.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        boolean checkButtonExist = $x("//button[@class='ant-btn css-1l93uv0 ant-btn-default ant-btn-icon-only ant-dropdown-trigger']").exists();
        sleep(ConstHelper.NUMBER_2000_MLS);
        if (checkButtonExist) {
            $x("//button[@class='ant-btn css-1l93uv0 ant-btn-default ant-btn-icon-only ant-dropdown-trigger']").hover();
            sleep(ConstHelper.NUMBER_2000_MLS);
            boolean checkExistBtnEdit = $x("//li[@class='ant-dropdown-menu-item']//span[@class='ant-dropdown-menu-title-content'][contains(text(),'Sửa đại lý')]").exists();
            sleep(ConstHelper.NUMBER_2000_MLS);
            if (checkExistBtnEdit) {
                $x("//li[@class='ant-dropdown-menu-item']//span[@class='ant-dropdown-menu-title-content'][contains(text(),'Sửa đại lý')]").click();
            }
        }
        sleep(ConstHelper.NUMBER_5000_MLS);
        deleteValue(agencyUpdateNameElement);
        agencyUpdateNameElement.setValue(KEY_SEND_AGENCY_NAME_UPDATE);
        deleteValue(agencyUpdateTaxElement);
        agencyUpdateTaxElement.setValue(KEY_SEND_AGENCY_TAX_UPDATE);
        boolean isExist = agencyUpdateUploadLogoElement.exists();
        if (isExist) {
            agencyUpdateUploadLogoElement.click();
            sleep(ConstHelper.NUMBER_10000_MLS);
        } else {
            boolean existLogo = agencyUpdateUploadLogoWhenLogoExistElement.exists();
            if (existLogo) {
                agencyUpdateUploadLogoWhenLogoExistElement.click();
                sleep(ConstHelper.NUMBER_10000_MLS);
            }
        }
        agencyUpdateBusinessLicenseElement.shouldBe(visible).click();
        sleep(ConstHelper.NUMBER_10000_MLS);
        deleteValue(agencyUpdateEmailElement);
        agencyUpdateEmailElement.sendKeys(KEY_SEND_AGENCY_EMAIL_UPDATE);
        deleteValue(agencyUpdateCharacterCapitalElement);
        agencyUpdateCharacterCapitalElement.sendKeys(KEY_SEND_AGENCY_CHARACTER_CAPITAL_UPDATE);
        $x("//div[@class='ant-select-selector'][.//*[@id='size']]").click();
        String sizeText = getRandomText(listSize);
        System.out.println(sizeText);
        $$(ANT_DESIGN_SELECT_DROPDOWN_MENU_ITEM).find(text(sizeText)).click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        String sectorText = getRandomText(listSector);
        System.out.println(sectorText);
        $x("//div[@class='ant-select-selector'][.//*[@id='businessSectors']]").click();
        $$(ANT_DESIGN_SELECT_DROPDOWN_MENU_ITEM).find(text(sectorText)).click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        deleteValue(agencyUpdateHeadQuarterElement);
        agencyUpdateHeadQuarterElement.sendKeys(KEY_SEND_AGENCY_HEAD_QUARTER_UPDATE);
        deleteValue(agencyLegalRepresentationPositionElement);
        // legal
        deleteValue(agencyLegalRepresentationNameElement);
        agencyLegalRepresentationNameElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_NAME_UPDATE);
        agencyLegalRepresentationPositionElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_POSITION_UPDATE);
        deleteValue(agencyLegalRepresentationPhoneElement);
        agencyLegalRepresentationPhoneElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_PHONE_UPDATE);
        deleteValue(agencyLegalRepresentationEmailElement);
        agencyLegalRepresentationEmailElement.sendKeys(KEY_SEND_AGENCY_LEGAL_REPRESENTATION_EMAIL_UPDATE);
        // contact
        deleteValue(agencyContactNameElement);
        agencyContactNameElement.sendKeys(KEY_SEND_AGENCY_CONTACT_NAME_UPDATE);
        agencyContactPositionElement.sendKeys(KEY_SEND_AGENCY_CONTACT_POSITION_UPDATE);
        deleteValue(agencyContactPhoneElement);
        agencyContactPhoneElement.sendKeys(KEY_SEND_AGENCY_CONTACT_PHONE_UPDATE);
        deleteValue(agencyContactEmailElement);
        agencyContactEmailElement.sendKeys(KEY_SEND_AGENCY_CONTACT_EMAIL_UPDATE);
        agencyUpdateSaveButtonElement.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_Delete_Agency() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathAgent.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        boolean checkButtonExist = $x("//button[@class='ant-btn css-1l93uv0 ant-btn-default ant-btn-icon-only ant-dropdown-trigger']").exists();
        sleep(ConstHelper.NUMBER_2000_MLS);
        if (checkButtonExist) {
            $x("//button[@class='ant-btn css-1l93uv0 ant-btn-default ant-btn-icon-only ant-dropdown-trigger']").hover();
            sleep(ConstHelper.NUMBER_2000_MLS);
            boolean checkExistBtnEdit = $x("//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-danger']//span[@class='ant-dropdown-menu-title-content'][contains(text(),'Xoá đại lý')]").exists();
            sleep(ConstHelper.NUMBER_2000_MLS);
            if (checkExistBtnEdit) {
                $x("//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-danger']//span[@class='ant-dropdown-menu-title-content'][contains(text(),'Xoá đại lý')]").click();
            }
        }
        $x("//button[@type='button']//span[contains(text(),'Hủy')]").click();
//        $x("//button[@type='button']//span[contains(text(),'Xác nhận')]").click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_View_List_Customer() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Create_Customer() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        customerElementTest.pathAddCustomerElement.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        inputFullNameElement.sendKeys(KEY_SEND_RETAIL_CLIENT_FULL_NAME_CREATE);
        // gender
        String randomGender = getRandomText(listGender);
        String genderValue = "#" + "gender " + randomGender;
        $(genderValue).click();
        // date of birth
        $x("//*[@id='dateOfBirthValue']").click();
        selectDate(KEY_SEND_RETAIL_CLIENT_DATE_OF_BIRTH_CREATE);
        $x("//*[@id='dateOfBirthValue']").pressTab();
        inputPhoneElement.sendKeys(KEY_SEND_RETAIL_CLIENT_PHONE_CREATE);
        inputEmailElement.sendKeys(KEY_SEND_RETAIL_CLIENT_EMAIL_CREATE);
        inputAddressElement.sendKeys(KEY_SEND_RETAIL_CLIENT_ADDRESS_CREATE);
        // Select a random option from the "Thành phố" dropdown
        selectRandomOptionFromDropdown("#provinceCode");
        // Select a random option from the "Quận" dropdown
        selectRandomOptionFromDropdown("#districtCode");
        // Select a random option from the "Phường" dropdown
        selectRandomOptionFromDropdown("#wardCode");
        uploadImage("#avatar", BASE_PATH + "images/" + "profile.png");
        sleep(ConstHelper.NUMBER_10000_MLS);
        btnSaveCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        closeWindow();
    }

    @Test
    public void test_Hover_First_Row_Customer() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        List<SelenideElement> rows = $$(".ant-table-tbody > tr");
        int randomIndex = new Random().nextInt(rows.size());
        SelenideElement randomRow = rows.get(randomIndex);
        randomRow.$$(".ant-table-cell").forEach(column -> {
            // Extract text from each column
            String columnText = column.text();
            // You can use this text or store it in a list, array, etc.
            System.out.println(columnText);
        });
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_View_Detail_Customer() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x("/html/body/div/div/div/div/main/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[7]/div/div[1]/button/span/span").click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_Edit_When_On_Customer_Retail_Detail() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        $x("/html/body/div/div/div/div/main/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[7]/div/div[1]/button/span/span").click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        String buttonSelector = "//span[contains(text(),'Chỉnh sửa khách hàng lẻ')]";
        $x(buttonSelector).shouldBe(visible).click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        deleteValue(inputFullNameElementUpdate);
        inputFullNameElementUpdate.setValue(KEY_SEND_RETAIL_CLIENT_FULL_NAME_UPDATE);
        deleteValue(inputDoBElementUpdate);
        $("#dateOfBirthValue").click();
        setDateInDatePicker(KEY_SEND_RETAIL_CLIENT_DATE_OF_BIRTH_UPDATE);
        boolean isExist = $("img[alt='avatar']").exists();
        if (isExist) {
            $("img[alt='avatar']").click();
            sleep(ConstHelper.NUMBER_10000_MLS);
        } else {
            $x("//div[contains(text(),'Upload')]").click();
            sleep(ConstHelper.NUMBER_10000_MLS);
        }
        //gender
        ElementsCollection options = $$(".ant-radio-input");
        // Generate a random index
        int randomIndex = (int) (Math.random() * options.size());
        // Click on the randomly selected radio option
        options.get(randomIndex).click();
        deleteValue(inputPhoneElementUpdate);
        inputPhoneElementUpdate.sendKeys(KEY_SEND_RETAIL_CLIENT_PHONE_UPDATE);
        deleteValue(inputEmailElementUpdate);
        inputEmailElementUpdate.sendKeys(KEY_SEND_RETAIL_CLIENT_EMAIL_UPDATE);
        deleteValue(inputAddressElementUpdate);
        inputAddressElementUpdate.sendKeys(KEY_SEND_RETAIL_CLIENT_ADDRESS_UPDATE);
        sleep(ConstHelper.NUMBER_10000_MLS);
        // Select a random option from the "Thành phố" dropdown
        selectRandomOptionFromDropdown("#provinceCode");
        sleep(ConstHelper.NUMBER_5000_MLS);
        // Select a random option from the "Quận" dropdown
        selectRandomOptionFromDropdown("#districtCode");
        sleep(ConstHelper.NUMBER_5000_MLS);
        // Select a random option from the "Phường" dropdown
        selectRandomOptionFromDropdown("#wardCode");
        sleep(ConstHelper.NUMBER_5000_MLS);
//        btnSaveCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }

    @Test
    public void test_Delete_Customer_Retail() {
        Utils.loginWithCustomEmailAndPassword(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL, ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        dashboardElementTest.buttonShowCustomer.click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        Utils.closeSkipTour();
        sleep(ConstHelper.NUMBER_5000_MLS);
        dashboardElementTest.buttonPathCustomer.click();
        sleep(ConstHelper.NUMBER_2000_MLS);
        boolean checkButtonExist = $x("//button[@class='ant-btn css-1l93uv0 ant-btn-default ant-btn-icon-only ant-dropdown-trigger']").exists();
        sleep(ConstHelper.NUMBER_2000_MLS);
        if (checkButtonExist) {
            $x("//button[@class='ant-btn css-1l93uv0 ant-btn-default ant-btn-icon-only ant-dropdown-trigger']").hover();
            sleep(ConstHelper.NUMBER_2000_MLS);
            boolean checkExistBtnEdit = $x("//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-danger']//span[@class='ant-dropdown-menu-title-content'][contains(text(),'Xoá khách hàng lẻ')]").exists();
            sleep(ConstHelper.NUMBER_2000_MLS);
            if (checkExistBtnEdit) {
                $x("//li[@class='ant-dropdown-menu-item ant-dropdown-menu-item-danger']//span[@class='ant-dropdown-menu-title-content'][contains(text(),'Xoá khách hàng lẻ')]").click();
            }
        }
        $x("//button[@type='button']//span[contains(text(),'Hủy')]").click();
//        $x("//button[@type='button']//span[contains(text(),'Xác nhận')]").click();
        sleep(ConstHelper.NUMBER_5000_MLS);
        closeWindow();
    }
}
