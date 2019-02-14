package com.CucumberFramework.pages;


import org.openqa.selenium.support.PageFactory;

public class ConfigurationPage extends MenuPage {
    public ConfigurationPage() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_list_button_add']")
    //public WebElement create;
}