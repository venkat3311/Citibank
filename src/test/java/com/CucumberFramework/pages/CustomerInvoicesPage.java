package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInvoicesPage {
    public CustomerInvoicesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid='account.account_reports_management_menu']")
    public WebElement reporting_ManagementLink;

    @FindBy(xpath = "//a[@data-menu-xmlid='account.menu_action_account_invoice_report_all']")
    public WebElement invoicesLink;

    }

