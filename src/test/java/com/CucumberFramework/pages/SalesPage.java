package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage extends MenuPage {

    public SalesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Invoicing")
    public WebElement invoicing;

    @FindBy(xpath = "//a[@data-menu='239']")
    public WebElement customerInvoices;

    @FindBy(xpath = "//span[contains(text(), 'Documents')][1]")
    public WebElement salesDocuments;

    @FindBy(xpath = "//span[contains(text(), 'Customer Invoices')]")
    public WebElement salesDocCustomerInvoices;

    @FindBy(xpath = "//span[contains(text(), 'Customer Credit Notes')]")
    public WebElement salesDocCustomerCreditNotes;

    @FindBy(xpath = "//span[contains(text(), 'Payments')][1]")
    public WebElement salesDocPayments;

    @FindBy(xpath = "//tbody/tr[5]/td[1]")
    public WebElement salesCheckbox;

    @FindBy(xpath = "//button[contains(text(), 'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//button[contains(text(), 'Print')]")
    public WebElement printButton;

    @FindBy(xpath = "//button[contains(text(), 'Create')]")
    public WebElement createButton;

    @FindBy(xpath = " //*[.='New']")
    public WebElement newInvoice;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[4]/div[3]/table[1]/tbody/tr[1]/td[2]/div/div")
    public WebElement customerDropDown;

//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/ul/li[4]")
//    public WebElement anyCustomer;

    @FindBy (xpath = ".//*[@class = 'ui-menu-item'][2]/a")
    public WebElement anyCustomer;

    @FindBy(xpath = "//*[.='Validate']")
    public WebElement validateButton;

    @FindBy(xpath=".//*[@class='modal-content']")
    public WebElement iFrame;

    @FindBy(xpath= ".//*[@class='btn btn-sm btn-primary']")
    public WebElement iFrameOKbutton;

    @FindBy(xpath = "//*[.='Invoice Created']")
    public WebElement customerInvInfo;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/ul/li[4]/span")
    public WebElement newCustomer;

    @FindBy(xpath = "//table[1]/tbody/tr[1]/td[2]/div[@name=\"partner_id\"]/div/input")
    public WebElement verifyCustomer;

    @FindBy(xpath = "//*[.='New']")
    public WebElement newNote;

    @FindBy(css = "body > div.o_main > div.o_main_content > div.o_control_panel.o_breadcrumb_full > div.o_cp_left > div.o_cp_buttons > div > div.o_form_buttons_edit > button.btn.btn-default.btn-sm.o_form_button_cancel")
    public WebElement discard;

    @FindBy(css = "body > div.o_main > div.o_main_content > div.o_control_panel > div.o_cp_left > div.o_cp_buttons > div > button.btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement createBtn;

    @FindBy(xpath = "//tr[5]/td[5]")
    public WebElement paymMethod;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement payments;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[1]/ul/li[3]/a/span")
    public WebElement payMents;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[1]/button")
    public WebElement printBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement attachmentsBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/button")
    public WebElement actionBtn;

    public boolean buttonSelected(WebElement radioElement) {
        if (!radioElement.isSelected()) {
            radioElement.click();
        }
        return true;
    }
}


