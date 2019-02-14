package com.CucumberFramework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentTermsPage extends MenuPage {



    public PaymentTermsPage() { PageFactory.initElements(utilities.Driver.getDriver(), this); }

    @FindBy(xpath = "//li[.='#Inbox']")
    public WebElement hashTagInbox;

    @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'Invoicing')]")
    public WebElement invoicing;

    @FindBy(xpath = "//div[contains(text(),'Sales')]")
    public WebElement Sales;

    @FindBy(xpath = "//a[@data-menu='219']")
    public WebElement configurationManagement;

    @FindBy(xpath = "(//ul[@class='oe_secondary_submenu nav nav-pills nav-stacked']/li/a)[45]")
    public WebElement paymentTerms;

    @FindBy (xpath = "//li[contains(text(),'Payment Terms')]")
    public WebElement paymentTermsHeader;

    @FindBy(css = "div.o_cp_left>div>div>button:first-of-type")
    public WebElement paymentCreate;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement paymentTermsTextBox;

    @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]")
    public WebElement paymentTermSaveButton;

    @FindBy(xpath = "//textarea[@placeholder='Payment terms explanation for the customer...']")
    public WebElement explanation;

    @FindBy(xpath = "//input[@id='o_field_input_542']")
    public WebElement activeCheckBox;

    @FindBy(xpath = "//button[@name='delete']")
    public WebElement termsTrash;

    @FindBy(xpath = "//a[contains(text(),'Add an item')]")
    public WebElement addItem;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement createTermsTitle;

    @FindBy(xpath = "//input[@id='radio63_balance']")
    public WebElement balanceRadio;

    @FindBy(xpath = "//input[@id='radio421_percent']")
    public WebElement percentRadio;

    @FindBy(xpath = "//input[@id='radio421_fixed']")
    public WebElement fixedRadio;

    @FindBy(xpath = "//input[@id='radio427_day_after_invoice_date']")
    public WebElement afterDateRadio;

    @FindBy(xpath = "//input[@id='radio427_fix_day_following_month']")
    public WebElement afterMonthRadio;

    @FindBy(xpath = "//input[@id='radio427_last_day_following_month']")
    public WebElement lastFollowingMonthRadio;

    @FindBy(xpath = "//input[@id='radio427_last_day_current_month']")
    public WebElement lastCurrentMonthRadio;

    @FindBy(xpath = "//span[contains(text(),'Save & New')]")
    public WebElement saveAndNew;

    @FindBy(xpath = "//span[contains(text(),'& Close')]")
    public WebElement saveAndClose;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement nameOnHeader;

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul[2]/li/ul/li[6]/a")
    public WebElement logout;


}
