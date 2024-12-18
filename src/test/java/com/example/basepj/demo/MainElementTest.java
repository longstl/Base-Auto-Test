package com.example.basepj.demo;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainElementTest {
    public SelenideElement searchBoxElement = $x("//textarea[@name='q']");
}
