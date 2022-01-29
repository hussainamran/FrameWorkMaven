package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class EmployeeDetalPage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
    public WebElement ClickEmpID;

    /*@FindBy(xpath = "//td[@class='left']/a")
    public WebElement ClickEmpID;*/

    @FindBy(xpath = "//input[@value='Edit']")
    public WebElement EditButton;

    @FindBy(xpath = "//*[@id=\"pdMainContainer\"]/div[1]/h1")
    public WebElement PersonalDetial;

    @FindBy(xpath = "//input[@id='personal_txtEmpFirstName']")
    public WebElement FnameFiled;

    @FindBy( id= "personal_txtEmpMiddleName")
    public WebElement MnameFiled;

    @FindBy( id= "personal_txtEmpLastName")
    public WebElement LnameFiled;

    @FindBy( xpath="//input[@id='personal_txtEmployeeId']")
    public WebElement EmployeeIDFiled;

    @FindBy( id= "personal_txtOtherID")
    public WebElement OtherIdDFiled;

    @FindBy( id= "personal_txtLicenNo")
    public WebElement DriverLicIDFiled;

    @FindBy (xpath = "//*[@id=\"personal_txtLicExpDate\"]")
    public WebElement LicenseExpiryDateDFiled;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement LicenseExpireyear;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement LicenseExpiremonth;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")
    public WebElement LicenseExpireday;

    @FindBy( id= "personal_txtNICNo")
    public WebElement SSNIDFiled;

    @FindBy( id= "personal_txtSINNo")
    public WebElement ReenterSSNIDFiled;

    @FindBy( id= "personal_optGender_1")
    public WebElement GenderFiled;

    @FindBy( id= "personal_cmbMarital")
    public WebElement SelectMarriedStatusFiled;

    @FindBy( xpath= "//*[@id=\"personal_cmbNation\"]")
    public WebElement SelectNatiFiled;

    @FindBy( id= "personal_DOB")
    public WebElement DateofBirthFiled;

    @FindBy( xpath= "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement year;


    @FindBy( id= "personal_txtEmpNickName")
    public WebElement NicknameFiled;

    @FindBy(xpath = "//*[@id=\"personal_chkSmokeFlag\"]")
    public WebElement ClickSmokeBox;

    @FindBy( id= "personal_txtMilitarySer")
    public WebElement MilitaryFiled;

    @FindBy(id="btnSave")
    public WebElement SaveButton;

    public EmployeeDetalPage(){
        PageFactory.initElements(driver, this);
    }



}
