package com.example.basepj.helper;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.example.basepj.config.AppConfig;
import com.example.basepj.helper.constant.DashboardPath;
import com.example.basepj.helper.constant.ForgotPasswordPath;
import com.example.basepj.helper.constant.LoginPagePath;
import org.openqa.selenium.Keys;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.example.basepj.helper.AntDesignClass.*;

public class Utils {
    public static final String ENVIRONMENT = "test";
    public static final Yaml yaml = new Yaml();
    public static final String configFile = ENVIRONMENT + "-application.yml";
    public static final String BASE_PATH = "src/test/java/com/example/basepj/assets/";
    public static final String JSON_PATH = "json/";
    public static final String FILE_PATH = "files/";
    public static final String[] listSize = {"0 - 50 nhân viên", "50 - 100 nhân viên", "100++ nhân viên"};
    public static final String[] listSector = {"Kỹ thuật điện tử", "Chế biến thực phẩm", "Xây dựng", "Dịch vụ & du lịch", "Tài chính – Ngân hàng"};
    public static final String[] listGender = {"input[value='1']", "input[value='2']", "input[value='3']"};

    public static String getFullUrl() {
        try (InputStream inputStream = Utils.class.getClassLoader().getResourceAsStream(configFile)) {
            if (inputStream == null) {
                System.out.println("Configuration file not found for environment: " + ENVIRONMENT);
                return null;
            }

            AppConfig config = yaml.loadAs(inputStream, AppConfig.class);
            return config.getUrl().getProtocol() + config.getUrl().getUrl();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void scrollToElement(String element) {
        executeJavaScript("arguments[0].scrollIntoView(true);", $x(element));
    }

    public static void login() {
        $x(LoginPagePath.INPUT_EMAIL_ELEMENT).sendKeys(ConstKeySendHelper.KEY_SEND_CORRECT_EMAIL);
        $x(LoginPagePath.INPUT_PASSWORD_ELEMENT).sendKeys(ConstKeySendHelper.KEY_SEND_CORRECT_PASSWORD);
        $x(LoginPagePath.BUTTON_SUBMIT_ELEMENT).click();
    }

    public static void loginWithCustomEmailAndPassword(String email, String password) {
        $x(LoginPagePath.INPUT_EMAIL_ELEMENT).sendKeys(email);
        $x(LoginPagePath.INPUT_PASSWORD_ELEMENT).sendKeys(password);
        $x(LoginPagePath.BUTTON_SUBMIT_ELEMENT).click();
    }

    public static void forgotPassword(String email) {
        $x(ForgotPasswordPath.INPUT_EMAIL_FORGOT_PASSWORD_ELEMENT).sendKeys(email);
        $x(ForgotPasswordPath.BUTTON_SUBMIT_ELEMENT).click();
    }

    public static void closeSkipTour() {
        $x(DashboardPath.CLOSE_SKIP_TOUR).click();
    }

    public static void moveToElement(SelenideElement element) {
        actions().moveToElement(element).build().perform();
    }

    public static void openProfile() {
        $x(DashboardPath.BUTTON_PATH_PROFILE).click();
    }

    public static void clickElement(SelenideElement element) {
        element.click();
    }

    public static HashMap<String, ArrayList<Object>> readFile(String fileName) {
        HashMap<String, ArrayList<Object>> hashMap = new HashMap<>();
        ArrayList<Object> province = new ArrayList<>();
        ArrayList<Object> district = new ArrayList<>();
        ArrayList<Object> ward = new ArrayList<>();

        String fileWithPath = BASE_PATH + JSON_PATH + fileName;
        String path = new File(fileWithPath).getAbsolutePath();

        return null;
    }

    public static String getRandomText(String[] arr) {
        String s = "";
        Random random = new Random();
        int randomIndex = random.nextInt(arr.length);
        s = arr[randomIndex];
        return s;
    }

    public static void deleteValue(SelenideElement element) {
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
    }

    public static void randomOptionInSelect(SelenideElement element) {
        element.click();
        int optionsSize = $$(ANT_DESIGN_STYLE_SHEET_DROP_DOWN).size();
        int randomIndex = (int) (Math.random() * optionsSize);
        $$(ANT_DESIGN_STYLE_SHEET_DROP_DOWN).get(randomIndex).click();
    }

    private static int getRandomIndex(SelenideElement element) {
        // Count the number of options in the select element
        int optionCount = element.$$("option").size();

        // Generate a random index between 0 (inclusive) and optionCount (exclusive)
        return new Random().nextInt(optionCount);
    }

    public static void selectDate(String targetDate) {
        $(".ant-picker-input").find("input").setValue(targetDate);
    }

    public static void selectRandomOptionFromDropdown(String dropdownId) {
        // Locate the input field by ID and click to open the dropdown
        $(dropdownId).click();

        // Wait for the dropdown options to be visible
        $$(".ant-select-item").shouldHave(CollectionCondition.sizeGreaterThan(0));

        // Select a random visible option from the dropdown
        selectRandomVisibleOption(".ant-select-item");
        sleep(ConstHelper.NUMBER_10000_MLS);
    }

    private static void selectRandomVisibleOption(String selector) {
        // Filter out hidden elements
        $$(selector).filter(visible).shouldHave(CollectionCondition.sizeGreaterThan(0));

        // Get all visible options
        ElementsCollection visibleOptions = $$(selector).filter(visible);

        // Select a random option from the visible options
        int optionsCount = visibleOptions.size();
        int randomIndex = (int) (Math.random() * optionsCount);
        visibleOptions.get(randomIndex).shouldBe(visible, enabled).click();
    }

    public static void uploadImage(String fileInputSelector, String imagePath) {
        // Find the file input element and upload the image
        $(fileInputSelector).uploadFile(new java.io.File(imagePath));
    }

    public static void checkUploadedImage() {
        // Check if the uploaded image exists by checking the alt attribute
        $(".ant-upload-picture-card-wrapper img").shouldBe(visible);
    }

    public static String getAbsolutePath(String relativePath) {
        return Thread.currentThread().getContextClassLoader().getResource(relativePath).getPath();
    }

    public static void setDateInDatePicker(String targetDate) {
        // Parse the target date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = dateFormat.parse(targetDate);
        } catch (Exception e) {
            throw new RuntimeException("Error parsing date: " + e.getMessage());
        }

        // Open the date picker if not open already
        $(".ant-picker").shouldBe(visible);

        // Click on the day in the calendar
        findDayInCalendar(date);
    }

    public static void findDayInCalendar(Date targetDate) {
        // Calculate day, month, and year
        Calendar cal = Calendar.getInstance();
        cal.setTime(targetDate);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH) + 1; // Month is zero-based
        int year = cal.get(Calendar.YEAR);

        // Click on the day in the calendar
        $$(".ant-picker-cell").findBy(text(Integer.toString(day))).click();
    }
}
