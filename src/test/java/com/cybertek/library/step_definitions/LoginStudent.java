package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.HomePage;
import com.cybertek.library.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStudent {

HomePage homePage= new HomePage();

    @When("Student enters username and password and hits enter")
    public void student_enters_username_and_password_and_hits_enter() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginStudent();

    }


    @Then("User should see Borrowing books")
    public void userShouldSeeBorrowingBooks() {

        homePage.visibilityOfBorrowingBooks();

    }
}
