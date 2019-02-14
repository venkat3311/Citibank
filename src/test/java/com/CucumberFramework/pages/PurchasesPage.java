package com.CucumberFramework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasesPage extends MenuPage {

    public PurchasesPage(){ PageFactory.initElements(utilities.Driver.getDriver(), this); }

    @FindBy(xpath = "//div[@class='o_list_buttons']/button")
    public WebElement createVendorBills;

  //  @FindBy(xpath = "(//div[@class='o_input_dropdown']/span)[1]")
    @FindBy(xpath = "(//div[@class='o_group']/table/tbody/tr/td/div/div/input)[1]")
    public WebElement vendorDropDown;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[9]/a")
    public WebElement vendorCreateAndEdit;

    @FindBy(xpath = "//div[@class='modal-header']/h4")
    public WebElement createVendor;

    @FindBy(xpath = "//div[@class='o_radio_item'][1]/input")
    public WebElement individualRadioButton;

    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']/button[1]")
    public WebElement meetingsButtonHeader;

    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']/button[2]")
    public WebElement onWebsiteButtonHeader;

    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']/button[3]")
    public WebElement vendorBillsButtonHeader;

    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']/button[4]")
    public WebElement activeButtonHeader;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_address_street'][1]")
    public WebElement addressStreet;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_address_street'][2]")
    public WebElement addressStreet2;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_address_city']")
    public WebElement city;

    @FindBy(xpath = "//div[@class='o_field_widget o_field_many2one o_address_state']/div/input")
    public WebElement state;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_address_zip']")
    public WebElement zip;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[13]")
    public WebElement country;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input'])[3]")
    public WebElement tin;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[14]")
    public WebElement tags;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input'])[4]")
    public WebElement jobPosition;

    @FindBy(xpath = "//input[@class='o_field_url o_field_widget o_input']")
    public WebElement website;

    @FindBy(xpath = "(//select[@class='o_input o_field_widget'])[1]")
    public WebElement language;

    @FindBy(xpath = "(//input[@class='o_radio_input'])[2]")
    public WebElement companyRadioButton;

    @FindBy(xpath = "//div[@class='oe_title']/h1/input")
    public WebElement companyName;

    @FindBy(xpath = "//body[@class='o_web_client modal-open']/ul[12]/li[1]/a")
    public WebElement maSelection;

    @FindBy(xpath = "//div[@class='o_field_many2manytags o_input o_field_widget']/div/div")
    public WebElement tagsEmployeeOption;

  @FindBy(xpath = "(//input[@class='o_field_phone o_field_widget o_input'])[1]")
  public WebElement phone;

  @FindBy(xpath = "//input[@class='o_field_email o_field_widget o_input']")
  public WebElement email;

  @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']/span")
  public WebElement saveNewVendor;

  @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
  public WebElement saveButtonOnTop;

  @FindBy(xpath = "(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr/td[2])[1]")
  public WebElement apex;

 // @FindBy(xpath = "(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[" + i + "]/td[10])[1]")
//  public WebElement statusInTable;

  @FindBy(xpath = "//span[@class='o_pager_counter']/span[2]")
  public WebElement totalInvoices;

  @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editVendorBills;

  @FindBy(xpath = "(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped o_editable_list']/tbody/tr/td/a)[1]")
    public WebElement addAnItem;

  @FindBy(xpath = "(//div[@class='o_input_dropdown'])[4]/input")
    public WebElement product;

  @FindBy(xpath = "(//input[@class='o_field_float o_field_number o_field_widget o_input o_required_modifier'])[1]")
  public WebElement quantity;

  @FindBy(xpath = "(//input[@class='o_field_float o_field_number o_field_widget o_input o_required_modifier'])[2]")
  public WebElement price;

  @FindBy(xpath="//table[@class='o_group o_inner_group oe_subtotal_footer oe_right o_group_col_6']/tbody/tr[3]/td[2]/span")
  public WebElement totalAmount;

    @FindBy(xpath="//div[@class='o_statusbar_buttons']")
    public WebElement validateButton;

    @FindBy(xpath="//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath="//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createCreditNotes;

    @FindBy(xpath="(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vendorCreditNotes;

    @FindBy(xpath = "(//div[@class='table-responsive']/table/tbody/tr/td/a)[1]")
    public WebElement addAnItemCreditNotes;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']/input)[4]")
    public WebElement productCreditNotes;

    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li)[1]")
    public WebElement apexDropDown;

    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li)[10]")
    public WebElement notepadDropDown;

    @FindBy(xpath = "//td[@class='o_data_cell o_list_number o_required_modifier']/input")
    public WebElement quantityToClear;

    @FindBy(xpath = "//td[@class='o_data_cell o_list_number o_required_modifier']/input")
    public WebElement quantityNotepad;

    @FindBy(xpath = "(//td[@class='o_data_cell o_list_number o_required_modifier']/input)[2]")
    public WebElement pricetoClick;

    @FindBy(xpath = "(//td[@class='o_data_cell o_list_number o_required_modifier']/input)[2]")
    public WebElement priceNotepad;

    @FindBy(xpath = "(//div[@class='o_form_view o_form_editable']/div/div/div/button)[1]")
    public WebElement validateCreditNotes;

    @FindBy(xpath = "(//div[@class='o_form_view o_form_editable']/div/div/div/button)[1]")
    public WebElement saveCreditNotes;









}
