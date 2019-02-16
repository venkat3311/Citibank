package com.CucumberFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    //Sign in
    @FindBy(linkText="BriteErpDemo")
    public WebElement database;

    @FindBy(id="login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;



    public void login(String usr, String pass) {
        database.click();
        email.sendKeys(usr);
        password.sendKeys(pass);
        loginButton.click();
    }

    public void open() {
        utilities.Driver.getDriver().get(utilities.ConfigurationReader.getProperty("url"));

    }
}
