package com.CucumberFramework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChannelInboxPage {
    public ChannelInboxPage(){ PageFactory.initElements(utilities.Driver.getDriver(), this); }

    @FindBy(xpath = "//a[@data-menu-xmlid='account.menu_finance']//span")
    public WebElement invoicingLink;
    //span[@class='oe_menu_text'][contains(text(),'Invoicing')]


    @FindBy(xpath = "//div[@class='o_loading'][@style='display: none;']")
    public WebElement uiLoading;

    @FindBy(id = "ui-id-2")
    public WebElement uiLoaded;

    @FindBy(xpath = "//li[.=\"#Inbox\"]")
    public WebElement hasTagInbox;

    public void navigateToInvoicing(){
        invoicingLink.click();
    }
}
