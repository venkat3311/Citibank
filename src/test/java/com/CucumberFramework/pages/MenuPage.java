package com.BriteERP.page;


import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class MenuPage{


        public MenuPage() { PageFactory.initElements(Driver.getDriver(),this); }

        @FindBy(linkText = "Invoicing")
        public WebElement invoicing;

        @FindBy(xpath = "//div[@class='o_sub_menu_content']/div[8]/div[1]")
        public WebElement salesOption;

        @FindBy(xpath = "//a[@data-menu='201']")
        public WebElement documentsUnderSales;

        @FindBy(xpath="//a[@data-menu='239']")
        public WebElement customerInvoices;

        @FindBy(xpath="//a[@data-menu='240'")
        public WebElement customerCreditNotes;

        @FindBy(xpath="//a[@data-menu='223']")
        public WebElement paymentsUnderDocuments;

        @FindBy(xpath="//a[@data-menu='203']")
        public WebElement masterData1;

        @FindBy(xpath="//span[contains(text(),'Customers')]")
        public WebElement customers;

        @FindBy(xpath="//a[@data-action-id='295']")
        public WebElement sellableProducts;

        @FindBy(xpath="//a[@data-menu='205']")
        public WebElement documentsUnderPurchases;

        @FindBy(xpath="//a[@data-menu='241']")
        public WebElement vendorBillsUnderPurchases;

        @FindBy(xpath="//a[@data-menu='242']")
        public WebElement vendorCreditNotes;

        @FindBy(xpath="//a[@data-menu='224']")
        public WebElement paymentsUnderPurchases;

        @FindBy(xpath="//a[@data-menu='206']")
        public  WebElement masterData2;

        @FindBy(xpath="//a[@data-menu='236']")
        public WebElement vendorsUnderMasterData;

        @FindBy(xpath="//a[@data-menu='235']")
        public WebElement purchasableProducts;

        @FindBy(xpath = "//a[@data-menu='213']")
        public WebElement managementUnderReporting;

        @FindBy(xpath="//a[@data-menu='216']")
        public WebElement pdfReports;

        @FindBy(xpath="//a[@data-menu='218']")
        public WebElement accountingConfiguration;

        @FindBy(xpath="//a[@data-menu='229']")
        public WebElement taxesAccounting;

        @FindBy(xpath="//a[@data-menu='243']")
        public WebElement fiscalPosition;

        @FindBy(xpath="//a[@data-menu='226']")
        public WebElement bankAccounts;

        @FindBy(xpath="//a[@data-menu-xmlid='account.menu_action_account_journal_form']")
        public WebElement journalsUnderAccounting;

        @FindBy(xpath="//a[@data-menu='219']")
        public WebElement managementConfiguration;

        @FindBy(xpath="//a[@data-menu='440']")
        public WebElement paymentsConfiguration;

        @FindBy(xpath="//a[@data-menu='441']")
        public WebElement paymentAcquirement;

        @FindBy(xpath = "//span[@class='oe_topbar_name']")
        public WebElement nameOnHeader;

        @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul[2]/li/ul/li[6]/a")
        public WebElement logout;

        //this is webElement for Bank account page under Config
        @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_list_button_add']")
        public WebElement create;

        //This is WebElement for Bank Account page under Config;
        @FindBy(xpath="//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
        public WebElement bankAccountName;

        //This is bankAccount number webElement for Config Accounting pages;
        @FindBy(xpath="//input[@name='bank_acc_number']")
        public WebElement bankAccountNumber;

        //this is Create button on Journals page under Config tab
        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
        public WebElement createJournals;

        //This is Import button on Journals page under Config tab
        @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
        public WebElement importJournals;






    }

