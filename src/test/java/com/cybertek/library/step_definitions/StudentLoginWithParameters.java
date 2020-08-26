package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.HomePage;
import com.cybertek.library.pages.LoginWithParametersPage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentLoginWithParameters {

    LoginWithParametersPage paramLogin = new LoginWithParametersPage();
    HomePage homePage=new HomePage();
    WebDriverWait wait= new WebDriverWait(Driver.getDriver(),5);

    @When("Student enters {string} and {string} and hits enter")
    public void student_enters_and_and_hits_enter(String userName, String Password) {

        paramLogin.userNameBox.sendKeys(userName);
        paramLogin.passwordBox.sendKeys(Password+ Keys.ENTER);

    }

    @Then("Account holder name should be {string}")
    public void accountHolderNameShouldBe(String expected) {



        wait.until(ExpectedConditions.visibilityOf(homePage.DisplayUsername));
        String actual=homePage.DisplayUsername.getText();
        Assert.assertEquals("Actual and expected do not match",expected,actual);

        Driver.closeDriver();
    }
}
