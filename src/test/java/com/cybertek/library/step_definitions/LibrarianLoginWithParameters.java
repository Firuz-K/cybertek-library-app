package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginWithParametersPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class LibrarianLoginWithParameters {
    LoginWithParametersPage paramLogin = new LoginWithParametersPage();
    @When("Librarian enters {string} and {string} and hits enter")
    public void librarian_enters_and_and_hits_enter(String userName, String Password) {

        paramLogin.userNameBox.sendKeys(userName);
        paramLogin.passwordBox.sendKeys(Password+ Keys.ENTER);
    }
}
