package com.CucumberFramework.pages;


import org.openqa.selenium.support.PageFactory;

public class MenuTabsPage extends MenuPage{

    public MenuTabsPage() {
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }
}
