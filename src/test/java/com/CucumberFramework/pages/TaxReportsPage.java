package com.CucumberFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaxReportsPage extends TestBase {

  public TaxReportsPage(){
      PageFactory.initElements(utilities.Driver.getDriver(), this);
  }

    @FindBy(linkText = "Invoicing")
    public WebElement invoicingLink;

    @FindBy(xpath = "//li[.=\"#Inbox\"]")
    public WebElement hasTagInbox;

    @FindBy(xpath="//a[@data-menu='216']")
    public WebElement pdfReports;

    @FindBy(xpath = "//a[@data-action-id='346']")
    public WebElement taxReports;

    @FindBy(xpath = "//input[@name='date_from']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@name='date_to']")
    public WebElement endDate;

    @FindBy(xpath = "//button[@name='check_report']/span")
    public WebElement printButton;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement errMessage;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement xIcon;
    @FindBy(xpath = "//a[@class='fa fa-times o_close']")
    public WebElement popup;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement nameOnHeader;

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul[2]/li/ul/li[6]/a")
    public WebElement logout;
}
