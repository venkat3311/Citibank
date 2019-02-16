package com.CucumberFramework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicesAnalysisPage {
    public InvoicesAnalysisPage(){
        PageFactory.initElements(utilities.Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[.='Invoices Analysis']")
    public WebElement invoicesAnalysisPageTitle;

    @FindBy(className = "o_searchview_input")
    public WebElement search;

    @FindBy(className = "o_graph_svg_container")
    public WebElement graph;

    @FindBy(xpath = "(//div[@class='btn-group btn-group-sm']/button)[1]")
    public WebElement Measures;

    @FindBy(linkText = "Total Without Tax")
    public WebElement totalWithoutTax;


}
