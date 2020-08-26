package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.HomePage;
import com.cybertek.library.pages.UsersPage;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ShowRecordsStep_Def {
HomePage homePage = new HomePage();
UsersPage usersPage = new UsersPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
Select select ;

    @When("I click on {string} link")
    public void i_click_on_link(String user) {

        switch (user){
            case "Users":
               homePage.clickingOnUsers();
               break;
            case "Books":
                homePage.clickingOnBooks();
                break;
        }
    }

    @Then("show records default value should be {int}")
    public void showRecordsDefaultValueShouldBe(int expected) {
        wait.until(ExpectedConditions.visibilityOf(usersPage.showNumberOfRecords));
        select= new Select(usersPage.showNumberOfRecords);
        String actual =select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected+"",actual);
    }


    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> options) {

        System.out.println("=====================================");
        System.out.println(options.size());
        System.out.println(options);

        wait.until(ExpectedConditions.visibilityOf(usersPage.showNumberOfRecords));
        select= new Select(usersPage.showNumberOfRecords);
       List<WebElement> webElements =select.getOptions();
        List<String> actualTexts = BrowserUtils.getElementsText(webElements);

        Assert.assertEquals(options, actualTexts);
    }




}
