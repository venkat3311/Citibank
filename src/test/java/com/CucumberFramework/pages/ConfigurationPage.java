package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationPage extends MenuPage {
    public ConfigurationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_list_button_add']")
    //public WebElement create;
}