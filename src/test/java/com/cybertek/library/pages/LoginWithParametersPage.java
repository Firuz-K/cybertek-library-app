package com.cybertek.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWithParametersPage extends BasePage {



    @FindBy(xpath = "//*[@id='inputEmail']")
    public WebElement userNameBox;

    @FindBy (xpath = "//*[@id='inputPassword']")
    public WebElement passwordBox;



}
