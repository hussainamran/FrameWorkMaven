package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {
    @When("user click on Pim Option")
    public void user_click_on_pim_option() {
        WebElement pimOption=driver.findElement(By.id("menu_pim_viewPimModule"));
        pimOption.click();
    }

    @When("user click on Add employee button")
    public void user_click_on_add_employee_button() {
       WebElement addEmployeeButton=driver.findElement(By.id("menu_pim_addEmployee"));
       addEmployeeButton.click();
    }
    @When("user enter firstname and lastname")
    public void user_enter_firstname_and_lastname() {
        WebElement firstname=driver.findElement(By.id("firstName"));
        firstname.sendKeys("Amran");
        WebElement lastname= driver.findElement(By.id("lastName"));
        lastname.sendKeys("King");
    }
    @When("user click on save button")
    public void user_click_on_save_button() {
       WebElement savebutton= driver.findElement(By.id("btnSave"));
       savebutton.click();
    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added successfully");
    }

    @When("user enter {string} {string} and {string}")
    public void user_enter_and(String firstName, String middleName, String lastName) {
        WebElement firstnameLoc=driver.findElement(By.id("firstName"));
        firstnameLoc.sendKeys(firstName);
        WebElement middlenameLoc=driver.findElement(By.id("middleName"));
        middlenameLoc.sendKeys(middleName);
        WebElement lastnameLoc= driver.findElement(By.id("lastName"));
        lastnameLoc.sendKeys(lastName);

    }
    @Given("user enter direct data {string} {string} and {string}")
    public void user_enter_direct_data_and(String firstName, String middleName, String lastName) {
        WebElement firstnameLoc=driver.findElement(By.id("firstName"));
        firstnameLoc.sendKeys(firstName);
        WebElement middlenameLoc=driver.findElement(By.id("middleName"));
        middlenameLoc.sendKeys(middleName);
        WebElement lastnameLoc= driver.findElement(By.id("lastName"));
        lastnameLoc.sendKeys(lastName);
    }
    @When("user add multiple employees and verify they are added")
    public void user_add_multiple_employees_and_verify_they_are_added(DataTable dataTable) throws InterruptedException {

        List<Map<String, String>>employeeNames=dataTable.asMaps();

        for (Map<String, String> emp:employeeNames){
            String firstNameValue=emp.get("firstName");
            String middleNameValue=emp.get("middleName");
            String lastNameValue=emp.get("lastName");

            WebElement firstnameLoc=driver.findElement(By.id("firstName"));
            firstnameLoc.sendKeys(firstNameValue);
            WebElement middlenameLoc=driver.findElement(By.id("middleName"));
            middlenameLoc.sendKeys(middleNameValue);
            WebElement lastnameLoc= driver.findElement(By.id("lastName"));
            lastnameLoc.sendKeys(lastNameValue);

            WebElement savebutton= driver.findElement(By.id("btnSave"));
            savebutton.click();

            Thread.sleep(5000);

            //to come back again on add employee screen because hooks and background works just one time
            WebElement addEmployeeButton=driver.findElement(By.id("menu_pim_addEmployee"));
            addEmployeeButton.click();

        }
    }

}


