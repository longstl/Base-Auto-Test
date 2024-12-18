package com.example.basepj.image;

import com.codeborne.selenide.SelenideElement;
import com.example.basepj.helper.constant.ImagePath;

import static com.codeborne.selenide.Selenide.$x;

public class ImageElementTest {
    public SelenideElement showImgPath = $x(ImagePath.SHOW_IMG_PATH);
    public SelenideElement deleteImgPath = $x(ImagePath.DELETE_IMG_PATH);
    public SelenideElement uploadImgPath = $x(ImagePath.UPLOAD_IMG_PATH);
    public SelenideElement btnUpdate = $x(ImagePath.BTN_UPLOAD);
}
