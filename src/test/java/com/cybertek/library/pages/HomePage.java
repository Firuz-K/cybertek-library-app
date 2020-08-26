package com.cybertek.library.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {


    @FindBy(xpath = "//*[contains(text(),'Borrowing Book')]")
    private WebElement BorrowingBooks;

    public void visibilityOfBorrowingBooks(){
        wait.until(ExpectedConditions.visibilityOf(BorrowingBooks));
        Assert.assertTrue(BorrowingBooks.isDisplayed());
    }

    @FindBy(xpath = "//span[contains(text(),'Users')]")
    private WebElement Users;

    public void clickingOnUsers(){
        wait.until(ExpectedConditions.visibilityOf(Users)).click();
    }

    @FindBy(xpath = "//span[contains(text(),'Books')]")
    private WebElement Books;

    public void clickingOnBooks(){
        wait.until(ExpectedConditions.visibilityOf(Books)).click();
    }



    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']/span")
    public WebElement DisplayUsername;




}
