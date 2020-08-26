package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginLibrarian {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("Librarian enters username and password and hits enter")
    public void librarian_enters_username_and_password_and_hits_enter() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginLibrarian();
        System.out.println(Driver.getDriver().getTitle());
    }

    @Then("User should be on the homepage")
    public void user_should_be_on_the_homepage() throws InterruptedException {

        Thread.sleep(1000);

        Assert.assertEquals(Driver.getDriver().getTitle(), "Library");

    }

}


