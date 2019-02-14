package com.CucumberFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgedPartnerBalancePage {
    public AgedPartnerBalancePage(){
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    @FindBy(linkText = "Invoicing")
    public WebElement invoicingLink;

    @FindBy(xpath = "//li[.=\"#Inbox\"]")
    public WebElement hasTagInbox;

    @FindBy(xpath="//a[@data-menu='216']")
    public WebElement pdfReports;

    @FindBy(xpath = "//a[@data-action-id='339']")
    public WebElement agedPartnerBalance;

    @FindBy(xpath = "//input[@data-value='customer']")
    public WebElement receivableAccount;

    @FindBy(xpath = "//input[@data-value='posted']")
    public WebElement allPostedEntries;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement agedPartnerBalanceText;

    @FindBy(xpath = "//button[@name='check_report']")
    public WebElement printButton;

    @FindBy(xpath = "//input[@name='date_from']")
    public WebElement date;

    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement errorMsg;

    @FindBy(xpath = "(//label[@class='o_form_label'])[1]")
    public WebElement text;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement xIcon;


}


