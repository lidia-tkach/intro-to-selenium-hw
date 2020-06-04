package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "username")
    protected WebElement username;

    @FindBy(how = How.ID, using = "password")
    protected WebElement password;

    @FindBy(how = How.CSS, using = ".fa")
    protected WebElement login;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String text) {
        username.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        password.sendKeys(text);
        return this;
    }

    public LoginPage clickLogin() {
        login.click();
        return this;
    }
}