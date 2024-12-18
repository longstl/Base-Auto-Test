package com.example.basepj.main_landing;

import com.codeborne.selenide.SelenideElement;
import com.example.basepj.helper.constant.MainLandingPagePath;

import static com.codeborne.selenide.Selenide.$x;

public class MainLandingElementTest {
    public SelenideElement homePathElement = $x(MainLandingPagePath.ELEMENT_HOME);
    public SelenideElement productPathElement = $x(MainLandingPagePath.ELEMENT_PRODUCT);
    public SelenideElement contactPathElement = $x(MainLandingPagePath.ELEMENT_CONTACT);
    // scroll to footer
    public SelenideElement productInfoPathElement = $x(MainLandingPagePath.ELEMENT_PRODUCT_INFO);
    public SelenideElement turnOfServicePathElement = $x(MainLandingPagePath.ELEMENT_TURN_OF_SERVICE);
    public SelenideElement platformSolutionPathElement = $x(MainLandingPagePath.ELEMENT_PLATFORM_SOLUTION);
    public SelenideElement documentPathElement = $x(MainLandingPagePath.ELEMENT_DOCUMENT);
}
