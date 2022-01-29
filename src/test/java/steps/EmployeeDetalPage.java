package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class EmployeeDetalPage extends CommonMethods {



    @When("user click on employee ID")
    public void user_click_on_employee_id() {
       // waitForClickAbility(employeeDetalPage.ClickEmpID);
        //getWait().until(ExpectedConditions.elementToBeClickable(employeeDetalPage.ClickEmpID)).click();
       click(employeeDetalPage.ClickEmpID);
    }

    @When("user click on edit button")
    public void user_click_on_edit_button() {
      //click(employeeDetalPage.EditButton);
      waitForClickAbility(employeeDetalPage.EditButton);
      click(employeeDetalPage.EditButton);

    }
    @Then("verify the Personal Details page")
    public void verify_the_personal_details_page() {
        WebElement task=driver.findElement(By.xpath("//*[@id=\"pdMainContainer\"]/div[1]/h1"));
        String expected=task.getText();
        System.out.println(task.isDisplayed());
    }
    @When("user can able to edit all personal detial fields")
    public void user_can_able_to_edit_all_personal_detial_fields() {
        //Emil's edit start
       // waitForClickAbility(employeeDetalPage.FnameFiled);

        //Emil's edit end

        sendText(employeeDetalPage.FnameFiled, "Amran");
        getWait();
        sendText(employeeDetalPage.MnameFiled, "AH");
        sendText(employeeDetalPage.LnameFiled, "Hussain");
        sendText(employeeDetalPage.EmployeeIDFiled,"123456745");
        sendText(employeeDetalPage.OtherIdDFiled, "3123455556");
        sendText(employeeDetalPage.DriverLicIDFiled, "A27477848");
        waitForClickAbility(employeeDetalPage.LicenseExpiryDateDFiled);
        sendText(employeeDetalPage.LicenseExpiryDateDFiled, "2028-12-23");
        sendText(employeeDetalPage.SSNIDFiled, "234-23-2332");
        sendText(employeeDetalPage.ReenterSSNIDFiled, "234-23-2332");
        click(employeeDetalPage.GenderFiled);


        selectDropDown(employeeDetalPage.SelectMarriedStatusFiled, "Married");
        selectDropDown(employeeDetalPage.SelectNatiFiled, "American");
        sendText(employeeDetalPage.DateofBirthFiled, "1919-02-12");
        sendText(employeeDetalPage.NicknameFiled, "Amran");
        sendText(employeeDetalPage.MilitaryFiled, "Army");
        waitForClickAbility(employeeDetalPage.ClickSmokeBox);
        jsClick(employeeDetalPage.ClickSmokeBox);
        // click(employeeDetalPage.ClickSmokeBox);
        click(employeeDetalPage.SaveButton);

    }

    @When("user click on the personal detial save button")
    public void user_click_on_the_personal_detial_save_button() {
        click(employeeDetalPage.SaveButton);


    }

    @Then("all the detial personal information is saved")
    public void all_the_detial_personal_information_is_saved() {
        System.out.println("The test is passed");

    }


}
