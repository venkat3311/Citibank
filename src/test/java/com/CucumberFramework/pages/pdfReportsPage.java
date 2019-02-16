package com.CucumberFramework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pdfReportsPage {

    public pdfReportsPage(){
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/web#menu_id=199&action=\"]")
    public WebElement invoicingLink;

    @FindBy(xpath = "//li[.=\"#Inbox\"]")
    public WebElement hasTagInbox;

    @FindBy(xpath="//a[@data-menu='216']")
    public WebElement pdfReports;

    @FindBy(xpath = "//a[@data-action-id='332']")
    public WebElement journalAudit;

    @FindBy(xpath = "(//input[@class='o_radio_input'])[1]")
    public WebElement allPostedEntries;

    @FindBy(xpath = "(//input[@class='o_radio_input'])[4]")
    public WebElement journalEntryNumber;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public  WebElement journalsDropDown;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[1]/a")
    public WebElement firstOptionFromDropDown;

    @FindBy(xpath = "//*[@id=\"modal_131\"]/div/div/div[2]/div/div/div/table[2]/tbody/tr/td[2]/div")
    public WebElement journalsWindow;

    @FindBy(xpath = "//*[@id=\"modal_131\"]/div/div/div[2]/div/div/div/table[2]/tbody/tr/td[2]/div/span[10]/span[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='btn btn-sm oe_highlight']")
    public WebElement printButton;

    @FindBy(xpath = "//a[@class='fa fa-times o_close']")
    public WebElement popup;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement nameOnHeader;

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul[2]/li/ul/li[6]/a")
    public WebElement logout;


}
