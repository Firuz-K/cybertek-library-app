package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{


    @FindBy (xpath = "//*[@id='inputEmail']")
    private WebElement userNameBox;

    @FindBy (xpath = "//*[@id='inputPassword']")
    private WebElement passwordBox;


    public void loginStudent(){

        userNameBox.sendKeys("student11@library");
        passwordBox.sendKeys("tScBPCUr"+Keys.ENTER);
    }

    public void loginLibrarian(){

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        wait.until(ExpectedConditions.visibilityOf(userNameBox));
        userNameBox.sendKeys("librarian13@library");
        passwordBox.sendKeys("9rf6axdD"+Keys.ENTER);
    }



}
