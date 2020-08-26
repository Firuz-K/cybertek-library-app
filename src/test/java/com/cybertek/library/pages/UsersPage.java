package com.cybertek.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsersPage  extends BasePage{


    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showNumberOfRecords;

    @FindBy(xpath = "//th")
    public List<WebElement> headers;
}
