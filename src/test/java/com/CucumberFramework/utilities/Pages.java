package com.CucumberFramework.utilities;


import com.CucumberFramework.pages.*;

public class Pages {


    private LoginPage loginPage;
    private PurchasesPage purchasesPage;
    private MenuTabsPage menuTabsPage;
    private InvoicesAnalysisPage invoicesAnalysisPage;
    private CustomerInvoicesPage customer_invoicesPage;
    private ChannelInboxPage channelInboxPage;
    private ConfigurationPage configurationPage;
    private PaymentTermsPage paymentTermsPage;
    private SalesPage salesPage;

    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public PurchasesPage purchases() {
        if (purchasesPage == null) {
            purchasesPage = new PurchasesPage();
        }
        return purchasesPage;
    }

    public MenuTabsPage menu() {
        if (menuTabsPage == null) {
            menuTabsPage = new MenuTabsPage();
        }
        return menuTabsPage;

    }

    public InvoicesAnalysisPage getInvoicesAnalysisPage() {
        if (invoicesAnalysisPage == null) {
            invoicesAnalysisPage = new InvoicesAnalysisPage();
        }
        return invoicesAnalysisPage;
    }

    public CustomerInvoicesPage getCustomer_invoicesPage() {
        if (customer_invoicesPage == null) {
            customer_invoicesPage = new CustomerInvoicesPage();
        }
        return customer_invoicesPage;
    }

    public ChannelInboxPage getChannelInboxPage() {
        if (channelInboxPage == null) {
            channelInboxPage = new ChannelInboxPage();
        }
        return channelInboxPage;
    }

    public ConfigurationPage config() {
        if (configurationPage == null) {
            configurationPage = new ConfigurationPage();
        }
        return configurationPage;

    }

    public PaymentTermsPage Payment() {
        if (paymentTermsPage == null) {
            paymentTermsPage = new PaymentTermsPage();
        }
        return paymentTermsPage;
    }

    public SalesPage documents() {
        if (salesPage == null) {
            salesPage = new SalesPage();
        }
        return salesPage;
    }
}
